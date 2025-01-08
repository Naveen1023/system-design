package org.server.data;

import org.server.domain.models.User;

public class UserRepo {

//  Assume data is being fetched from some data source
  public User getUserById(String id) {
    return new User("100", "Naveen", "naveen@gmail.com", "9876543210");
  }
}
