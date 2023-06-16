package com.company.chatterbook.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    List<ChatterPost> chatterPosts = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChatterPosts(List<ChatterPost> posts) {
        for (ChatterPost post: posts) {
            this.chatterPosts.add(post);
        }
    }

    public List<ChatterPost> getChatterPosts() {
        return this.chatterPosts;
    }

}
