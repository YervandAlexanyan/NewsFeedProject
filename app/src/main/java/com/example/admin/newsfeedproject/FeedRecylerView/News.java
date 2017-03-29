package com.example.admin.newsfeedproject.FeedRecylerView;



public class News {
    private int image;
    private String name;
    private String source;
    private String title;

    public News(int image, String name, String source,String title) {
        this.image = image;
        this.name = name;
        this.source = source;
        this.title=title;
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
