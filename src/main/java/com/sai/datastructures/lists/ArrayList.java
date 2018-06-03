package com.sai.datastructures.lists;

public class ArrayList<T> implements List<T> {

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

	@Override
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

	@Override
	public T removeFirst() {
		if (currentIndex > 0) {
			return (T) arrayOne[--currentIndex];
		}
		return null;
	}

	@Override
	public T get(int i) {

		if (i >= 0 && i < currentIndex) {
			return (T) arrayOne[i];
		}
		throw new IllegalArgumentException("Index out of bound");
	}

	@Override
	public int size() {
		return currentIndex;
	}

}
