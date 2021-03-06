package com.aaa.ssm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;

/**
 * className:JedisClusterImpl
 * discriptoin:
 * author:zz
 * createTime:2019-01-03 15:10
 */
@Component
public class JedisClusterImpl implements JedisClusterInterF {

    @Autowired
   private JedisCluster jedisCluster;

    @Override
    public void putObject(Object key, Object value) {
        System.out.println(SerializeUtil.serialize(key)+".......");
        jedisCluster.set(SerializeUtil.serialize(key),SerializeUtil.serialize(value));
    }

    @Override
    public Object removeObject(Object arg0) {
        return   jedisCluster.del(SerializeUtil.serialize(arg0));
    }

    @Override
    public Object getObject(Object arg0) {
        System.out.println("...."+SerializeUtil.serialize(arg0));
        byte[] bytes = jedisCluster.get(SerializeUtil.serialize(arg0));
        return SerializeUtil.unserialize(bytes);
    }
}
