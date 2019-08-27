package com.gyejoong.grahpql

import graphql.ExecutionResult

interface GraphqlUseCase {
    fun execute(query: String): ExecutionResult
}