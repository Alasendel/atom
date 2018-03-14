package ru.atom.list;

/**
 * Contains ref to next node, prev node and value
 */
public class ListNode<E> {
    private ListNode<E> head;
    private ListNode<E> tail;
    private ListNode<E> current = null;
    private int count = 0;
    private int key;
    private ListNode<E> next;
    private ListNode<E> prev;
}
