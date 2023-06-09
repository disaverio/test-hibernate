package com.example.hibernatecartesianproductproblem

import com.example.hibernatecartesianproductproblem.repositories.ItemRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
public class ItemTest {

    @Autowired
    lateinit var itemRepository: ItemRepository

    @Test
    fun getAddresses() {
        val items = itemRepository.findByName("CIAONE")
        println("\tItems: ${items.size}\n\tAddress: ${items.first().details.addresses.size}\n\tContacts: ${items.first().details.contacts.size}")
    }
}
