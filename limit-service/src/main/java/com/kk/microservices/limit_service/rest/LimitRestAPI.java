package com.kk.microservices.limit_service.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.microservices.limit_service.LimitCheckService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/limit")
public class LimitRestAPI {
	
	private LimitCheckService limitCheckService;
	
	public LimitRestAPI(LimitCheckService limitCheckService) {
		this.limitCheckService = limitCheckService;
	}
	
	
	@GetMapping(value = "/getLimit")
	public String getUserLimits() {
		return "Hai this is Karthi";
	}
	
	@GetMapping("/fetchValue")
	public Mono<String> getchLimitDB() {
		return limitCheckService.fetchUserLimit();
	}
	

}
