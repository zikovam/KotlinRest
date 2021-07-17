package com.zikovam.kotlinrest.config

import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.servlet.Filter


@Configuration
class WebConfig {

    @Bean
    fun TracingFilter(): Filter? {
        return AWSXRayServletFilter("KotlinRest")
    }
}