package site.metacoding.humancloud.domain.company;

import java.util.List;

import site.metacoding.humancloud.web.dto.request.company.JoinDto;

public interface CompanyDao {
	public void save(JoinDto joinDto);
	public Company findById(Integer id);
	public List<Company> findAll();
	public void update(Company company);
	public void deleteById(Integer id);
}
