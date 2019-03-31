package com.gyejoon.springwebmvc.blog

import org.commonmark.ext.autolink.AutolinkExtension
import org.commonmark.parser.Parser
import org.commonmark.renderer.html.HtmlRenderer
import org.springframework.stereotype.Service

/**
 * Created by 00700mm@gmail.com on 2019-03-31
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@Service
class MarkdownConverter : (String?) -> String {

    private val parser = Parser.builder().extensions(listOf(AutolinkExtension.create())).build()
    private val renderer = HtmlRenderer.builder().build()

    override fun invoke(input: String?): String {
        if (input == null || input == "") {
            return ""
        }
        return renderer.render(parser.parse(input))
    }
}