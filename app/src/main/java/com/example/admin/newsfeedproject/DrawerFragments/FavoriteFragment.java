package com.example.admin.newsfeedproject.DrawerFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.admin.newsfeedproject.FavoriteFragments.FavoriteGalleryFragment;
import com.example.admin.newsfeedproject.FavoriteFragments.FavoriteNewsFragment;
import com.example.admin.newsfeedproject.FavoriteFragments.FavoriteVideosFragment;
import com.example.admin.newsfeedproject.R;

import java.util.ArrayList;
import java.util.List;


public class FavoriteFragment extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.favorite_fragment, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.favorite_pager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

        return view;
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.favorite_news_icon_select);
        tabLayout.getTabAt(1).setIcon(R.drawable.gallery_icon_select);
        tabLayout.getTabAt(2).setIcon(R.drawable.nav_video_select);

    }

    private void setupViewPager(ViewPager viewPager) {
        FavoritePagerAdapter adapter = new FavoritePagerAdapter(getChildFragmentManager());
        adapter.addFragment(new FavoriteNewsFragment(),"News");
        adapter.addFragment(new FavoriteGalleryFragment(),"Gallery");
        adapter.addFragment(new FavoriteVideosFragment(),"Videos");
        viewPager.setAdapter(adapter);

    }

    class FavoritePagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();

        public FavoritePagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);

        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }


    }
}
