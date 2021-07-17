package com.zikovam.kotlinrest.repositories

import com.amazonaws.xray.spring.aop.XRayEnabled
import com.zikovam.kotlinrest.entities.Product
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

@XRayEnabled
interface ProductRepository: CrudRepository<Product, Long> {
    @Query("select * from PRODUCTS")
    fun getAllProducts(): List<Product>

    fun getProductsByCategory(category: Long): List<Product>
}