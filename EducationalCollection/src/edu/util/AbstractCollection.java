package edu.util;

import java.util.Iterator;

public abstract class AbstractCollection<T> extends Object implements Collection<T> {
	
	protected AbstractCollection() {}
	
	/**
	 * Returns true if this collection changed as a result of the call. (Returns false if this collection does not permit duplicates and already contains the specified element.)
	 * @param t - element whose presence in this collection is to be ensured
	 * @return true if this collection changed as a result of the call
	 */
	boolean add(T t);
	
	/**
	 * Adds all of the elements in the specified collection to this collection.
	 * @param c - collection containing elements to be added to this collection
	 * @return true if this collection changed as a result of the call
	 */
	boolean addAll(Collection<? extends T> c);
	
	/**
	 * Removes all of the elements from this collection.
	 */
	void clear();
	
	/**
	 * Returns true if this collection contains the specified element. More formally, returns true if and only if this collection contains at least one element e such that (o==null ? e==null : o.equals(e)).
	 * @param o - element whose presence in this collection is to be tested
	 * @return true if this collection contains the specified element.
	 */
	public boolean contains(Object o) {
		T casted_o = (T)o;
		for(T t: this)
			if(casted_o.equals(t)) return true;
		return false;
	}
	
	/**
	 * Returns true if this collection contains all of the elements in the specified collection.
	 * @param c - collection to be checked for containment in this collection
	 * @return true if this collection contains all of the elements in the specified collection
	 */
	boolean containsAll(Collection<?> c);
	
	/**
	 * Returns true if this collection contains no elements.
	 * @return true if this collection contains no elements.
	 */
	public boolean isEmpty() {
		return size() == 0;
	}
	
	/**
	 * Returns an iterator over the elements in this collection. There are no guarantees concerning the order in which the elements are returned (unless this collection is an instance of some class that provides a guarantee).
	 * @return an iterator over the elements in this collection.
	 */
	public abstract Iterator<T> iterator();
	
	/**
	 * Removes a single instance of the specified element from this collection, if it is present.
	 * @param o
	 * @return true if an element was removed as a result of this call
	 */
	boolean remove(Object o);
	
	/**
	 * Removes all of this collection's elements that are also contained in the specified collection.
	 * @param c - collection containing elements to be removed from this collection
	 * @return true if this collection changed as a result of the call
	 */
	boolean removeAll(Collection<?> c);
	
	/**
	 * Returns the number of elements in this collection. If this collection contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
	 * @return the number of elements in this collection.
	 */
	public abstract int size();
}
