package hw03;

import java.util.ArrayList;

public class CS232ArrayStack<E> implements CS232Stack<E>{

	private CS232ArrayList<E> stack;

	// Constructor:

	public CS232ArrayStack() {

		stack = new CS232ArrayList<>();
	}

	@Override
	public void push(E obj) {

		stack.add(obj);	
	}

	@Override
	public E pop() {

		if (stack.size() == 0) {
			return null;
		}

		return stack.remove(stack.size()-1);
	}

	@Override
	public E peek() {

		if (stack.size() == 0) {
			return null;
		}

		return stack.get(stack.size()-1);
	}

	@Override
	public int size() {

		return stack.size();
	}

}
