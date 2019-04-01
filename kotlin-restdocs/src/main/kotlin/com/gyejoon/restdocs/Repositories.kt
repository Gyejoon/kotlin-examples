package com.gyejoon.restdocs

import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by 00700mm@gmail.com on 2019-04-02
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
interface UserRepository: JpaRepository<User, Long>