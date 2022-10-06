package site.metacoding.humancloud.domain.board;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Board {
	private Integer boardId;
	private String boardTitle;
	private String boardContent;
	private String boardFile;
	private Integer boardReadCount;
	private Integer boardUserId;
	private Timestamp boardCreatedAt;
}
