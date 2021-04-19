package _00_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
    public static void main(String[] args) {
        // 1. Create a Stack of Doubles
        //    Don't forget to import the Stack class
    	Stack<Double> doubles = new Stack<Double>();

        // 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
    	Random rand = new Random();
    	
    	for(int i = 0; i<100; i++) {
    		doubles.push(rand.nextDouble()*100);
    	}

        // 3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
    	String numberOne = JOptionPane.showInputDialog(null, "Enter a number between 0 and 100, inclusive.");
    	String numberTwo = JOptionPane.showInputDialog(null, "Enter another number between 0 and 100, inclusive.");
    	
    	int one = Integer.parseInt(numberOne);
    	int two = Integer.parseInt(numberTwo);

        // 4. Pop all the elements off of the Stack. Every time a double is popped that is
        //    between the two numbers entered by the user, print it to the screen.
    	System.out.println("Popping elements off stack...");
    	System.out.println("Elements between " + one + " and " + two);
    	for(int i=0;i<doubles.size();i++) {
    		if(one<two) {
    			double x = doubles.pop();
    			if(x>one && x<two) {
    				System.out.println(x);
    			}
    		}
    		else if(one>two) {
    			double x = doubles.pop();
    			if(x>two && x<one) {
    				System.out.println(x);
    			}
    		}
    		
    	}


        // EXAMPLE:
        // NUM 1: 65
        // NUM 2: 75

        // Popping elements off stack...
        // Elements between 65 and 75:
        // 66.66876846
        // 74.51651681
        // 70.05110654
        // 69.21350456
        // 71.54506465
        // 66.47984807
        // 74.12121224
    }
}
