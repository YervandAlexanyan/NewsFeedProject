package com.example.admin.newsfeedproject.feedrecylerView;



public class News {
    private int image;
    private String name;
    private String source;
    private String title;
    private String url;


    public News(String url,int image, String name, String source,String title) {

        this.url=url;
        this.image = image;
        this.name = name;
        this.source = source;
        this.title=title;
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
