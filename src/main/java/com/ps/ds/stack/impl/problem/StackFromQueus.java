package com.ps.ds.stack.impl.problem;

import java.util.LinkedList;
import java.util.Queue;

import com.ps.ds.stack.Stack;

/**
 * 2. Stack from Queues: How many Queues are required for making a Stack?
 * (Implement it) (Book : 3.4) (Book2: 4.8.12)
 * 
 * @author Prabal Srivastava
 *
 */
public class StackFromQueus<X> implements Stack<X> {

	private static final long serialVersionUID = 1L;

	private Queue<X> queue1;
	private Queue<X> queue2;

	public StackFromQueus() {
		queue1 = new LinkedList<X>();
		queue2 = new LinkedList<X>();
	}

	public void push(X item) {
		if (queue1.isEmpty()) {
			queue1.add(item);
		} else {
			while (!queue1.isEmpty()) {
				queue2.add(queue1.remove());
			}
			queue1.add(item);
			while (!queue2.isEmpty()) {
				queue1.add(queue2.remove());
			}
		}
	}

	public X pop() {
		if (queue1.isEmpty()) {
			throw new IllegalStateException("Stack is empty.");
		}
		return queue1.remove();
	}

	public X peek() {
		if (queue1.isEmpty()) {
			throw new IllegalStateException("Stack is empty.");
		}
		return queue1.peek();
	}

	public boolean isEmpty() {
		return queue1.isEmpty();
	}

	public boolean isFull() {
		return false;
	}

	public int size() {
		return queue1.size();
	}

	public static void main(String[] args) {
		// Stack<Integer> stack = new _2StackFromQueus<Integer>();
		Stack<Integer> stack = new StackFromQueus<Integer>();
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
		// stack.push(12);//:NOTE Exception : Stack is full.
		System.out.println("isEmpty = " + stack.isEmpty());
		System.out.println("isFull = " + stack.isFull());
		System.out.println("size = " + stack.size());
		// System.out.println("1st = " + s1.peek());
		System.out.println("1st = " + stack.pop());
		System.out.println("2nd = " + stack.pop());
		System.out.println("3rd = " + stack.pop());
		System.out.println("4th = " + stack.pop());
		System.out.println("5th = " + stack.pop());
		// System.out.println("1st = " + s1.peek());
		System.out.println("6th = " + stack.pop());
		System.out.println("7th = " + stack.pop());
		System.out.println("8th = " + stack.pop());
		System.out.println("9th = " + stack.pop());
		System.out.println("10th= " + stack.pop());
		System.out.println("11th= " + stack.pop());
		// System.out.println("11th= " + stack.pop());//:NOTE Exception : Stack is full.
		System.out.println("isEmpty = " + stack.isEmpty());
		System.out.println("isFull = " + stack.isFull());
		System.out.println("size = " + stack.size());

	}
}
