/**
 * 
 */
package com.ps.ds.stack.impl;

import com.ps.ds.stack.Stack;

/**
 * @author Prabal Srivastava
 *
 */
public class SimpleArrayStack<X> implements Stack<X> {

	private static final long serialVersionUID = -8308653481627400092L;
	private int capacity;
	private X[] data;
	private int top = -1;

	@SuppressWarnings("unchecked")
	public SimpleArrayStack() {
		this.capacity = 10;
		data = (X[]) new Object[capacity];
	}

	@SuppressWarnings("unchecked")
	public SimpleArrayStack(final int capacity) {
		this.capacity = capacity;
		data = (X[]) new Object[this.capacity];
	}

	/*
	 * @see com.ps.ds.stack.Stack#push(java.lang.Object)
	 */
	public void push(X item) {
		if (isFull()) {
			throw new IllegalStateException("Stack is full.");
		}
		data[++top] = item;
	}

	/*
	 * @see com.ps.ds.stack.Stack#pop()
	 */
	public X pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty.");
		}
		X item = data[top];
		data[top] = null;
		top--;
		return item;
	}

	/*
	 * @see com.ps.ds.stack.Stack#peek()
	 */
	public X peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty.");
		}
		return data[top];
	}

	/*
	 * @see com.ps.ds.stack.Stack#isEmpty()
	 */
	public boolean isEmpty() {
		return top < 0;
	}

	/*
	 * @see com.ps.ds.stack.Stack#isFull()
	 */
	public boolean isFull() {
		return size() == capacity;
	}

	/*
	 * @see com.ps.ds.stack.Stack#size()
	 */
	public int size() {
		return top + 1;
	}
	
	public static void main(String[] args) {
        //Stack<Integer> stack = new SimpleArrayStack<Integer>();
        Stack<Integer> stack = new SimpleArrayStack<Integer>(11);
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
