package houndred.days.of.code.demo.control

import java.time.Instant

class DummyResponse(id: String, time: Instant) {
    val id = id
    val timeStamp = time.toString();
}