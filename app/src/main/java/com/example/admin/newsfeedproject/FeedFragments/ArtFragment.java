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
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArtFragment extends Fragment {
    private RecyclerView recyclerView;
    private FeedAdapter adapter;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.art_fragment, container, false);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout_art);
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
        recyclerView = (RecyclerView) view.findViewById(R.id.art_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new FeedAdapter(setData(), getContext());
        recyclerView.setAdapter(adapter);
        return view;

    }

    private List<News> setData() {
        List<News> newsList = new ArrayList<>();
        newsList.add(new News("http://www.bbc.com/culture/story/20170324-the-man-with-the-green-face", R.drawable.artnews1, "After a Russian anti-corruption campaigner appeared to have been sprayed green in a bizarre attack, Kelly Grovier looks at how a colour can be a show of defiance.", "BBC", "If lust is red, sadness is blue, and cowardice is yellow, what colour defines defiance? An arresting image that emerged this week promises to add a new hue to the symbolic colour-wheel that spins inside us."));
        newsList.add(new News("http://www.bbc.com/culture/story/20170324-how-to-look-at-a-work-of-art", R.drawable.artnews2, "How to look at a work of art", "BBC", "The ‘Slow Art movement’ is on the rise. Linda Kennedy looks at the ins and outs of ‘eyeball etiquette’."));
        newsList.add(new News("https://www.theguardian.com/books/2017/mar/30/in-our-google-era-indexers-are-the-unsung-heroes-of-the-publishing-world", R.drawable.artnews3, "In our Google era, indexers are the unsung heroes of the publishing world\n" +
                "Sam Leith", "TheGuardian", "Today, the Society of Indexers – the industry body for those professionals (for which, full disclosure, I have the honour to be honorary president) – turns 60 years old. It celebrates its “anniversary, diamond”. “What?” you ask. “Who?” you wonder. "));
        newsList.add(new News("http://www.today.com/popculture/adele-elmo-celebrity-friendship-we-ve-been-waiting-t109136", R.drawable.artnews4, "Adele and Elmo is the celebrity friendship we've been waiting for", "today.com", "Adele may be officially off the market, but she's still open to new friends. Say hello to the goals-iest celebrity BFFs since Taylor and Karlie ..."));
        newsList.add(new News("http://www.aravot.am/2017/03/30/872386/", R.drawable.artnews5, "Պեղումներ Շուշիի իրանական մզկիթի տարածքում", "aravot.am", "Պատմական գիտությունների թեկնածու Նժդեհ Երանյանի ղեկավարած հնագիտական արշավախումբն այս օրերին աշխատում է հուշարձանի արևելյան և արևմտյան տապանաբակերում։"));
        newsList.add(new News("http://tvkultura.ru/article/show/article_id/172108/", R.drawable.artnews6, "Пушкинский музей готовит выставку знаменитого художника современности Цая Гоцяна", "tvkultura.am", "Огонь и порох Октября. К 100-летию Революции Пушкинский музей готовит первую в стране персональную выставку одного из самых знаменитых современных художников мира. Цай Гоцян – мастер, объединяющий в своем творчестве Восток и Запад, высокое искусство и повседневность, вековые традиции и современные стратегии. Чтобы показать все многообразие арт-практик этого автора, музей превратит свои залы в огромную инсталляцию. Но и этого мало – будут задействованы еще и площадь перед музеем, и другие площадки."));
        newsList.add(new News("https://www.gazeta.ru/culture/2017/03/30/a_10602749.shtml", R.drawable.artnews7, "«Побеждают творческие ОПГ, а не узколобые бухгалтеры»", "gazeta.ru", "Продюсеры и режиссеры Иван Капитонов и Святослав Подгаевский рассказали «Газете.Ru» о том, как сделать русский фильм ужасов, а также почему после успеха «Невесты» и «Пиковой дамы» они решили создать собственную кинокомпанию."));
        newsList.add(new News("https://style.news.am/arm/news/39528/eriky-lavaguyn-ergich-tchanachvelu-x-factor-i-ev-adrbejanci-hakerneri-instagram-i-ir-ejy-kotrelu-masin.html", R.drawable.artnews8, "Էրիկը` լավագույն երգիչ ճանաչվելու, X Factor-ի եւ ադրբեջանցի հակերների՝ Instagram-ի իր էջը կոտրելու մասին", "News.am", "Փարիզում առաջին անգամ կայացած Armenian Europe Music Awards մրցանակաբաշխության «Տարվա լավագույն երգչի» տիտղոսակիր է դարձել Էրիկը:"));
        long seed=System.nanoTime();
        Collections.shuffle(newsList,new Random(seed));
        return newsList;
    }
}
