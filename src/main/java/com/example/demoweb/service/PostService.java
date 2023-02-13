package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    ArrayList<Post> posts = new ArrayList<Post>();

    public ArrayList<Post> listAllPosts()
    {
        Post post = new Post("Пост с котиками");
        posts.add(post);
        Post post2 = new Post("Смешной пост");
        posts.add(post2);
        Post post3 = new Post("Грустный пост((");
        posts.add(post3);
        return posts;
    }
}
