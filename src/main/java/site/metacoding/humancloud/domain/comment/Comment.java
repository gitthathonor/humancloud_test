package site.metacoding.humancloud.domain.comment;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Comment {
	private Integer commentId;
	private String commentContent;
	private Integer commentUserId;
	private Integer commentBoardId;
	private Timestamp commentCreatedAt;
}
