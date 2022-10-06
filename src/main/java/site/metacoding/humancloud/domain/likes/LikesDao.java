package site.metacoding.humancloud.domain.likes;

import java.util.List;

public interface LikesDao {
	public void save(Likes likes);
	public Likes findById(Integer id);
	public List<Likes> findAll();
	public void update(Likes likes);
	public void deleteById(Integer id);
}
