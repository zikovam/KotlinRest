package com.zikovam.kotlinrest.controllers

import com.amazonaws.xray.spring.aop.XRayEnabled
import com.zikovam.kotlinrest.entities.Product
import com.zikovam.kotlinrest.services.ProductService
import com.zikovam.kotlinrest.util.ProductDescription
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("product")
@XRayEnabled
class ProductController(val service: ProductService) {
    @GetMapping("/{category}")
    fun getById(@PathVariable category: Long) : List<Product> {
        return service.getProductByCategory(category)
    }

    @PostMapping("/{category}/add")
    fun save(@PathVariable category: Long, @RequestBody description: ProductDescription){
        val product = Product(null, category, description.description ?: "Default description from REST API")
        service.save(product)
    }

    @GetMapping
    fun getAll() : List<Product>{
        return service.getAllProducts()
    }
}