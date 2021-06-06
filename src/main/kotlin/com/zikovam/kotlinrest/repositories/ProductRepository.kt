package com.zikovam.kotlinrest.repositories

import com.zikovam.kotlinrest.entities.Product
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ProductRepository: CrudRepository<Product, Long> {
    @Query("select * from PRODUCTS")
    fun getAllProducts(): List<Product>

    fun getProductByCategory(category: Long): Product
}