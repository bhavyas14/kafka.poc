package com.ibm.kafka.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);
	
	@KafkaListener(topics = "${general.topic.name}", groupId = "${general.topic.group.id}")
	public void consume(String message)
	{
		logger.info(String.format("message received: %s", message));
	}

}
