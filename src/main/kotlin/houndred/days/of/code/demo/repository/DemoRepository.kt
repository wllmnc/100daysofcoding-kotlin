package houndred.days.of.code.demo.repository

import houndred.days.of.code.demo.entity.DemoEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DemoRepository : JpaRepository<DemoEntity, Long> {
    fun findById(id: String): DemoEntity
}