package com.gyejoon.mybatis.blog

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

/**
 * Created by 00700mm@gmail.com on 2019-03-31
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@Mapper
interface BlogRepository {
    @Select("""
        SELECT * FROM blog
    """)
    fun findAll(): Iterable<Blog>


    @Select("""
        SELECT * FROM blog WHERE id=#{id}
    """)
    fun findById(@Param("id") id: Long): Blog
}