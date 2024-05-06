package org.example;

import org.example.models.Comment;
import org.example.models.Post;
import org.example.models.User;
import org.example.service.PostService;
import org.example.service.UserService;

public class SocialMediaManager {

  static PostService postService = new PostService();
  static UserService userService = new UserService();

  public static void main(String[] args) {
    User user1 = new User("naveen1@gmail.com", "password1");
    User user2 = new User("naveen2@gmail.com", "password2");
    User user3 = new User("naveen3@gmail.com", "password3");

    userService.addUser("naveen1@gmail.com", "password1");
    userService.addUser"naveen2@gmail.com", "password2");
    userService.addUser"naveen3@gmail.com", "password23");
//    User can Create a POST
    postService.addPost("Post Title" ,"This is post1",user1);





  }
}