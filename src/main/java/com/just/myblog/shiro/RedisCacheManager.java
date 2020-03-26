package com.just.myblog.shiro;

/**
 * Created by justGeeker
 * 2020/3/25 21:31
 * 416467337@qq.com
 * 实现用户角色、权限缓存管理
 */
import java.util.Collection;
import java.util.Set;


import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.alibaba.fastjson.JSONObject;


public class RedisCacheManager implements CacheManager {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisCacheManager.class);
    //@Resource RedisUtil redisUtil;

    @Override
    public <K, V> Cache<K, V> getCache(String arg0) throws CacheException {
        return new RedisCache<K, V>();
    }

    class RedisCache<K, V> implements Cache<K, V>{

        private static final String CACHE_KEY = "redis-cache";

        @Override
        public void clear() throws CacheException {
            redisTemplate.delete(CACHE_KEY);
        }

        private String toString(Object obj){
            if(obj instanceof String){
                return obj.toString();
            }else{
                return JSONObject.toJSONString(obj);
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public V get(K k) throws CacheException {
            LOGGER.info("get field:{}", toString(k));
            return (V)redisTemplate.boundHashOps(CACHE_KEY).get(k);
        }

        @SuppressWarnings("unchecked")
        @Override
        public Set<K> keys() {
            LOGGER.info("keys");
            return (Set<K>)redisTemplate.boundHashOps(CACHE_KEY).keys();
        }

        @Override
        public V put(K k, V v) throws CacheException {
            LOGGER.info("put field:{}, value:{}", toString(k), toString(v));
            redisTemplate.boundHashOps(CACHE_KEY).put(k, v);
            return v;
        }

        @Override
        public V remove(K k) throws CacheException {
            LOGGER.info("remove field:{}", toString(k));
            V v = get(k);
            redisTemplate.boundHashOps(CACHE_KEY).delete(k);
            return v;
        }

        @Override
        public int size() {
            int size = redisTemplate.boundHashOps(CACHE_KEY).size().intValue();
            LOGGER.info("size:{}", size);
            return size;
        }

        @SuppressWarnings("unchecked")
        @Override
        public Collection<V> values() {
            LOGGER.info("values");
            return (Collection<V>)redisTemplate.boundHashOps(CACHE_KEY).values();
        }

        public String getCacheKey() {
            return "RedisCache";
        }

    }

}