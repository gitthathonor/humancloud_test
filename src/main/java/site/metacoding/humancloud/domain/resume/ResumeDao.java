package site.metacoding.humancloud.domain.resume;

import java.util.List;

public interface ResumeDao {
	public void save(Resume resume);
	public Resume findById(Integer id);
	public List<Resume> findAll();
	public void update(Resume resume);
	public void deleteById(Integer id);
}
