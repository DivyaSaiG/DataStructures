package com.sai.datastructures.stacksandqueues;

public class ArrayStack<T> implements Stack<T> {
	
	private static final int INITIAL_CAPACITY = 10;
	private Object[] stackArray;
	private int currentIndex=0;
	
	public ArrayStack() {
		this(INITIAL_CAPACITY);
	}
	
	public ArrayStack(int size) {
		stackArray = new Object[size];
	}

	@Override
	public void push(T data) {
		if(currentIndex < stackArray.length){
			stackArray[currentIndex++]=data;
		}
		else{
			throw new IllegalStateException("Stack overflow exception");
		}
		
	}

	@Override
	public T pop() {
		if(currentIndex>0){
			T temp = (T) stackArray[--currentIndex];
			stackArray[currentIndex+1]= null;
			return temp;
		}
		return null;
	}

	@Override
	public T peek() {
		if(currentIndex>0){
		return (T) stackArray[currentIndex-1];	
		}
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return currentIndex;
	}

}
