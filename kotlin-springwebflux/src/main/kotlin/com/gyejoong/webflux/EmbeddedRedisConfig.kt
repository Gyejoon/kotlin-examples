package com.gyejoong.webflux

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import redis.embedded.RedisServer
import java.io.IOException
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

/**
 * Created by 00700mm@gmail.com on 2019-07-25
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@Profile("local")
@Configuration
class EmbeddedRedisConfig(
        @Value("\${spring.redis.port}")
        val redisPort: Int
) {

    lateinit var redisServer: RedisServer

    @Throws(IOException::class)
    @PostConstruct
    fun redisServer() {
        redisServer = RedisServer(redisPort)
        redisServer.start()
    }

    @PreDestroy
    fun stopRedis() {
        redisServer.stop()
    }

}
