package org.example.models;

import lombok.Data;

import java.util.List;

@Data
public abstract class BaseContent {
  String desc;
  User user;
  List<Comment> comments;
  List<Vote> votes;
}
