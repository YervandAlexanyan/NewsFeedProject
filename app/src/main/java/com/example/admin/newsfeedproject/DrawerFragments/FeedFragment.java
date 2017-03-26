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

import com.example.admin.newsfeedproject.FeedFragments.ArtFragment;
import com.example.admin.newsfeedproject.FeedFragments.PoliticalFragment;
import com.example.admin.newsfeedproject.FeedFragments.WeatherFragment;
import com.example.admin.newsfeedproject.R;
import com.example.admin.newsfeedproject.FeedFragments.SportFragment;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;


public class FeedFragment extends Fragment {
    ViewPager viewPager;
    private TabLayout tabLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.feed_fragment, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.feed_pager);

        setupViewPager(viewPager);
        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.news_icon);
        tabLayout.getTabAt(1).setIcon(R.drawable.sport_icon);
        tabLayout.getTabAt(2).setIcon(R.drawable.weather_icon);
        tabLayout.getTabAt(3).setIcon(R.drawable.art_icon);
    }
    private void setupViewPager(ViewPager viewPager)
    {
        FeedPagerAdapter adapter = new FeedPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new PoliticalFragment(),"Political");
        adapter.addFragment(new SportFragment(),"Sport");
        adapter.addFragment(new WeatherFragment(),"Weather");
        adapter.addFragment(new ArtFragment(),"Culture");
        viewPager.setAdapter(adapter);
    }

    class FeedPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();
        public FeedPagerAdapter(FragmentManager fm) {
            super(fm);
        }



        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }
        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
