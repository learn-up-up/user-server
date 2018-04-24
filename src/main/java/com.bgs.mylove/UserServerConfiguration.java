package com.bgs.mylove;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@EnableAutoConfiguration
public class UserServerConfiguration extends WebMvcConfigurationSupport {

	@Bean
	@ConfigurationProperties(prefix="spring.redis")
	public JedisConnectionFactory getConnectionFactory(){
		return new JedisConnectionFactory();
	}

//	@Bean
//	@ConfigurationProperties(prefix="spring.lettuce")
//	public LettuceConnectionFactory getConnectionFactory(){
//		return new LettuceConnectionFactory();
//	}
//
	@Bean
	public RedisTemplate<String, ?> getRedisTemplate(){
		RedisTemplate<String,?> template = new StringRedisTemplate(getConnectionFactory());
		return template;
	}

}
