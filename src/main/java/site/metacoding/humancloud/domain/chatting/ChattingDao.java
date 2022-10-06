package site.metacoding.humancloud.domain.chatting;

import java.util.List;

public interface ChattingDao {
	public void save(Chatting chatting);
	public Chatting findById(Integer id);
	public List<Chatting> findAll();
	public void update(Chatting chatting);
	public void deleteById(Integer id);
}
