package com.sam.sample.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class Produce {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	@PostMapping
	public String send(@RequestParam String message) {
		kafkaTemplate.send("message",message);
		return "sent";
		}
}
