/**
 * 
 */
package com.ps.ds.stack.impl;

import java.util.Arrays;

import com.ps.ds.stack.Stack;

/**
 * @author Prabal Srivastava
 *
 */
public class DynamicArrayStack<X> implements Stack<X> {

	private static final long serialVersionUID = 4727853189914114016L;
	private X[] data;
	private int top = -1;
	private int capacity;
	
	@SuppressWarnings("unchecked")
	public DynamicArrayStack() {
		this.capacity = 10;
		this.data = (X[]) new Object[capacity];
	}
	
	@SuppressWarnings("unchecked")
	public DynamicArrayStack(final int capacity) {
		this.capacity = capacity;
		this.data = (X[]) new Object[this.capacity];
	}

	public void push(X item) {
		if(size() == capacity) {
			expand();
		}
		data[++top] = item;
	}

	public X pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Stackis empty.");
		}
		X item = data[top];
		data[top--] = null;
		shrink();
		return item;
	}

	public X peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Stackis empty.");
		}
		return data[top];
	}

	public boolean isEmpty() {
		return top < 0;
	}

	//As this is a growable stack, so it's not useful.
	@Deprecated
	public boolean isFull() {
		return false;
	}

	public int size() {
		return top + 1;
	}
	
	private void expand() {
		if(data.length == capacity) {
			capacity *= 2;
			data = Arrays.copyOf(data, capacity);
		}
	}
	
	private void shrink() {
		if(data.length == capacity/2) {
			capacity /= 2;
			data = Arrays.copyOf(data, capacity);
		}
	}

	public static void main(String[] args) {
        //Stack<Integer> stack = new DynamicArrayStack<Integer>();
        Stack<Integer> stack = new DynamicArrayStack<Integer>();
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
