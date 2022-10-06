package site.metacoding.humancloud.domain.likes;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Likes {
	private Integer likesId;
	private Integer likesUserId;
	private Integer likesBoardId;
	private Timestamp likesCreatedAt;
}
