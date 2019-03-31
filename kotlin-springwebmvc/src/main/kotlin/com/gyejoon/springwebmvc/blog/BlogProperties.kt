package com.gyejoon.springwebmvc.blog

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Created by 00700mm@gmail.com on 2019-04-01
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@ConfigurationProperties("blog")
class BlogProperties {
    lateinit var title: String
    val banner = Banner()

    class Banner {
        var title: String? = null
        lateinit var content: String
    }
}