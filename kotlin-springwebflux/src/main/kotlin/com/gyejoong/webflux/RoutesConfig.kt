package com.gyejoong.webflux

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.net.URI

/**
 * Created by 00700mm@gmail.com on 2019-07-25
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@Configuration
class RoutesConfig {

    @Bean
    fun routes(
            pointRepository: PointRepository
    ) = router {
        ("/v1" and accept(MediaType.APPLICATION_JSON)).nest {
            GET("/points") {
                ok().body(
                        Flux.fromIterable(
                                pointRepository.findAll()
                        ),
                        Point::class.java
                )
            }

            POST("/points") {
                it.bodyToMono(Point::class.java)
                        .flatMap { point -> Mono.just(pointRepository.save(point)) }
                        .flatMap { id -> created(URI.create("/v1/points/$id")).build() }
            }
        }
    }
}
