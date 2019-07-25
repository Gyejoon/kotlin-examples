package com.gyejoong.webflux

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import java.io.Serializable
import java.time.LocalDateTime

/**
 * Created by 00700mm@gmail.com on 2019-07-25
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@RedisHash("point")
data class Point(
        @Id
        val id: String,
        var amount: Long,
        var refreshTime: LocalDateTime
) : Serializable {

    fun refresh(amount: Long, refreshTime: LocalDateTime) {
        if (refreshTime.isAfter(this.refreshTime)) {
            this.amount = amount
            this.refreshTime = refreshTime
        }
    }

}

interface PointRepository : CrudRepository<Point, String>