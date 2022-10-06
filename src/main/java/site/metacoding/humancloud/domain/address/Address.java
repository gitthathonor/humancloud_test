package site.metacoding.humancloud.domain.address;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Address {
	private String zipcode;
	private String streetAdr;
	private String detailAdr;
}
