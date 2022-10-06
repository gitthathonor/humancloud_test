package site.metacoding.humancloud.domain.company;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Company {
	private Integer companyId;
	private String companyUsername;
	private String companyPassword;
	private String companyName;
	private String companyEmail;
	private String companyPhoneNumber;
	private String companyAddress;
	private Timestamp companyCreatedAt;
	
	public Company(String companyUsername, String companyPassword, String companyName, String companyEmail,
			String companyPhoneNumber, String companyAddress) {
		this.companyUsername = companyUsername;
		this.companyPassword = companyPassword;
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyPhoneNumber = companyPhoneNumber;
		this.companyAddress = companyAddress;
	}
}
