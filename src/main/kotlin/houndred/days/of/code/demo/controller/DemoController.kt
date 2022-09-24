package houndred.days.of.code.demo.controller

import houndred.days.of.code.demo.entity.DemoEntity
import houndred.days.of.code.demo.service.DemoService
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@Api
class DemoController( @Autowired val service: DemoService) {

    @GetMapping("/save/{id}")
    fun saveId(@PathVariable id: String): Boolean? {
        return service.saveDemoEntity(id)
    }

    @GetMapping("/get/{id}")
    fun get(@PathVariable id: String): DemoEntity? {
        return service.findById(id)
    }

    @GetMapping("/getAll")
    fun getAll(): Iterable<DemoEntity> {
        return service.getAll()
    }
}