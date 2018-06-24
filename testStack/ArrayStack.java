package testStack;

/*
Author: Curtis A. Warren
Date: 06/23/18
Description: Stacks are used inside programming languages to keep track of
the order that methods, or functions, are called.  Here I have created an implementation
of the stack data structure using an array as the means to hold the stack's info.
*/

public class ArrayStack {
//  This array will hold the stack's data.
private String stack[];
//  The "end" datafield will keep track of the top or end of the stack.
private int end;
//  The "size" datafield will define the size of the stack.
private int size;
//  The "element" datafield will hold the elements in the program as they are being deleted.
private String element;
//  Creates a new implementation of a stack using an array to hold the stack's info.
public ArrayStack (int newSize) {
	this.end = 0;
	this.size = newSize;
	stack = new String [newSize];
}
//  Controls the process of adding a new String element to the stack.
public void add (String newElement) {
	// Adds element to the stack.
	if (end < stack.length) {
   	 stack[end] = newElement;
     System.out.println("The element " + stack[end] + " has been added to the array stack implementation. ");
     end++;
  } else {
   //  Prints error.
     System.out.print("Error adding element.");
  }
 }
 //  Controls the process of removing a new String element from the stack.
public void remove () {
   //  Removes the value of the first element.
   if (end == 0 && !(stack[end] == null)) {
 		  element = stack[end];
      System.out.println("The element " + element + " has been deleted from the array stack implementation. ");
      stack[end] = null;
    } else if (end > 0) {
    //  Removes the value at the "end" by decrementing to a filled index.
      end--;
      element = stack[end];
      System.out.println("The element " + element + " has been deleted from the array stack implementation. ");
      stack[end] = null;
     } else {
     //  Prints Error.
       System.out.print("Error removing element.");
     }
}
	//  Prints the stack's contents.
  public String toString () {

     String holdArray = "[Bottom] (";
     for (String elem: stack) {

    	 	if(elem != null) {
    	 		holdArray += " " + elem + " ";
    	 	}

     }
     return holdArray + ") [Top]";
   }

  public static void main(String[] args) {

	  ArrayStack stack = new ArrayStack(20);

	  stack.add("Apples");
	  stack.add("Donuts");
	  stack.add("Coffee");
	  stack.remove();
	  stack.add("Sugar");
	  System.out.println(stack.toString());


  }
}
