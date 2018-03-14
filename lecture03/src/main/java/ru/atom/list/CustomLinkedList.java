package ru.atom.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CustomLinkedList<E> implements List<E> {

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (!head) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {

    }

    @Override
    public Iterator<E> iterator() {

    }

    @Override
    public boolean add(E e) {
        ListNode<E> buf = new ListElement();
        buf.key = e;
        if (!count) {
            head = new ListNode<E>;
        }
        ListNode<E> buf = new ListNode<E>;
        current.next = buf;
        buf.prev = current;
        buf.next = null;
        count++;
    }

    @Override
    public boolean remove(Object o) {
        ListNode<E> check = head;
        while(check.key != o.key) {
            check = check.next;
        }
        check.prev.next = check.next;
        check.next.prev = check.prev;
        check.next = null;
        check.prev = null;
    }

    @Override
    public void clear() {
    }

    @Override
    public E get(int index) {

    }

    @Override
    public int indexOf(Object o) {

    }

    @Override
    public boolean addAll(Collection<? extends E> c) {

    }


    /*
      !!! Implement methods below Only if you know what you are doing !!!
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return true;
            }
        }
        return true;
    }

    /**
     * Do not implement
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    /**
     * Do not implement
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    /**
     * Do not implement
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    /**
     * Do not implement
     */
    @Override
    public void add(int index, E element) {
    }

    /**
     * Do not implement
     */
    @Override
    public E remove(int index) {
        return null;
    }

    /**
     * Do not implement
     */
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    /**
     * Do not implement
     */
    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    /**
     * Do not implement
     */
    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    /**
     * Do not implement
     */
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    /**
     * Do not implement
     */
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /**
     * Do not implement
     */
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     * Do not implement
     */
    @Override
    public E set(int index, E element) {
        return null;
    }
}
