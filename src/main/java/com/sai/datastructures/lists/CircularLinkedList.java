package com.sai.datastructures.lists;

public class CircularLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public void addFirst(T data) {
		Node<T> temp = new Node<T>(data);
		if (head == null) {
			head = temp;
			tail = temp;
			head.setNext(tail);
		} else {
			temp.setNext(head);
			head = temp;
		}
		tail.setNext(head);
		size++;

	}

	public T removeFirst() {
		Node<T> temp = head;
		if(head==null){
			return null;
		}
		if(head==tail){
			head=null;
			tail=null;
		}else{
			head = head.getNext();
			temp.setNext(null);
			tail.setNext(head);
		}
		size--;
		return temp.getData();
	}

	public T get(int i) {
		if(i>=size || i<0){
			throw new IllegalArgumentException("Index out of exception");
		}
		Node<T> tempNode = head;
		int j=0;
		while(j<i){
			tempNode = tempNode.getNext();
		}
		return tempNode.getData();
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public void rotate(){
		if(head!=null){
			head = head.getNext();
			tail = tail.getNext();
		}

	}

}
