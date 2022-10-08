package site.metacoding.humancloud.domain.temp;

import java.util.List;

public interface TempDao {
	public void save(Temp temp);
	public Temp findById(Integer id);
	public List<Temp> findAll();
	public void update(Temp temp);
	public void deleteById(Integer id);
}
