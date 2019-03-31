package com.gyejoon.springwebmvc.blog

import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by 00700mm@gmail.com on 2019-03-31
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
interface ArticleRepository: JpaRepository<Article, Long> {
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository: JpaRepository<User, String>