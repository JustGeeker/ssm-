package com.just.myblog.service.realm.imp;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.just.myblog.dao.PermissionMapper;
import com.just.myblog.dao.RoleMapper;
import com.just.myblog.dao.RolePermissionMapper;
import com.just.myblog.dao.UserMapper;
import com.just.myblog.dao.UserRoleMapper;
import com.just.myblog.domain.Permission;
import com.just.myblog.domain.Role;
import com.just.myblog.domain.RolePermission;
import com.just.myblog.domain.RolePermissionExample;
import com.just.myblog.domain.User;
import com.just.myblog.domain.UserExample;
import com.just.myblog.domain.UserExample.Criteria;
import com.just.myblog.domain.UserRole;
import com.just.myblog.domain.UserRoleExample;
import com.just.myblog.dto.RoleInfo;
import com.just.myblog.dto.UserInfo;
import com.just.myblog.service.realm.RealmService;

@Service
public class RealmServiceImp implements RealmService {

	@Autowired
	UserMapper userMapper;

	@Autowired
	RoleMapper roleMapper;
	@Autowired
	UserRoleMapper userRoleMapper;

	@Autowired
	RolePermissionMapper rolePermissionMapper;
	@Autowired
	PermissionMapper permissionMapper;

	@Override
	public UserInfo getUserInfo(User user) {
		UserInfo userInfo = new UserInfo();

		if (user.getEmail() == null) {
			return null;
		}
		// 通过email查id
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andEmailEqualTo(user.getEmail());
		List<User> userlist = userMapper.selectByExample(userExample);
		if (userlist.isEmpty()) {
			return null;
		}
		Integer userid = userlist.get(0).getId();

		// 通过id 去查询角色id
		UserRoleExample userRoleExample = new UserRoleExample();
		UserRoleExample.Criteria criteria2 = userRoleExample.createCriteria();
		criteria2.andUserIdEqualTo(userid);
		List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
		if (userRoles.isEmpty())
			return null;
		// 通过角色id去查询 角色
		Integer roleId = null;
		RoleInfo roleInfo = null;

		List<RoleInfo> roleInfos = new ArrayList<RoleInfo>(4);
		for (UserRole userRole : userRoles) {
			roleId = userRole.getRoleId();

			Role role = roleMapper.selectByPrimaryKey(roleId);
			// 通过角色id 去查询role_permission;
			roleInfo = new RoleInfo(role);
			RolePermissionExample rolePermissionExample = new RolePermissionExample();
			RolePermissionExample.Criteria criteria3 = rolePermissionExample.createCriteria();
			criteria3.andRoleIdEqualTo(roleId);
			List<RolePermission> rolePermissions = rolePermissionMapper.selectByExample(rolePermissionExample);
			List<Permission> permissions = new ArrayList<Permission>();
			Permission permission = null;
			for (RolePermission rolePermission : rolePermissions) {
				// 根据permission id 去查询permission
				permission = permissionMapper.selectByPrimaryKey(rolePermission.getPermissionId());
				permissions.add(permission);
			}
			roleInfo.setPermissions(permissions);

			roleInfos.add(roleInfo);

		}
		userInfo.setRoles(roleInfos);
		return userInfo;
	}

}
