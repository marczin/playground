package com.marcinrosol.webflux;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
class WebfluxApplicationTests {

	@Test
	void contextLoads() {
		Flux.just("John","Ela","sofie","elem4","glory")
				.filter(name -> name.startsWith("j"))
				.subscribe(System.out::println);

		//Mono.just()
	}

}
