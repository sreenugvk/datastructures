package com.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ILinkedListTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	

	@Test
	void testSize() {
		ILinkedList list= new ILinkedList();
		list.insertAtBegin("sreenu");
		assertEquals(1, list.size() );
	}

//	@Test
//	void testInsertAtBegin() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testInsertAtEnd() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testInsert() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testRemoveMatched() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testRemoveInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testRemoveString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testRemoveFirst() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testRemoveLast() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetPosition() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testClearList() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testToString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testMain() {
//		fail("Not yet implemented");
//	}

}
