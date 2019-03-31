package com.gyejoon.springwebmvc

import com.gyejoon.springwebmvc.blog.*
import com.samskivert.mustache.Mustache
import org.springframework.boot.Banner
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class SpringwebmvcApplication {

    @Bean
    fun mustacheCompiler(loader: Mustache.TemplateLoader?) =
            Mustache.compiler().escapeHTML(false).withLoader(loader)

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository) = CommandLineRunner {
        val user = User("Gyejoon", "Gye", "Joong")
        userRepository.save(user)

        articleRepository.saveAll(listOf(
                Article(
                        "삶과 죽음의 경계선",
                        "Life and Dead",
                        "삶과 죽음 그것은 무엇",
                        user,
                        1
                ),
                Article(
                        "Spring Framework 5 톺아보기",
                        "Spring Boot2+",
                        "Spring Webflux, Reactor",
                        user,
                        2
                )
        ))
    }
}


fun main(args: Array<String>) {
    runApplication<SpringwebmvcApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
