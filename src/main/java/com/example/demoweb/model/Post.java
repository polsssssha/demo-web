package com.example.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    private String text;
    private Integer likes = 0;
    private Date creationDate;

    @Id
    @GeneratedValue
    private Long id;

    public Post() {
    }

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void setCreationDate(Date creationDate){this.creationDate = creationDate;}

    public Long getId(){return id;}
    public void setId(long id){
        this.id = id;
    }

}