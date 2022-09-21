package houndred.days.of.code.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBabyStepsApplication

fun main(args: Array<String>) {
	println("Hello, World!")
	runApplication<KotlinBabyStepsApplication>(*args)
}
