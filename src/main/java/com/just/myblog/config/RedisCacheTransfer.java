package com.just.myblog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by justGeeker
 * 2020/3/26 9:44
 * 416467337@qq.com
 * 传递bean
 */

public class RedisCacheTransfer
{

    public void setRedisTemplate(RedisTemplate redisTemplate) {
        RedisCache.setRedisTemplate(redisTemplate);
    }
}