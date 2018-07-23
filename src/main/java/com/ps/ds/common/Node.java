package com.ps.ds.common;

import java.io.Serializable;

/**
 * @author Prabal Srivastava
 *
 */
public class Node<X> implements Serializable {
	private static final long serialVersionUID = -3939609552526885817L;
	private X data;
	private Node<X> next;
	
	public Node() {
		
	}
	public Node(final X data) {
		this.data = data;
	}
	public Node(final X data,final Node<X> next) {
		this.data = data;
		this.next = next;
	}

	public X getData() {
		return data;
	}

	public void setData(X data) {
		this.data = data;
	}

	public Node<X> getNext() {
		return next;
	}

	public void setNext(Node<X> next) {
		this.next = next;
	}
}
