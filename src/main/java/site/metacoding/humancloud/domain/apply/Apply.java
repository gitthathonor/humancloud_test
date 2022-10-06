package site.metacoding.humancloud.domain.apply;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Apply {
	private Integer applyId;
	private Integer applyRecruitId;
	private Integer applyResumeId;
	private Timestamp applyCreatedAt;
}
