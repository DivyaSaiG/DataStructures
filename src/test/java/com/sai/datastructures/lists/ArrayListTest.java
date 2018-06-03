package com.sai.datastructures.lists;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ArrayListTest {
	ArrayList<Integer> arrayList = new ArrayList<>();

	@Test
	public void testSizeZero() {
		int size = arrayList.size();
		assertTrue("size didn't match", size == 0);
	}

	@Test
	public void testSizeNonzero() {
		arrayList.addFirst(9);
		int size = arrayList.size();
		assertTrue("size didn't match", size == 1);
	}

	@Test
	public void testAdd() {
		arrayList.addFirst(1);
		arrayList.addFirst(2);
		arrayList.addFirst(3);
		arrayList.addFirst(4);
		arrayList.addFirst(5);
		arrayList.addFirst(6);
		int size = arrayList.size();
		assertTrue("size didn't match", size == 6);

	}

	@Test
	public void testGetValidIndex() {
		arrayList.addFirst(1);
		arrayList.addFirst(2);
		arrayList.addFirst(3);
		arrayList.addFirst(4);
		arrayList.addFirst(5);
		arrayList.addFirst(6);
		int num = arrayList.get(5);
		assertTrue("size didn't match", num == 6);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetInValidIndex() {
		arrayList.addFirst(1);
		arrayList.addFirst(2);
		arrayList.addFirst(3);
		arrayList.addFirst(4);
		arrayList.addFirst(5);
		arrayList.addFirst(6);
		arrayList.get(6);
	}
	
	@Test
	public void testRemoveEmpty(){
		Integer num= arrayList.removeFirst();
		assertNull(num);
	}
	
	@Test
	public void testRemoveNonEmpty(){
		arrayList.addFirst(1);
		Integer num= arrayList.removeFirst();
		int size = arrayList.size();
		assertNotNull(num);
		assertTrue("out put not empty", num==1);
		assertTrue("array list size", size==0);
	}

}
