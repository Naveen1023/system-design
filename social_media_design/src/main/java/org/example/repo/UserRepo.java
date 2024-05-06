package org.example.repo;

import org.example.models.User;

import java.util.HashMap;

public class UserRepo {
  static HashMap<Integer, User> userMap = new HashMap<Integer, User>();

  public void addUser(String email, String password) {
    User user = new User(email, password);
    int userId = userMap.size() + 1;
    userMap.put(userId, user);
  }
}
