package site.metacoding.humancloud.domain.board;

import java.util.List;

public interface BoardDao {
	public void save(Board board);
	public Board findById(Integer id);
	public List<Board> findAll();
	public void update(Board board);
	public void deleteById(Integer id);
}
