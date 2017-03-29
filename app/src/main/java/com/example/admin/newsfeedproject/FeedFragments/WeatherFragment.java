package com.example.admin.newsfeedproject.FeedFragments;


import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.admin.newsfeedproject.FeedRecylerView.DaysFragment;
import com.example.admin.newsfeedproject.R;

import java.util.Calendar;
import java.util.Date;

public class WeatherFragment extends Fragment {
    private TextView city,temperature,day;
    private ImageView weaterpic;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.weather_fragment, container, false);
        city = (TextView) view.findViewById(R.id.city);
        temperature = (TextView) view.findViewById(R.id.temperature);
        weaterpic=(ImageView)view.findViewById(R.id.weater_pic);
        day=(TextView)view.findViewById(R.id.day);
        FragmentManager fragmentManager = getFragmentManager();
        DaysFragment daysFragment=new DaysFragment();
        fragmentManager.beginTransaction().add(R.id.coteyner,daysFragment).commit();
        dayoffweek();

        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(getContext(), v);
                popupMenu.getMenuInflater().inflate(R.menu.marzer, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        switch (id) {
                            case R.id.a:
                                city.setText(item.getTitle());
                                temperature.setText("-5");
                                weaterpic.setImageResource(R.drawable.a);
                                break;
                            case R.id.b:
                                city.setText(item.getTitle());
                                temperature.setText("+10");
                                weaterpic.setImageResource(R.drawable.suuny);
                                break;
                            case R.id.c:
                                city.setText(item.getTitle());
                                temperature.setText("-2");
                                weaterpic.setImageResource(R.drawable.fog_day);
                                break;
                            case R.id.d:
                                city.setText(item.getTitle());
                                temperature.setText("-12");
                                weaterpic.setImageResource(R.drawable.fog_night);
                                break;
                            case R.id.e:
                                city.setText(item.getTitle());
                                temperature.setText("-15");
                                weaterpic.setImageResource(R.drawable.snow);
                                break;
                            case R.id.f:
                                city.setText(item.getTitle());
                                temperature.setText("+3");
                                weaterpic.setImageResource(R.drawable.a);
                                break;
                            case R.id.g:
                                city.setText(item.getTitle());
                                temperature.setText("+13");
                                weaterpic.setImageResource(R.drawable.suuny);
                                break;
                            case R.id.m:
                                city.setText(item.getTitle());
                                temperature.setText("-14");
                                weaterpic.setImageResource(R.drawable.snow);
                                break;
                            case R.id.n:
                                city.setText(item.getTitle());
                                temperature.setText("-4");
                                weaterpic.setImageResource(R.drawable.fog_day);
                                break;
                            case R.id.l:
                                city.setText(item.getTitle());
                                temperature.setText("-7");
                                weaterpic.setImageResource(R.drawable.fog_night);
                                break;
                            case R.id.o:
                                city.setText(item.getTitle());
                                temperature.setText("+20");
                                weaterpic.setImageResource(R.drawable.suuny);
                                break;

                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
        return view;
    }
    private void dayoffweek()
    {
        Calendar calendar = Calendar.getInstance();
        int of = calendar.get(Calendar.DAY_OF_WEEK);
        switch (of)
        {
            case Calendar.MONDAY:
                day.setText("Երկուշաբթի");
                break;
            case Calendar.TUESDAY:
                day.setText("Երեքշաբթի");
                break;
            case Calendar.WEDNESDAY:
                day.setText("Չորեքշաբթի");
                break;
            case Calendar.THURSDAY:
                day.setText("Հինգշաբթի");
                break;
            case Calendar.FRIDAY:
                day.setText("Ուրբաթ");
                break;
            case Calendar.SATURDAY:
                day.setText("Շաբաթ");
                break;
            case Calendar.SUNDAY:
                day.setText("Կիրակի");
                break;

        }
    }
}
