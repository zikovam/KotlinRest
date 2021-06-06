package com.zikovam.kotlinrest.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("PRODUCTS")
data class Product(@Id val id: String?, val category: Long , val description: String?)