package com.gyejoon.restdocs

import javax.persistence.Entity
import javax.persistence.Id

/**
 * Created by 00700mm@gmail.com on 2019-04-02
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@Entity
data class User(
       @Id val username: String,
       val firstname: String,
       val lastname: String,
       val description: String? = null
)