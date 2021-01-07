package org.mssc.jackson.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

// ceci pour charger un beerDto
public class BaseTest {

	BeerDto getBeerDto() {

		return BeerDto.builder()
				.id(UUID.randomUUID())
				.beerName("Beer name")
				.beerStyle("ALE")
				.createdDate(OffsetDateTime.now())
				.lastUpdatedDate(OffsetDateTime.now())
				.upc(122121L)
				.price(new BigDecimal("12.99"))
				.build();
	}

}
