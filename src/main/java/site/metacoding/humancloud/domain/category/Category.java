package site.metacoding.humancloud.domain.category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Category {
	private Integer categoryId;
	private Integer categoryUserId;
	private Integer categoryCompanyId;
	private String categoryName;
	
	public Category(Integer categoryCompanyId, String categoryName) {
		this.categoryCompanyId = categoryCompanyId;
		this.categoryName = categoryName;
	}
	
}
