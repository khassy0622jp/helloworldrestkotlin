package com.example.helloworldrestkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWorldRestKotlinApplication

fun main(args: Array<String>) {
	runApplication<HelloWorldRestKotlinApplication>(*args)
}
