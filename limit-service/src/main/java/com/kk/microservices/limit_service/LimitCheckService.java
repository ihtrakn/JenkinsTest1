package com.kk.microservices.limit_service;

import org.springframework.stereotype.Service;

import com.kk.microservices.limit_service.entity.UserLimitEn;
import com.kk.microservices.limit_service.repo.UserLimitRepoEn;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class LimitCheckService {

	public UserLimitRepoEn userLimitRepoEn;

	public LimitCheckService(UserLimitRepoEn userLimitRepoEn) {
		this.userLimitRepoEn = userLimitRepoEn;
	}
	
	public Mono<String> fetchUserLimit(){
		Flux<UserLimitEn> userData = userLimitRepoEn.findAll();
		
		return userData.next().map(UserLimitEn :: getUserName);
		
//		return userData.flatMap( user -> {
//			return user.getUserName();
//		});
	}
	

}
