package com.just.myblog.dto;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserInfo {
	private Integer id;

	private String email;

	private String username;

	private String password;

	private Integer articlecount;

	private Integer publishedarticlecount;

	private String avatar;

	private Date createTime;

	private Date updateTime;

	private Integer deleted;

	private List<RoleInfo> roles;
}
