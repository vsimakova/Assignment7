package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	
	@Test
	void should_add_one_item_to_list() {
		CustomArrayList<Integer> arrayList = new CustomArrayList<>();
		arrayList.add(13);
		Integer expectedResult = arrayList.get(0);
		Integer expectedSize = arrayList.getSize();
		
		assertEquals(13, expectedResult);
		assertEquals(1, expectedSize);
	}
	
	@Test
	void should_add_11_items_to_list() {
		CustomArrayList<Integer> arrayList = new CustomArrayList<>();
		
		for (int i = 1; i <= 11; i++) {
			arrayList.add(i);
		}
		for (int i = 0; i < 11; i++) {
			assertEquals(i + 1, arrayList.get(i));
		}
		assertEquals(11, arrayList.getSize());
	}
	
	@Test
	void should_add_element_at_certain_idx() {
		CustomArrayList<Integer> arrayList = new CustomArrayList<>();
		for (int i = 0; i < 11; i++) {
			arrayList.add(i + 1);
		}
		arrayList.add(3, 12);
		arrayList.add(5, 13);
		arrayList.add(7, 14);
		
		assertEquals(12, arrayList.get(3));
		assertEquals(13, arrayList.get(5));
		assertEquals(14, arrayList.get(7));
	}
	
	@Test
	void should_remove_element_from_list() {
		CustomArrayList<Integer> arrayList = new CustomArrayList<>();
		for (int i = 0; i < 11; i++) {
			arrayList.add(i + 1);
		}
		arrayList.add(3, 12);
		assertEquals(12, arrayList.get(3));
		arrayList.remove(3);
		assertEquals(4, arrayList.get(3));	
	}
} 
