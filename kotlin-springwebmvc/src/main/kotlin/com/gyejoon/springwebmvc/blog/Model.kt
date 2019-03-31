package com.gyejoon.springwebmvc.blog

import java.time.LocalDateTime
import javax.persistence.*

/**
 * Created by 00700mm@gmail.com on 2019-03-31
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@Entity
data class Article(
        val title: String,
        val headline: String,
        val content: String,
        @ManyToOne @JoinColumn val author: User,
        @Id @GeneratedValue val id: Long? = null,
        val addedAt: LocalDateTime = LocalDateTime.now()
)

@Entity
data class User(
        @Id val login: String,
        val firstname: String,
        val lastname: String,
        val description: String? = null
)