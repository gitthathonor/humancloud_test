package site.metacoding.humancloud.domain.chatting;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Chatting {
	private Integer chattingId;
	private Integer chattingUserId;
	private String chattingContent;
	private Timestamp chattingCreatedAt;
}
