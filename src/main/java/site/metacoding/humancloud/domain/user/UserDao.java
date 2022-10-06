package site.metacoding.humancloud.domain.user;

import java.util.List;

public interface UserDao {
	public void save(User user);
	public User findById(Integer id);
	public List<User> findAll();
	public void update(User user);
	public void deleteById(Integer id);
}
