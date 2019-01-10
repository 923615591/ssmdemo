package com.aaa.ssm.util;

/**
 * className:JedisDao
 * discriptoin:
 * author:zz
 * createTime:2018-12-29 16:51
 */
public interface JedisDao {
    /**
     * 放入缓存
     * @param key
     * @param value
     */
    void putObject(Object key, Object value);
    /**
     * 清除缓存
     * @param arg0
     * @return
     */
    Object removeObject(Object arg0);
    /**
     * 从缓存中获取
     * @param arg0
     * @return
     */
    Object getObject(Object arg0);
}
