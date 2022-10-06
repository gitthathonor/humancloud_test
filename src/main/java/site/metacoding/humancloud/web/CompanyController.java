package site.metacoding.humancloud.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.humancloud.service.CompanyService;
import site.metacoding.humancloud.web.dto.CMRespDto;
import site.metacoding.humancloud.web.dto.request.company.JoinDto;

@RestController
@RequiredArgsConstructor
public class CompanyController {
	
	// 컴포지션
	private final CompanyService companyService;
	
	
	@PostMapping("/api/company/join")
	public @ResponseBody CMRespDto<?> joinCompany(@RequestBody JoinDto joinDto) {
		companyService.joinCompany(joinDto);
		return new CMRespDto<>(1, "기업 회원가입 성공", null);
	}
	
}
