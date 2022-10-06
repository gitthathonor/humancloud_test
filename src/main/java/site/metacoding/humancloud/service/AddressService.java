package site.metacoding.humancloud.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.humancloud.domain.address.Address;
import site.metacoding.humancloud.domain.address.AddressDao;

@Service
@RequiredArgsConstructor
public class AddressService {
	
	private final AddressDao addressDao;
	
	
	// 주소 API 사용해서 주소 넣기
	public void saveAddress(Address address) {
		addressDao.save(address);
	}
}
