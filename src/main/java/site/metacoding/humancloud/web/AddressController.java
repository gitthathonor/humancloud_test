package site.metacoding.humancloud.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.humancloud.domain.address.Address;
import site.metacoding.humancloud.service.AddressService;
import site.metacoding.humancloud.web.dto.CMRespDto;

@Controller
@RequiredArgsConstructor
public class AddressController {
	
	private final AddressService addressService;
	
	@GetMapping("/address/saveForm")
	public String saveJusoForm() {
		return "addressSaveForm";
	}
	
	@PostMapping("/address/save")
	public @ResponseBody CMRespDto<?> saveAddress(Address adrdredss) {
		addressService.saveAddress(adrdredss);
		return new CMRespDto<>(1, "주소 입력 성공", null);
	}
}
