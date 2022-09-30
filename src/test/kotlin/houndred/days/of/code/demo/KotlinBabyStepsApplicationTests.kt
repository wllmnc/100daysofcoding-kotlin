package houndred.days.of.code.demo

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import houndred.days.of.code.demo.control.DummyResponse
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content

@SpringBootTest
@AutoConfigureMockMvc
class KotlinBabyStepsApplicationTests @Autowired constructor(private val mockMvc: MockMvc) {

	val saveURL: String = "/save/"
	val getURL: String = "/get/"
	val mapper = jacksonObjectMapper()

	@Test
	fun contextLoads() {
	}

	@Test
	fun saveTest() {
		val saveId = "demoId"
		val result: MvcResult = mockMvc.perform(MockMvcRequestBuilders.get(saveURL + saveId).contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().contentType(MediaType.APPLICATION_JSON)).andReturn()

		val dummyResponse: DummyResponse = mapper.readValue(result.response.contentAsString)
		Assertions.assertEquals(200, result.response.status)
		Assertions.assertEquals(saveId, dummyResponse.id)
	}

	@Test
	fun getTestWithNoData() {
		val saveId = "demoId"
		val result: MvcResult = mockMvc.perform(MockMvcRequestBuilders.get(getURL + saveId).contentType(MediaType.APPLICATION_JSON))
				.andReturn()
		Assertions.assertEquals(404, result.response.status)
	}
}
