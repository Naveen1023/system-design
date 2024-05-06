package org.example.service;

import org.example.models.Post;
import org.example.models.User;
import org.example.repo.PostRepo;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class PostService {
  static PostRepo postRepo = new PostRepo();
  AtomicInteger ID_GENERATOR = new AtomicInteger(1);

  public void addPost(String title, String desc, User user) {
    Post post = new Post();
    post.setId((int) (Math.random() * 1e8));
    post.setTitle(title);
    post.setDesc(desc);
    post.setUser(user);
    post.setComments(new ArrayList<>());
    post.setVotes(new ArrayList<>());

    postRepo.addPost(post);
  }
}
