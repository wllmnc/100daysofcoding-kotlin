package houndred.days.of.code.demo.controller

import houndred.days.of.code.demo.control.DummyResponse
import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@Api
class DemoController {

    @GetMapping("/dummy/{id}")
    fun insertId(@PathVariable id: String): DummyResponse? {
        return DummyResponse(id, java.time.Instant.now())
    }
}