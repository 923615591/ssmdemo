package com.aaa.ssm.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * className:TestRedisClusterConnect
 * discriptoin:
 * author:zz
 * createTime:2019-01-03 14:41
 */
public class TestRedisClusterConnect {
    public static void main(String[] args) {
        Set<HostAndPort> node =  new HashSet<HostAndPort>();
        node.add(new HostAndPort("192.168.21.140",6661));
        node.add(new HostAndPort("192.168.21.140",6662));
        node.add(new HostAndPort("192.168.21.140",6663));
        node.add(new HostAndPort("192.168.21.141",8881));
        node.add(new HostAndPort("192.168.21.141",8882));
        node.add(new HostAndPort("192.168.21.141",8883));
        JedisCluster jedisCluster = new JedisCluster(node);

        jedisCluster.set("qy86","马上毕业了");

        System.out.println(jedisCluster.get("qy86"));
    }
}
