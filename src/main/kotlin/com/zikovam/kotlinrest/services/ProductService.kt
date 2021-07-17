package com.zikovam.kotlinrest.services

import com.zikovam.kotlinrest.entities.Product
import com.zikovam.kotlinrest.repositories.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(val db: ProductRepository) {

    fun getAllProducts(): List<Product> = db.getAllProducts()

    fun save(product: Product){
        db.save(product)
    }

    fun getProductByCategory(category: Long): List<Product>{
        return db.getProductsByCategory(category)
    }
}