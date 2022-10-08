package site.metacoding.humancloud.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.humancloud.domain.temp.Temp;
import site.metacoding.humancloud.domain.temp.TempDao;

@Service
@RequiredArgsConstructor
public class TempService {
	
	private final TempDao tempDao;
	
	public void saveFile(Temp temp) {
		tempDao.save(temp);
	}
}
