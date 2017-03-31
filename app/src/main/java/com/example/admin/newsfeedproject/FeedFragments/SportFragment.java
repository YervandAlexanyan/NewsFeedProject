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

import com.example.admin.newsfeedproject.FeedRecylerView.FeedAdapter;
import com.example.admin.newsfeedproject.FeedRecylerView.News;
import com.example.admin.newsfeedproject.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class SportFragment extends Fragment {
    private RecyclerView recyclerView;
    private FeedAdapter adapter;
    private SwipeRefreshLayout swipeRefreshLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.sport_fragment,container,false);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout_sport);
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
        recyclerView = (RecyclerView) view.findViewById(R.id.sport_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new FeedAdapter(setData(), getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }

    private List<News> setData() {
        List<News> newsList = new ArrayList<>();

        newsList.add(new News("http://www.skysports.com/boxing/news/12040/10818268/gabriel-rosado-vows-to-win-ward-gatti-style-war-with-martin-murray",R.drawable.sprotnews3,"Gabriel Rosado vows to win Ward-Gatti style war with Martin Murray","SkySports","The Philadelphia middleweight will fight in the United Kingdom for the first time on April 22, topping the bill in Liverpool, live on Sky Sports."));
        newsList.add(new News("http://www.skysports.com/football/news/11835/10818318/cristiano-ronaldo-statue-creator-defends-his-work",R.drawable.sprotnews2,"Cristiano Ronaldo statue creator defends his work","SkySports","The airport in Ronaldo's home town of Funchal was renamed in the Portugal captain's honour on Wednesday. It will now be known as Aeroporto Cristiano Ronaldo."));
        newsList.add(new News("http://www.skysports.com/football/news/11670/10818492/arsenal-chairman-sir-chips-keswick-coy-on-arsene-wenger-future",R.drawable.sprotnews1,"Arsenal chairman Sir Chips Keswick coy on Arsene Wenger future","SkySprots","Keswick did not give much away on whether he thinks the Frenchman will be at the Emirates next season in a rare interview as he left a Premier League meeting in central London"));
        newsList.add(new News("http://www.bbc.com/sport/basketball/39441465",R.drawable.sportnews4,"Russell Westbrook makes NBA history with triple-double high score","BBC Sport","Oklahoma City Thunder's Russell Westbrook made the highest scoring triple-double in NBA history as his side beat Orlando Magic 114-106."));
        newsList.add(new News("http://www.bbc.com/sport/get-inspired/23143745",R.drawable.sportnews5,"Get Inspired: How to get into Basketball","BBC Sport","More than 300,000 people are estimated to play basketball each month in the United Kingdom. All you need is a ball and hoop and there are thousands of outdoor courts across the country where you can play for free, so what are you waiting for?"));
        newsList.add(new News("https://sport.news.am/arm/news/76975/gandzasar-kapany-erevanum-haxtec-alashkertin-ev-havasarvec-arajatarin.html",R.drawable.sportnews6,"«Գանձասար-Կապանը» Երեւանում հաղթեց «Ալաշկերտին» եւ հավասարվեց առաջատարին","News.am","Ֆուտբոլի Հայաստանի Բարձրագույն խմբի 21-րդ տուրի մեկնարկային խաղում առաջատար «Ալաշկերտն» ընդունեց «Գանձասար-Կապանին» եւ պարտվեց 1։2 հաշվով: Կապանցիների առաջին գոլը խփեց Գեղամ Հարությունյանը, որն 9 գոլով հավասարվեց ռմբարկուների ցուցակը գլխավորող Միհրան Մանասյանին («Ալաշկերտ»)։"));
        newsList.add(new News("https://sport.news.am/arm/news/76981/mourinyo-spasum-em-ibrahimovichi-oroshmany.html",R.drawable.sprotnews7,"Մոուրինյո. Սպասում եմ Իբրահիմովիչի որոշմանը","News.am","Անգլիական «Մանչեսթեր Յունայթեդի» պորտուգալացի գլխավոր մարզիչ Ժոզե Մոուրինյոն հայտարարել է, որ ինչ որոշում էլ ընդունի Զլատան Իբրահիմովիչը կարիերայի հետագայի վերաբերյալ, ինքը կհարգի:"));
        newsList.add(new News("https://sport.news.am/arm/news/76977/holandiayi-futbolayin-miutyuny-banakcum-evan-gali-het.html",R.drawable.sportnews8,"Հոլանդիայի ֆուտբոլային միությունը բանակցում է Վան Գալի հետ","News.am","Հոլանդիայի ֆուտբոլային միությունը բանակցություններ է սկսել հոլանդացի հայտնի մասնագետ Լուի վան Գալի հետ, հայտնում է Reuters-ը։"));
        long seed=System.nanoTime();
        Collections.shuffle(newsList,new Random(seed));
        return newsList;
    }
}
