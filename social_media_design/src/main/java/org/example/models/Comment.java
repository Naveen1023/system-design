package org.example.models;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@ToString
@AllArgsConstructor
public class Comment extends BaseContent {
  Post post;
}
