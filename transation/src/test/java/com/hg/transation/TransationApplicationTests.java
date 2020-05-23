package com.hg.transation;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TransationApplicationTests {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    void contextLoads() {
        redisTemplate.boundValueOps("new_key").set("new_value");
        redisTemplate.boundValueOps("new_key4").set("new_value4");
        stringRedisTemplate.boundValueOps("new_key3").set("new_value3");
    }

}
