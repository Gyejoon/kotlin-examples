package com.gyejoon.springwebmvc.blog

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.domain.Example
import org.springframework.test.context.junit.jupiter.SpringExtension
import javax.persistence.Id

/**
 * Created by 00700mm@gmail.com on 2019-03-31
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@ExtendWith(SpringExtension::class)
@DataJpaTest
class RepositoriesTests(@Autowired val entityManager: TestEntityManager,
                        @Autowired val userRepository: UserRepository,
                        @Autowired val articleRepository: ArticleRepository) {

    @Test
    fun `When findById then return Article`() {
        val gyejoong = User("gyejoong", "Gye", "Joong")
        entityManager.persist(gyejoong)
        val article = Article("Spring Framework 5.0 with kotlin", "hello", "my name is spring", gyejoong)
        entityManager.persist(article)
        entityManager.flush()

        val found = articleRepository.findById(article.id!!)

        assertThat(found.get()).isEqualTo(article)
    }

    @Test
    fun `When findById then return User`() {
        val juergen = User("gyejoong", "Gye", "Joong")
        entityManager.persist(juergen)
        entityManager.flush()

        val found = userRepository.findById(juergen.login)

        assertThat(found.get()).isEqualTo(juergen)
    }

    @Test
    fun `Query By Example이 잘 동작하는지 확인`() {
        val users = userRepository.findAll(Example.of(
                User("Gyejoon", "Gye", "Joong")
        ))

        assertThat(users.first().login).isEqualTo("Gyejoon")
        assertThat(users.size).isEqualTo(1)
        assertThat(users.first().firstname).isEqualTo("Gye")
        assertThat(users.first().lastname).isEqualTo("Joong")
    }
}