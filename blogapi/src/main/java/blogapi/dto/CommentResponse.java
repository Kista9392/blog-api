package blogapi.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentResponse {
    private long id;
    private String content;
    private LocalDateTime createdAt;
    private String authorName;
}
