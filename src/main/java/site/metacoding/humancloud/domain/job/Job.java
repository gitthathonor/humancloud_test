package site.metacoding.humancloud.domain.job;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Job {
	private Integer job_id;
	private Integer jobResumeId;
	private Integer jobRecruitId;
	private String jobName;
}
