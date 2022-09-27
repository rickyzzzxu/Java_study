package com.ricky.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisDemo1 {

    public static void main(String[] args) {

        Jedis jedis = new Jedis("192.168.34.128", 6379);

        // redis密码
        jedis.auth("xdg112233");

        String ping = jedis.ping();

        System.out.println(ping);

        jedis.close();
    }

    @Test
    public void demo2() {
        //创建Jedis对象
        Jedis jedis = new Jedis("192.168.34.128", 6379);
        jedis.auth("xdg112233");

        jedis.sadd("names", "lucy");
        jedis.sadd("names", "mary");

        Set<String> names = jedis.smembers("names");
        System.out.println(names);
        jedis.close();
    }

}
