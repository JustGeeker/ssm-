package com.just.myblog.shiro;

/**
 * Created by justGeeker
 * 2020/3/25 21:33
 * 416467337@qq.com
 * 重写DefaultWebSessionManager的retrieveSession方法，防止一个接口重复读取redis的session
 */
import java.io.Serializable;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.SessionKey;
import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.session.mgt.WebSessionKey;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apache.shiro.web.servlet.ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE;


public class RedisSessionManager extends DefaultWebSessionManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(RedisSessionManager.class);
    private static final String AUTHORIZATION ="token";
    @Override
    protected Session retrieveSession(SessionKey sessionKey) throws UnknownSessionException {
        Serializable sessionId = getSessionId(sessionKey);
        ServletRequest request = null;
        if(sessionKey instanceof WebSessionKey){
            request = ((WebSessionKey)sessionKey).getServletRequest();
        }
        Session session = null;
        if(request != null && sessionId != null){
            session =  (Session) request.getAttribute(sessionId.toString());
        }
        if(session != null){
            return session;
        }
        try{
            session = super.retrieveSession(sessionKey);
        }catch(UnknownSessionException e){
            LOGGER.error(e.getMessage());
        }
        if(request != null && sessionId != null && session != null){
            request.setAttribute(sessionId.toString(), session);
        }

        return session;
    }
    @Override
    protected Serializable getSessionId(ServletRequest request, ServletResponse response) {
        String sessionId=WebUtils.toHttp(request).getHeader(AUTHORIZATION);
        if (sessionId != null){

            request.setAttribute(REFERENCED_SESSION_ID_SOURCE,REFERENCED_SESSION_ID_SOURCE);
            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID, sessionId);
            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_IS_VALID,Boolean.TRUE);
            return sessionId;
        }else {
            return super.getSessionId(request,response);
        }
    }

}
