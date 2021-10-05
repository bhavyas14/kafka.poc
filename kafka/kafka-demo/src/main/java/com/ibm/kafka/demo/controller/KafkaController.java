package com.ibm.kafka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.kafka.demo.service.KafkaProducerService;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	@Autowired
	KafkaProducerService producer;
	
	@PostMapping("/publish")
	public void publishMessage(@RequestParam String message)
	{
		producer.sendMessage(message);
	}

}
