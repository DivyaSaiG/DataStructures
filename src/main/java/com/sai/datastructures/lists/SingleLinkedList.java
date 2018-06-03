package com.sai.datastructures.lists;

public class SingleLinkedList<T> implements List<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addFirst(T data) {
		Node<T> temp = new Node<T>(data);
		if (head == null) {
			head = temp;
			tail = temp;
		} else {
			temp.setNext(head);
			head = temp;
		}
		size++;
	}

	@Override
	public T removeFirst() {
		if (head == null) {
			return null;
		}
		Node<T> temp = head;
		if (head == tail) {
			head = null;
			tail = null;

		} else {
			head = head.getNext();
			temp.setNext(null);
		}
		size--;
		return temp.getData();
	}

	@Override
	public T get(int i) {
		if (i >= size || i < 0) {
			throw new IllegalArgumentException("Index out of bound");
		}

		Node<T> tempNode = head;
		int j = 0;
		while (j < i) {
			tempNode = tempNode.getNext();
		}
		return tempNode.getData();
	}

	@Override
	public int size() {
		return size;
	}

}
