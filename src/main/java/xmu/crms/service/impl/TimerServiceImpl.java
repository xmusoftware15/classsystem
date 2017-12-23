package xmu.crms.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import xmu.crms.service.TimerService;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;

@Service
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
