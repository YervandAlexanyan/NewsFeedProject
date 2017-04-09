package com.example.admin.newsfeedproject.FeedRecylerView;



public class News {
    private int image;
    private String name;
    private String source;
    private String title;
    private String url;
    private boolean favorite;

    public News(String url,int image, String name, String source,String title,boolean favorite) {

        this.url=url;
        this.image = image;
        this.name = name;
        this.source = source;
        this.title=title;
        this.favorite=favorite;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getUrl() {
        return url;
    }

    public String getSource() {
        return source;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
