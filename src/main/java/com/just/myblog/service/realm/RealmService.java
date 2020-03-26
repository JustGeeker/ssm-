package com.just.myblog.service.realm;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.just.myblog.domain.User;
import com.just.myblog.dto.UserInfo;

@Service("Realm")
@Component
public interface RealmService {

	UserInfo getUserInfo(User user);

}
