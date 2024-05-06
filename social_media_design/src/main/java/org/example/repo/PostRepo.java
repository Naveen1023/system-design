package org.example.repo;

import org.example.models.Post;

import java.util.HashMap;

public class PostRepo {
  static HashMap<Integer, Post> postMap = new HashMap<>();

  public void addPost(Post post) {
    postMap.put(post.getId() , post);
  }
}
