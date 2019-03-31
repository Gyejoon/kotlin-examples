package com.gyejoon.springwebmvc.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

/**
 * Created by 00700mm@gmail.com on 2019-03-31
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@Controller
class UiController(private val repository: ArticleRepository,
                   private val markdownConverter: MarkdownConverter,
                   private val properties: BlogProperties) {

    @GetMapping("/blog")
    fun blog(model: Model): String {
        model["title"] = properties.title
        model["banner"] = properties.banner
        model["articles"] = repository.findAllByOrderByAddedAtDesc().map {
            it.render()
        }
        return "blog"
    }

    @GetMapping("/article/{id}")
    fun article(@PathVariable id: Long, model: Model): String {
        val article = repository
                .findById(id)
                .orElseThrow { IllegalArgumentException("잘못된 요청 Id 값입니다.") }
                .render()
        model["title"] = article.title
        model["article"] = article
        return "article"
    }

    fun Article.render() = RenderedArticle(
            title,
            markdownConverter.invoke(headline),
            markdownConverter.invoke(content),
            author,
            id,
            addedAt.format()
    )

    data class RenderedArticle(
            val title: String,
            val headline: String,
            val content: String,
            val author: User,
            val id: Long?,
            val addedAt: String
    )
}