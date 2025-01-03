package com.kk.microservices.limit_service.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.kk.microservices.limit_service.entity.UserLimitEn;


@Repository
public interface UserLimitRepoEn extends ReactiveCrudRepository<UserLimitEn, Integer>{

}
