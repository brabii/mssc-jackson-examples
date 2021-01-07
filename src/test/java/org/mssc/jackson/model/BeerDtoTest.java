package org.mssc.jackson.model;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import com.fasterxml.jackson.databind.ObjectMapper;

@JsonTest
public class BeerDtoTest extends BaseTest {

	@Autowired
	ObjectMapper objectMapper;

	@Test
	void testFromBeerToJson() throws Exception {
		BeerDto dto = getBeerDto();
		String jsonString = objectMapper.writeValueAsString(dto);
		System.out.println(jsonString);
	}

	@Test
	void testFromJsonToBeer() throws IOException {
		String jsonString = "{\"id\":\"0cfda144-0f01-4777-8d2a-06b0938f6e74\",\"beerName\":\"Beer name\",\"beerStyle\":\"ALE\",\"upc\":122121,\"price\":12.99,\"createdDate\":\"2021-01-07T14:44:06.803624+01:00\",\"lastUpdatedDate\":\"2021-01-07T14:44:06.8056291+01:00\"}";
		BeerDto dto = objectMapper.readValue(jsonString, BeerDto.class);
		System.out.println(dto);
	}
}
