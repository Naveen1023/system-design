package org.example.models;

public enum VoteType {
  UPVOTE(1),
  DOWNVOTE(-1);

  public final int voteCount;

  private VoteType(int voteCount) {
    this.voteCount = voteCount;
  }
}
