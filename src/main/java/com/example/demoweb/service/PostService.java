package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    private ArrayList<Post> posts = new ArrayList<Post>();

    public ArrayList<Post> listAllPosts()
    {
        posts.add(new Post("Пост с котиками", new Date()));
        posts.add(new Post("Смешной пост!!", new Date()));
        posts.add(new Post("Грустный пост((", new Date()));

        return posts;
    }
}
