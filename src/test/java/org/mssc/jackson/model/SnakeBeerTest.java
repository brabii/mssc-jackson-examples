package org.mssc.jackson.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ActiveProfiles(profiles = "snake")
@JsonTest
public class SnakeBeerTest extends BaseTest {
	@Autowired
	ObjectMapper objectMapper;

	@Test
	void testSnakeFieldsBeer() throws JsonProcessingException {

		BeerDto dto = getBeerDto();
		String jsonSnakeString = objectMapper.writeValueAsString(dto);

		System.out.println(jsonSnakeString);
	}
}
