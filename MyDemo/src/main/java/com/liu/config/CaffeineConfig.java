package com.liu.config;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * ClassName: CaffeineConfig
 * Description:
 * date: 2022/3/30 13:55
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
@Configuration
public class CaffeineConfig {
    @Bean
    public Cache<String,Object> caffeineCache(){
        return Caffeine.newBuilder()
                .initialCapacity(128)//初始大小
                .maximumSize(1024)//最大数量
                .expireAfterWrite(60, TimeUnit.SECONDS)//过期时间
                .build();
    }
}