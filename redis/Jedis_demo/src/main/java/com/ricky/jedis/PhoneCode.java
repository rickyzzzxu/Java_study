package com.ricky.jedis;

import redis.clients.jedis.Jedis;

import java.util.Random;

public class PhoneCode {

    public static void main(String[] args) {

        //verifyCode("13678765435");
        getRedisCode("13678765435","863820");

    }

    // 1.生成验证码
    public static String getCode() {

        Random random = new Random();
        String code = "";

        for (int i = 0; i < 6; i++) {
            int rand = random.nextInt(10);
            code += rand;
        }

        return code;
    }

    // 验证码放入redis中，设置发送次数及过期时间
    public static void verifyCode(String phone) {
        Jedis jedis = new Jedis("192.168.34.128", 6379);
        jedis.auth("xdg112233");

        // 手机发送次数key
        String countKey = "VerifyCode" + phone + ":count";
        // 验证码key
        String codeKey = "VerifyCode" + phone + ":code";

        String count = jedis.get(countKey);
        if (count == null) {
            jedis.setex(countKey, 24 * 60 * 60, "1");
        } else if (Integer.parseInt(count) < 3) {
            jedis.incr(countKey);
        } else {
            System.out.println("今天发送次数已超过三次！！");
        }

        String vcode = getCode();
        jedis.setex(codeKey, 120, vcode);
        jedis.close();
    }

    // 3.验证码校验
    public static void getRedisCode(String phone, String code) {
        Jedis jedis = new Jedis("192.168.34.128", 6379);
        jedis.auth("xdg112233");

        String codeKey = "VerifyCode" + phone + ":code";
        String redisCode = jedis.get(codeKey);
        //jedis.close();

        if (redisCode.equals(code)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }

    }

}
