package com.spirit.eureka_client_2;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class HelloController {

	private final Logger logger = (Logger)LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping("/hello")
	public String hello() {
		
		logger.info("call hello");
		 
		//ServiceInstance instance = client.getLocalServiceInstance();
		
		//logger.info("service id:" + instance.getServiceId());
		
		return "wanghuan client-2 hello testing";
	}
}
