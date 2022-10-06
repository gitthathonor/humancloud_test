package site.metacoding.humancloud.domain.subscribe;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Subscribe {
	private Integer subscribeId;
	private Integer subscribeUserId;
	private Integer subscribeCompanyId;
	private Timestamp subscribeCreatedAt;
}
