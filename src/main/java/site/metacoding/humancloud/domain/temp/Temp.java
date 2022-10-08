package site.metacoding.humancloud.domain.temp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Temp {
	private Integer id;
	private String username;
	private String password;
	private String logo;
	
	public Temp(String username, String password, String logo) {
		this.username = username;
		this.password = password;
		this.logo = logo;
	}
	
	
}
