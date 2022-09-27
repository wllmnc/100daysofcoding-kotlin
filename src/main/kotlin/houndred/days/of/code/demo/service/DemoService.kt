package houndred.days.of.code.demo.service

import houndred.days.of.code.demo.entity.DemoEntity
import houndred.days.of.code.demo.repository.DemoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DemoService  @Autowired constructor(private val repository: DemoRepository) {

    fun findById(id: String): DemoEntity {
        return repository.findById(id)
    }

    fun getAll(): Iterable<DemoEntity> {
        return repository.findAll()
    }

    fun removeDemoEntity(id: String): DemoEntity {
        val demoItemToRemove = repository.findById(id)
        if (demoItemToRemove != null) {
            repository.delete(demoItemToRemove)
        }
        return demoItemToRemove
    }

    fun saveDemoEntity(id: String): DemoEntity {
        return repository.save(DemoEntity(id, java.time.Instant.now()))
    }

}