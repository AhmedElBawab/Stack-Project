package eg.edu.alexu.csd.datastructure.stack.cs08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MainUI use = new MainUI();
		//use.doThis();

		Stack l = new Stack();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		System.out.println(l.pop());
		System.out.println(l.pop());
		l.push(5);
		l.push(6);
		System.out.println(l.pop());
		System.out.println(l.pop());
		l.push(7);
		System.out.println(l.pop());
		System.out.println(l.pop());
		System.out.println(l.pop());
		System.out.println(l.pop());
		
		
		
	}

}
