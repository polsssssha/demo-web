package com.example.demoweb.model;

public class Post {

    String text;
    Integer likes;

    public Post(String text)
    {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public Integer getLikes() {
        return likes;
    }
}
