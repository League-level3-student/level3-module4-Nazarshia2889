package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
    public static boolean doBracketsMatch(String b) {
    	
    	Stack<Character> brackets = new Stack<Character>();
    	for(int i=0;i<b.length();i++) {
    		brackets.push(b.charAt(i));
    	}
    	for(int i=0;i<brackets.size();i++) {
    		if(brackets.get(i) == '{') {
    			for(int j=i+1;j<brackets.size()-1;j++) {
    				if(brackets.get(j)=='}') {
    					brackets
    					brackets.remove(brackets.get(j));
    					break;
    				}
    			}
    		}
    	}
    	if(brackets.size()>=1) {
    		return false;
    	}
        return true;
    }
}