package xmu.crms.service.Impl;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import xmu.crms.service.TimerService;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;

@Component
public class TimerServiceImpl implements TimerService{

	@Override
	public void insertEvent(Date time, String beanName, String methodName, HashMap<BigInteger, String> paramMap) {

	}

	@Override
	public void updateEvent(BigInteger eventId, Date newTime) {

	}


	@Override
	public void scheduled() {

	}
}
