package edu.util;

import java.util.Iterator;

public abstract class AbstractCollection<T> extends Object implements Collection<T> {
	
	/**
	 * Constructor
	 */
	protected AbstractCollection() {}
	
	/**
	 * Returns true if this collection changed as a result of the call. (Returns false if this collection does not permit duplicates and already contains the specified element.)
	 * @param t - element whose presence in this collection is to be ensured
	 * @return true if this collection changed as a result of the call
	 */
	public abstract boolean add(T t);
	
	/**
	 * Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
	 * @param i - index at which the specified element is to be inserted
	 * @param t - element to be inserted
	 */
	public abstract void add(int i, T t);
	
	/**
	 * Adds all of the elements in the specified collection to this collection.
	 * @param c - collection containing elements to be added to this collection
	 * @return true if this collection changed as a result of the call
	 */
	public abstract boolean addAll(Collection<? extends T> c);
	
	/**
	 * Removes all of the elements from this collection.
	 */
	public void clear() {
		Iterator<T> it = this.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
	}
	
	/**
	 * Returns true if this collection contains the specified element. More formally, returns true if and only if this collection contains at least one element e such that (o==null ? e==null : o.equals(e)).
	 * @param o - element whose presence in this collection is to be tested
	 * @return true if this collection contains the specified element.
	 */
	@SuppressWarnings("unchecked")
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
	@SuppressWarnings("unchecked")
	public boolean containsAll(Collection<?> c) {
		boolean found = false;
		Iterator<T> it1 = this.iterator();
		Iterator<T> it2 = (Iterator<T>) c.iterator();
		while(it2.hasNext()) {
			T e2 = it2.next();
			while(it1.hasNext()) {
				T e1 = it1.next();
				if(e1.equals(e2)) {
					found = true;
					break;
				}
			}
			if(!found)
				return false;
			found = false;
		}
		return true;
	}
	
	/**
	 * Returns true if this collection contains no elements.
	 * @return true if this collection contains no elements.
	 */
	public boolean isEmpty() {
		return !this.iterator().hasNext();
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
	@SuppressWarnings("unchecked")
	public boolean remove(Object o) {
		T casted_o = (T)o;
		Iterator<T> it = this.iterator();
		while(it.hasNext()) {
			T t = it.next();
			if(t.equals(casted_o)) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Removes all of this collection's elements that are also contained in the specified collection.
	 * @param c - collection containing elements to be removed from this collection
	 * @return true if this collection changed as a result of the call
	 */
	@SuppressWarnings("unchecked")
	public boolean removeAll(Collection<?> c) {
		boolean ret = false;
		Iterator<T> it1 = this.iterator();
		Iterator<T> it2 = (Iterator<T>) c.iterator();
		while(it2.hasNext()) {
			T e2 = it2.next();
			while(it1.hasNext()) {
				T e1 = it1.next();
				if(e1.equals(e2)) {
					it1.remove();
					ret = true;
				}
			}
		}
		return ret;
	}
	
	/**
	 * Returns the number of elements in this collection. If this collection contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
	 * @return the number of elements in this collection.
	 */
	public int size() {
		int count = 0;
		Iterator<T> it = this.iterator();
		while(it.hasNext()) {
			count++;
			it.next();
		}
		return count;
	}
}
