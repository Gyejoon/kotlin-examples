package com.gyejoong.webflux

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.core.ReactiveRedisTemplate
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories
import org.springframework.data.redis.serializer.RedisSerializationContext

/**
 * Created by 00700mm@gmail.com on 2019-07-25
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@Configuration
@EnableRedisRepositories
class RedisRepositoryConfig(
        @Value("\${spring.redis.host}")
        val redisHost: String,

        @Value("\${spring.redis.port}")
        val redisPort: Int
) {

    @Bean
    fun reactiveRedisConnectionFactory() = LettuceConnectionFactory(redisHost, redisPort)

    @Bean
    fun reactiveRedisConnection(redisConnectionFactory: ReactiveRedisConnectionFactory) = redisConnectionFactory.reactiveConnection

}