package site.metacoding.humancloud.domain.apply;

import java.util.List;

public interface ApplyDao {
	public void save(Apply apply);
	public Apply findById(Integer id);
	public List<Apply> findAll();
	public void update(Apply apply);
	public void deleteById(Integer id);
}
