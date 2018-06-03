package com.sai.datastructures.stacksandqueues;
import com.sai.datastructures.lists.SingleLinkedList;

public class LinkedStack<T> implements Stack<T> {
SingleLinkedList<T> singleLinkedList = new SingleLinkedList<T>();
	@Override
	public void push(T data) {
		singleLinkedList.addFirst(data);		
	}

	@Override
	public T pop() {
		return singleLinkedList.removeFirst();
	}

	@Override
	public T peek() {
		return singleLinkedList.get(singleLinkedList.size()-1);
	}

	@Override
	public int size() {
		
		return singleLinkedList.size();
	}

}
