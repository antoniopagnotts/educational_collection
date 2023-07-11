package edu.util;

import java.util.Iterator;
import java.util.ListIterator;

public abstract class AbstractList<T> extends AbstractCollection<T> implements List<T> {
	
	/**
	 * Constructor
	 */
	protected AbstractList() {}
	
	/**
	 * Returns the element at the specified position in this list.
	 * @param index - index of the element to return
	 * @return the element at the specified position in this list.
	 */
	public abstract T get(int index);
	
	/**
	 * Returns true if this collection changed as a result of the call. (Returns false if this collection does not permit duplicates and already contains the specified element.)
	 * @param t - element whose presence in this collection is to be ensured
	 * @return true if this collection changed as a result of the call
	 */
	public abstract boolean add(T t);
	
	/**
	 * Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
	 * @param index - index at which the specified element is to be inserted
	 * @param t - element to be inserted
	 */
	public abstract void add(int index, T t);
	
	/**
	 * Inserts all of the elements in the specified collection into this list at the specified position . Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
	 * @param c - collection containing elements to be added to this collection
	 * @param index - index at which the specified element is to be inserted
	 * @return true if this collection changed as a result of the call
	 */
	public abstract boolean addAll(int index, Collection<? extends T> c);
	
	/**
	 * Returns a list iterator over the elements in this list (in proper sequence).
	 * @return a list iterator over the elements in this list (in proper sequence).
	 */
	public abstract ListIterator<T> listIterator();
	
	/**
	 * Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list. The specified index indicates the first element that would be returned by an initial call to next. An initial call to previous would return the element with the specified index minus one.
	 * @param index - index of the first element to be returned from the list iterator (by a call to next)
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	public abstract ListIterator<T> listIterator(int index);
	
	/**
	 * Returns an iterator over the elements in this collection. There are no guarantees concerning the order in which the elements are returned (unless this collection is an instance of some class that provides a guarantee).
	 * @return an iterator over the elements in this collection.
	 */
	public abstract Iterator<T> iterator();
	
}
