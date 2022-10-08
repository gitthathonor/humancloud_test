package site.metacoding.humancloud.web.dto.request.temp;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.humancloud.domain.temp.Temp;

@Getter
@Setter
public class SaveDto {
	private Integer id;
	private String username;
	private String password;
	private String logo;
	
	public Temp toEntity(String logo) {
		return new Temp(this.username, this.password, logo);
	}
}
