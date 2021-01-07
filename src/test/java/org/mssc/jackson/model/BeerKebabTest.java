package org.mssc.jackson.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ActiveProfiles(profiles = "kebab")
@JsonTest
public class BeerKebabTest extends BaseTest {

	@Autowired
	ObjectMapper objectMapper;

	BeerDto dto;

	@BeforeEach
	void setUp() {
		dto = getBeerDto();
	}

	@Test
	void testKebabFieldsBeer() throws JsonProcessingException {
		String jsonKebabString = objectMapper.writeValueAsString(dto);
		System.out.println(jsonKebabString);
	}
}
