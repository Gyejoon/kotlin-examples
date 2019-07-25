package com.gyejoon.jooq

import org.jooq.impl.DefaultDSLContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by 00700mm@gmail.com on 2019-04-03
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@Configuration
class DslConfig {

    @Bean
    fun dslContext(configuration: org.jooq.Configuration): DefaultDSLContext {
        return DefaultDSLContext(configuration)
    }

}