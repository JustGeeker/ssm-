package com.just.myblog.dto;

import java.util.List;

import com.just.myblog.domain.Permission;
import com.just.myblog.domain.Role;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoleInfo {
	private Integer id;

	private String role;

	private String description;

	private List<Permission> permissions;

	public RoleInfo(Role role1) {
		this.id = role1.getId();
		this.role = role1.getRole();
		this.description = role1.getDescription();
	}
}
