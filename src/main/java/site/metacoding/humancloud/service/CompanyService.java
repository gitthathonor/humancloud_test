package site.metacoding.humancloud.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.humancloud.domain.category.Category;
import site.metacoding.humancloud.domain.category.CategoryDao;
import site.metacoding.humancloud.domain.company.Company;
import site.metacoding.humancloud.domain.company.CompanyDao;
import site.metacoding.humancloud.web.dto.request.company.JoinDto;

@Service
@RequiredArgsConstructor
public class CompanyService {

	// 컴포지션
	private final CompanyDao companyDao;
	private final CategoryDao categoryDao;

	// 기업 회원 가입
	public void joinCompany(JoinDto joinDto) {
		// 기업 정보는 기업 테이블에 저장
		companyDao.save(joinDto);
		System.out.println(joinDto.getCompanyId());
		for (String category : joinDto.getCategoryList()) {
			Category categoryElement = new Category(joinDto.getCompanyId(), category);
			categoryDao.save(categoryElement);
		}
		
	}
}
