package eg.edu.alexu.csd.datastructure.stack.cs08;

import java.util.Scanner;

/**
 * Deal with the user
 * 
 * @author ahmed
 *
 */
public class UI {

	Scanner input = new Scanner(System.in);
	RuntimeException e = new RuntimeException();
	Stack l = new Stack();

	/**
	 * print the welcome words
	 * 
	 * @author ahmed
	 *
	 */
	public void welcome() {
		System.out.println("WELCOME TO FX-2");
		System.out.println("---------------");
		System.out.println("THIS APP IS TO CONVERT INFIX INTO POSTFIX");
		System.out.println("-----------------------------------------");
		System.out.println("FELL FREE TO USE IT ^_^");
		System.out.println("-----------------------");
		System.out.println("PREE ANY KEY TO MAIN MENUE");
		System.out.println("--------------------------");
	}

	/**
	 * print the menue of choices
	 * 
	 * @author ahmed
	 *
	 */
	public void PrintMenue() {
		System.out.println("Please choose an action");
		System.out.println("-----------------------");
		System.out.println("1: Push");
		System.out.println("2: Push at index");
		System.out.println("3: Pop");
		System.out.println("4: Peek");
		System.out.println("5: Get size");
		System.out.println("6: Check if empty");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	/**
	 * operates push option
	 * 
	 * @author ahmed
	 *
	 */
	public void choice1() {
		System.out.println("Please choose the type of the element:");
		System.out.println("1-For integer");
		System.out.println("2-For char ");
		// System.out.println("3-For String ");//error with strings fix later
		int x = input.nextInt();
		if (x == 1) {
			System.out.println("Please eneter the integer:");
			int y = input.nextInt();
			l.push(y);
		} else if (x == 2) {
			System.out.println("Please eneter the character:");
			char y = input.next().charAt(0);
			;
			l.push(y);
			/*
			 * } else if (x == 3) {
			 * System.out.println("Please eneter the string:"); String y = new
			 * String(); y = input.next(); l.push(y);
			 */
		} else {
			throw e;
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	/**
	 * operates push at index option
	 * 
	 * @author ahmed
	 *
	 */
	public void choice2() {
		System.out.println("Please choose the type of the index:");
		int index = input.nextInt();
		System.out.println("Please choose the type of the element:");
		System.out.println("1-For integer");
		System.out.println("2-For char");
		// System.out.println("3-For String");
		int x = input.nextInt();
		if (x == 1) {
			System.out.println("Please eneter the integer:");
			int y = input.nextInt();
			l.add(index, y);
		} else if (x == 2) {
			System.out.println("Please eneter the character:");
			char y = input.next().charAt(0);
			;
			l.add(index, y);
			/*
			 * } else if (x == 3) {
			 * System.out.println("Please eneter the string:"); String y = new
			 * String(); y = input.nextLine(); l.add(index, y);
			 */
		} else {
			throw e;
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	/**
	 * operates pop option
	 * 
	 * @author ahmed
	 *
	 */
	public void choice3() {
		System.out.println("The element is:");
		System.out.println(l.pop());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	/**
	 * operates peek option
	 * 
	 * @author ahmed
	 *
	 */
	public void choice4() {
		System.out.println("The element is:");
		System.out.println(l.peek());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	/**
	 * operates size option
	 * 
	 * @author ahmed
	 *
	 */
	public void choice5() {
		System.out.println("The size is:");
		System.out.println(l.size());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	/**
	 * operates empty option
	 * 
	 * @author ahmed
	 *
	 */
	public void choice6() {
		if (l.isEmpty()) {
			System.out.println("The stack is empty");
		} else {
			System.out.println("The stack isn't empty");
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}
