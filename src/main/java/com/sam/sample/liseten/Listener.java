package com.sam.sample.liseten;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Listener {

	@KafkaListener(topics = "message",groupId = "mygroup")
	public void get(String obj) {
		System.out.println(obj);
	}
}
