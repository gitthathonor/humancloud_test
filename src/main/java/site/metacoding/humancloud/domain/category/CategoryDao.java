package site.metacoding.humancloud.domain.category;

import java.util.List;

public interface CategoryDao {
	public void save(Category category);
	public Category findById(Integer id);
	public List<Category> findAll();
	public void update(Category category);
	public void deleteById(Integer id);
}
