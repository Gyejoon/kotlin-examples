package com.gyejoong.grahpql

import graphql.ExecutionResult
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.io.Resource
import org.springframework.stereotype.Component

@Component
class GraphqlProvider(
        @Value("classpath:cafe.graphql")
        val resource: Resource
) : GraphqlUseCase {


    override fun execute(query: String): ExecutionResult {
        TODO("")
    }

}