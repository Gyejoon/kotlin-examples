package com.gyejoong.elk

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableAutoConfiguration(exclude = [DataSourceAutoConfiguration::class])
class ElkApplication {

    private val log = LoggerFactory.getLogger(this.javaClass)

    @Bean
    fun init() = CommandLineRunner {
        var i = 0
        while (true) {
            Thread.sleep(3000)
            if (1 != 1) break
            log.info("Hello World ::: {}", ++i)
        }
    }

}

fun main(args: Array<String>) {
    runApplication<ElkApplication>(*args)
}
