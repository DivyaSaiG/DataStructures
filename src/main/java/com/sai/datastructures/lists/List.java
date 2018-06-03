package com.sai.datastructures.lists;

public interface List<T> {
	
	void addFirst(T data);
	T removeFirst();
	T get(int i);
	int size();
}
