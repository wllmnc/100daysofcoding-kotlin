package houndred.days.of.code.demo.entity

import java.time.Instant

import javax.persistence.Entity;
import javax.persistence.Id

@Entity
class DemoEntity (@Id var id: String, var eventTime: Instant)