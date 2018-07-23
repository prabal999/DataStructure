package com.ps.ds.stack.impl;

import com.ps.ds.common.Node;
import com.ps.ds.stack.Stack;

/**
 * @author Prabal Srivastava
 *
 */
public class LinkedListStack<X> implements Stack<X> {

	private static final long serialVersionUID = -2297369197219827835L;
	private Node<X> top;
	private int size;

	/*
	 * @see com.ps.ds.stack.Stack#push(java.lang.Object)
	 */
	public void push(X item) {
		Node<X> newNode = new Node<X>(item);
		if (null == top) {
			top = newNode;
		} else {
			newNode.setNext(top);
			top = newNode;
		}
		size++;
	}

	/*
	 * @see com.ps.ds.stack.Stack#pop()
	 */
	public X pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty.");
		}
		X data = top.getData();
		top = top.getNext();
		size--;
		return data;
	}

	/*
	 * @see com.ps.ds.stack.Stack#peek()
	 */
	public X peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty.");
		}
		return top.getData();
	}

	/*
	 * @see com.ps.ds.stack.Stack#isEmpty()
	 */
	public boolean isEmpty() {
		return null == top;
	}

	/*
	 * @see com.ps.ds.stack.Stack#isFull()
	 */
	@Deprecated
	public boolean isFull() {
		// This is growable stack, so it's never be full!
		return false;
	}

	/*
	 * @see com.ps.ds.stack.Stack#size()
	 */
	public int size() {
		return size;
	}
	

	public static void main(String[] args) {
        //Stack<Integer> stack = new LinkedListStack<Integer>();
        Stack<Integer> stack = new LinkedListStack<Integer>();
        System.out.println("isEmpty = " + stack.isEmpty());
        System.out.println("isFull = " + stack.isFull());
        System.out.println("size = " + stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("isEmpty = " + stack.isEmpty());
        System.out.println("isFull = " + stack.isFull());
        System.out.println("size = " + stack.size());
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        //stack.push(12);//:NOTE  Exception : Stack is full.
        System.out.println("isEmpty = " + stack.isEmpty());
        System.out.println("isFull = " + stack.isFull());
        System.out.println("size = " + stack.size());
        //System.out.println("1st = " + s1.peek());
        System.out.println("1st = " + stack.pop());
        System.out.println("2nd = " + stack.pop());
        System.out.println("3rd = " + stack.pop());
        System.out.println("4th = " + stack.pop());
        System.out.println("5th = " + stack.pop());
        //System.out.println("1st = " + s1.peek());
        System.out.println("6th = " + stack.pop());
        System.out.println("7th = " + stack.pop());
        System.out.println("8th = " + stack.pop());
        System.out.println("9th = " + stack.pop());
        System.out.println("10th= " + stack.pop());
        System.out.println("11th= " + stack.pop());
        //System.out.println("11th= " + stack.pop());//:NOTE  Exception : Stack is full.
        System.out.println("isEmpty = " + stack.isEmpty());
        System.out.println("isFull = " + stack.isFull());
        System.out.println("size = " + stack.size());
        
    }
}
