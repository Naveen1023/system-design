package org.example.models;

import lombok.*;
import org.example.models.BaseContent;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Post extends BaseContent {
  int id;
  String title;
}
