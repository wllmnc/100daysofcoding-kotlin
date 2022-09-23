package houndred.days.of.code.demo.repository

import houndred.days.of.code.demo.entity.DemoEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DemoRepository : CrudRepository<DemoEntity, Long> {
    fun findById(id: String): DemoEntity?
}