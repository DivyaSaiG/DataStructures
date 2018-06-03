package com.sai.datastructures.lists;

public class ArrayList<T> {

	private final static int INTITIAL_CAPACITY = 5;
	private Object[] arrayOne;
	private int currentIndex;

	public ArrayList() {
		this(INTITIAL_CAPACITY);
	}

	public ArrayList(int size) {
		arrayOne = new Object[size];
		currentIndex = 0;
	}

	public void addFirst(T obj) {
		if (currentIndex >= arrayOne.length) {
			Object[] arrayTwo = new Object[2 * arrayOne.length];

			for (int i = 0; i < arrayOne.length; i++) {
				arrayTwo[i] = arrayOne[i];
			}

			arrayOne = arrayTwo;
		}
		arrayOne[currentIndex++] = obj;

	}

	public T removeFirst() {
		if (currentIndex > 0) {
			return (T) arrayOne[--currentIndex];
		}
		return null;
	}

	public T get(int i) {

		if (i >= 0 && i < currentIndex) {
			return (T) arrayOne[i];
		}
		throw new IllegalArgumentException("Index out of bound");
	}

	public int size() {
		return currentIndex;
	}

}
