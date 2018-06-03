package com.sai.datastructures.lists;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SingleLinkedListTest {

	SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<Integer>();
	
	@Test
	public void testSizeZero() {
		int size =singleLinkedList.size();
		assertTrue("size equals 0", size==0 );
	}
	
	@Test
	public void testInsertOne(){
		singleLinkedList.addFirst(3);
		assertTrue(singleLinkedList.get(0)==3);
	}
	
	@Test
	public void testRemoveFirst(){
		singleLinkedList.addFirst(3);
		assertTrue(singleLinkedList.size()==1);
		assertTrue(singleLinkedList.removeFirst()==3);
		assertTrue(singleLinkedList.size()==0);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testGetEmptyList(){
		singleLinkedList.get(-1);	
	}
}
