package com.gyejoong.grahpql.domain.repository

import com.gyejoong.grahpql.domain.entity.Coffee
import org.springframework.data.jpa.repository.JpaRepository

interface CoffeeRepository : JpaRepository<Coffee, Int>