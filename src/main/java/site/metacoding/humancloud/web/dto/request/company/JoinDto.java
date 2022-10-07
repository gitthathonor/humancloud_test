package site.metacoding.humancloud.web.dto.request.company;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.humancloud.domain.company.Company;

@Getter
@Setter
@NoArgsConstructor
public class JoinDto {
	private Integer companyId; // save한 이후에 id 값을 받기 위해서
	private String companyUsername;
	private String companyPassword;
	private String companyName;
	private String companyEmail;
	private String companyPhoneNumber;
	private String companyAddress;
	private List<String> categoryList;

	public Company toEntity() {
		return new Company(this.companyUsername, this.companyPassword, this.companyName, this.companyEmail,
				this.companyPhoneNumber, this.companyAddress);
	}
	
}
