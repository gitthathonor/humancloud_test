package site.metacoding.humancloud.domain.recruit;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Recruit {
	private Integer recruitId;
	private String recruitTitle;
	private String recruitCareer;
	private String recruitPattern;
	private Integer recruitSalary;
	private String recruitLocation;
	private String recruitContent;
	private Integer recruitReadCount;
	private Integer recruitCompanyId;
	private Timestamp recruitCreatedAt;
}
