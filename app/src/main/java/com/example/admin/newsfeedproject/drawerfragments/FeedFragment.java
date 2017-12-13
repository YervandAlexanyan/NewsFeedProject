package com.example.admin.newsfeedproject.drawerfragments;

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

import com.example.admin.newsfeedproject.feedfragments.ArtFragment;
import com.example.admin.newsfeedproject.feedfragments.PoliticalFragment;
import com.example.admin.newsfeedproject.R;
import com.example.admin.newsfeedproject.feedfragments.SportFragment;


import java.util.ArrayList;
import java.util.List;


public class FeedFragment extends Fragment {
    ViewPager viewPager;
    private TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.feed_fragment, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.feed_pager);

        setupViewPager(viewPager);
        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
        return view;
    }



    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.news_icon_select);
        tabLayout.getTabAt(1).setIcon(R.drawable.sport_icon_select);
        tabLayout.getTabAt(2).setIcon(R.drawable.art_icon_select);



    }

    private void setupViewPager(ViewPager viewPager) {
        FeedPagerAdapter adapter = new FeedPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new PoliticalFragment(), "Political");
        adapter.addFragment(new SportFragment(), "Sport");
        adapter.addFragment(new ArtFragment(), "Culture");
        viewPager.setAdapter(adapter);
    }

    class FeedPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();

        public FeedPagerAdapter(FragmentManager fm) {
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
