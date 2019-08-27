package com.gyejoong.grahpql

import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/graphql")
class GraphqlController(
        private val graphqlUseCase: GraphqlUseCase
) {

    @PostMapping
    fun graphqlByQuery(@RequestBody query: String)
            : ResponseEntity<Any> {
        val execute = graphqlUseCase.execute(query)

        return ok(execute)
    }

}