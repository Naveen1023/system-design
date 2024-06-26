package org.example.models;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Vote {
  User user;
  VoteType voteType;
  BaseContent parentId;
}
