package com.kk.microservices.limit_service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Table("user_limit")
@Data
public class UserLimitEn {

	@Id
	@Column("user_id")
	private Integer userId;

	@Column("user_name")
	private String userName;

	@Column("user_status")
	private String userStatus;

	@Column("user_type")
	private String userType;

}
