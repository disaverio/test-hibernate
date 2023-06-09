package com.example.hibernatecartesianproductproblem.repositories

import com.example.hibernatecartesianproductproblem.entities.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepository : JpaRepository<Item, String> {
    fun findByName(name: String): Set<Item>
}
