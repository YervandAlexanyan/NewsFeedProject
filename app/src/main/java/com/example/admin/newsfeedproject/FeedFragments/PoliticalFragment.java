package com.example.admin.newsfeedproject.FeedFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;

import com.example.admin.newsfeedproject.FeedRecylerView.FeedAdapter;
import com.example.admin.newsfeedproject.FeedRecylerView.News;
import com.example.admin.newsfeedproject.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;




public class PoliticalFragment extends Fragment {
    private RecyclerView recyclerView;
    private FeedAdapter adapter;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.political_fragment, container, false);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                }, 2000);
            }
        });

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new FeedAdapter(setData(), getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }


    private List<News> setData() {
        List<News> newsList = new ArrayList<>();
        newsList.add(new News("http://edition.cnn.com/2017/03/29/politics/russia-investigation-cast-of-characters/index.html",R.drawable.news1, "Who's who in Trump-Russia saga", "CNN","Several US lawmakers and agency heads have emerged as visible, and at times controversial, figures in the investigations into connections between individuals in Trump's orbit and Russian hacking of Democratic Party groups including the Democratic National Committee and Clinton campaign adviser John Podesta."));
        newsList.add(new News("http://edition.cnn.com/2017/03/30/politics/putin-russia-us-election-denial/index.html",R.drawable.news2,"Putin slams US election meddling claims as lies", "CNN","Moscow (CNN)Russian President Vladimir Putin has described allegations that his country meddled in the 2016 US election as fictional, illusory, provocations and lies."));
        newsList.add(new News("http://www.telegraph.co.uk/news/2017/03/30/francois-hollande-tells-mrs-may-will-frustrate-hopes-swift-brexit/",R.drawable.news3,"French president Francois Hollande tells Theresa May he will frustrate her hopes of a swift Brexit deal","The Telegraph","The French president on Thursday insisted that the terms for Britain’s withdrawal from the EU must first be agreed before opening negotiations on a trade deal."));
        newsList.add(new News("http://www.telegraph.co.uk/news/2017/03/30/ken-livingstone-faces-expulsion-labour-party-appears-misconduct/",R.drawable.news4,"Ken Livingstone embroiled in new Hitler row after saying Zionists collaborated with Nazis","The Telegraph","Speaking outside the hearing, he said: He [Adolf Hitler] didn't just sign the deal, the SS set up training camps so German Jews who were going to go there could be trained to cope with a very different sort of country when they got there."));
        newsList.add(new News("http://www.bbc.com/news/world-europe-39412077",R.drawable.news6,"Turkey referendum: The ultranationalists who could sway Erdogan vote","BBC","A former interior minister and a high-profile name in Turkish politics for over two decades, 60-year-old Ms Aksener has now emerged as one of the leading figures of the No campaign in Turkey's upcoming referendum and a possible challenger to President Recep Tayyip Erdogan."));
        newsList.add(new News("http://www.bbc.com/news/uk-politics-36785814",R.drawable.news5,"Theresa May's cabinet: Who's in and who's out?","BBC","Theresa May is forming her new government after becoming Conservative prime minister. She is continuing to announce her full cabinet - but here's what we know so far. The list will be updated as new appointments are made."));
        newsList.add(new News("http://www.nbcnews.com/news/world/xi-trump-meeting-china-announces-date-key-meeting-president-n740436",R.drawable.news8,"Xi-Trump Summit: China Announces Date of Key Meeting With U.S. President","NBCNEWS","BEIJING — Chinese President Xi Jinping will travel to the United States to meet President Donald Trump at his Mar-a-Lago retreat in Florida on April 6-7, China's Foreign Ministry said on Thursday, its first official confirmation of the highly anticipated summit."));
        newsList.add(new News("http://www.lifedaily.com/story/17-most-stunning-melania-trump-photos-on-the-web/source/taboola/?utm_taboola_id=467399&utm_source=taboola#utm_medium=referral&utm_source=taboola&utm_campaign=TB-INTL2-MelaniaPhotos",R.drawable.news7,"17 Photos Of Melania That Donald Has Kept Secret","LifeDaily","If there’s one thing that Donald Trump has gotten attention for, it’s his wife Melania, an international model from Slovenia who’s 24 years his junior…"));
        long seed=System.nanoTime();
        Collections.shuffle(newsList,new Random(seed));
        return newsList;
    }
}
