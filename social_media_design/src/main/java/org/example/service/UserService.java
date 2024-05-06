package org.example.service;

import org.example.models.User;
import org.example.repo.UserRepo;

public class UserService {

  static UserRepo userRepo = new UserRepo();
  public void addUser(String email, String password) {
    userRepo.addUser(email, password);
  }
}
