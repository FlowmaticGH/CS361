/**
 * 
 */
package mystack;

/**
 * @author Aidan Farrell 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		if(theStack == null){
			return null;// TODO To complete
		}
		else {
			T holdReturn = theStack.val;
			theStack = theStack.next;
			return holdReturn;
		}
		
	}

	public void push(T v) {
		MyNode<T> push = new MyNode<>(v,null);
		if (theStack == null) 
			theStack = push;
		else {
			push.next = theStack;
			theStack = push;
		}
			
		
			
			
		// TODO To complete
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyStack<Integer> testStack = new MyStack<>();
		testStack.push(1);
		testStack.push(2);
		testStack.pop();
		testStack.push(5);
		
		
		Person me = new Person();
		me.setFname("Aidan");
		me.setLname("Farrell");
		Person you = new Person();
		you.setFname("Christelle");
		you.setLname("Scharff");
		MyStack<Person> peopleStack = new MyStack<>();
		peopleStack.push(me);
		peopleStack.push(you);
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
	}

}
