package blogapi.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostResponse {
  private String title;
  private Long id;
  private String content;
  private String category;
  private LocalDateTime createdAt;
  private String authorName;
  private int commentCount;

}
