package site.metacoding.humancloud.domain.recruit;

import java.util.List;

public interface RecruitDao {
	public void save(Recruit recruit);
	public Recruit findById(Integer id);
	public List<Recruit> findAll();
	public void update(Recruit recruit);
	public void deleteById(Integer id);
}
