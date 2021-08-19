package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemBusinessServiceTestWithStub {

	@Test
	void test() {
		ItemBusinessService businessService = new ItemBusinessService();
		businessService.setRepository(new ItemRepositoryStub());
	}

}
