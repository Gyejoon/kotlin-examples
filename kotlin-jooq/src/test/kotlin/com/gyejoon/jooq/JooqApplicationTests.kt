package com.gyejoon.jooq

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestTemplate
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class JooqApplicationTests(@Autowired private val testTemplate: TestTemplate) {

	@Test
	fun `Assert home page and status code`() {

	}

}
