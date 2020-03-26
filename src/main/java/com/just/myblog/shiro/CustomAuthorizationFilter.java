package com.just.myblog.shiro;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.Set;

/**
 * Created by justGeeker
 * 2020/1/17 13:28
 * 416467337@qq.com
 * 自定义shirofilter
 */
public class CustomAuthorizationFilter extends AuthorizationFilter {
    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws IOException {
        Subject subject = this.getSubject(request, response);
        String[] rolesArray = (String[])((String[])mappedValue);
        if (rolesArray != null && rolesArray.length != 0) {
            Set<String> roles = CollectionUtils.asSet(rolesArray);
            for (String role:roles) {
                //当前subject 如果是权限角色任何一个 则放行
//                System.out.println("=================================================");
                 if(subject.hasRole(role)){
                     return true;
                 }

            }
            return false;
        } else {
            return true;
        }
    }
}
