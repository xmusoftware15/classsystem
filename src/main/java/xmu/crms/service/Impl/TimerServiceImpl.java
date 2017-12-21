package xmu.crms.service.Impl;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import xmu.crms.service.TimerService;

import java.util.Date;
import java.util.HashMap;

@Component
public class TimerServiceImpl implements TimerService{

	/**
	 * 每十分钟检查一次Event实体的状况
	 * @author qinlingyun
	 */
	@Override
	@Scheduled(fixedRate = 10000)
	public void scheduled() {
		
	}

	@Override
	public void insertEvent(Date time, Bean beanName, HashMap<Integer, String> paramMap) {

	}
}
