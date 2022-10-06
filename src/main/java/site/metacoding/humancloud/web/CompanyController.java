package site.metacoding.humancloud.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.humancloud.service.CompanyService;
import site.metacoding.humancloud.web.dto.CMRespDto;
import site.metacoding.humancloud.web.dto.request.company.JoinDto;

@Controller
@RequiredArgsConstructor
public class CompanyController {
	
	// 컴포지션
	private final CompanyService companyService;
	
	
	@GetMapping("/company/joinForm")
	public String saveCompanyForm() {
		return "companySaveForm";
	}
	
	
	@PostMapping("/company/join")
	public @ResponseBody CMRespDto<?> joinCompany(@RequestBody JoinDto joinDto) {
		companyService.joinCompany(joinDto);
		return new CMRespDto<>(1, "기업 회원가입 성공", null);
	}
	
//	@GetMapping("/saveForm")
//	public String saveCompanyForm() {
//		return "companySaveForm";
//	}
//	
//	@PostMapping("/save")
//	public @ResponseBody CMRespDto<?> saveCompany(JoinDto joinDto) {
//		companyService.saveCompany(joinDto);
//		return new CMRespDto<>(1, "기업 회원 가입 성공", null);
//	}
	
}
