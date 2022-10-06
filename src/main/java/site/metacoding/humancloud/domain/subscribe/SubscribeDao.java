package site.metacoding.humancloud.domain.subscribe;

import java.util.List;

public interface SubscribeDao {
	public void save(Subscribe subscribe);
	public Subscribe findById(Integer id);
	public List<Subscribe> findAll();
	public void update(Subscribe subscribe);
	public void deleteById(Integer id);
}
