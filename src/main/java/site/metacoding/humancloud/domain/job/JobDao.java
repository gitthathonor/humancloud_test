package site.metacoding.humancloud.domain.job;

import java.util.List;

public interface JobDao {
	public void save(Job job);
	public Job findById(Integer id);
	public List<Job> findAll();
	public void update(Job job);
	public void deleteById(Integer id);
}
