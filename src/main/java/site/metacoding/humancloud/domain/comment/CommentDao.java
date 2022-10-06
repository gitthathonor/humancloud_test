package site.metacoding.humancloud.domain.comment;

import java.util.List;

public interface CommentDao {
	public void save(Comment comment);
	public Comment findById(Integer id);
	public List<Comment> findAll();
	public void update(Comment comment);
	public void deleteById(Integer id);
}
