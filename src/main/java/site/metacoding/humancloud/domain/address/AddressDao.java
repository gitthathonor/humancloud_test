package site.metacoding.humancloud.domain.address;

import java.util.List;

import site.metacoding.humancloud.domain.apply.Apply;

public interface AddressDao {
	public void save(Address address);
	public Apply findById(Integer id);
	public List<Apply> findAll();
	public void update(Address address);
	public void deleteById(Integer id);
}
