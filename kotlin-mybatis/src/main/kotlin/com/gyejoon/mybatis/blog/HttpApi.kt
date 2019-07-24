package com.gyejoon.mybatis.blog

import org.springframework.web.bind.annotation.*
import java.lang.IllegalArgumentException

/**
 * Created by 00700mm@gmail.com on 2019-04-01
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@RestController
@RequestMapping("/api/articles")
class ArticleController(private val repository: BlogRepository,
                        private val markdownConverter: MarkdownConverter) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long, @RequestParam converter: String?) = when (converter) {
        "markdown" -> repository.findAll(id).map {
            it.copy(
                    headline = markdownConverter.invoke(it.headline),
                    content = markdownConverter.invoke(it.content)
            )
        }
        null -> repository.findById(id)
        else -> throw IllegalArgumentException("markdown converter만 지원됩니다.")
    }
}

@RestController
@RequestMapping("/api/users")
class UserController(private val repository: UserRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{login}")
    fun findOne(@PathVariable login: String) = repository.findById(login)
}