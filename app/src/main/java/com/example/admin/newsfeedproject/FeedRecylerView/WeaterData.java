package com.example.admin.newsfeedproject.FeedRecylerView;



public class WeaterData  {
    private String day;
    private int image;
    private String temp;

    public WeaterData(String day, int image, String temp) {
        this.day = day;
        this.image = image;
        this.temp = temp;
    }

    public String getDay() {
        return day;
    }

    public int getImage() {
        return image;
    }

    public String getTemp() {
        return temp;
    }
}
