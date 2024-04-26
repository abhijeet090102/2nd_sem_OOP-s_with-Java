import java.io.*;
import java.util.*;
class Stack{
	private int[] sta = new int[10];
	private int tos ;
	Stack(){ // initializing a top of stack
		tos = -1;
	}
	void push(int ite){ // pushing a element into top of the stack
		if (tos ==9){
			System.out.println("Stack is full ");
		}
		else{
			sta[++tos] = ite; 
//first top of the stack will increasing and  storing a item value into top of the stack 
		}
	}
	int pop(){ // this will pop the element from stack
		if (tos <0){
			System.out.println("Stack is underflow . ");
			return 0;
		}
		else{
			return sta[tos--];
// removing element from the top of the stack and decreasing the top of the stack
		}
	}
}
class TestStack{
	public static void main(String[] args){
		// creating a object and calling instance of name Stack
		Stack masta1 = new Stack();
		Stack masta2 = new Stack();
		for (int j=0; j<2; j++) masta1.push(20);
		for (int i=0; i<2; i++) masta2.push(40);
		System.out.println("Stack in my stack 1");
		for (int i=0; i<1; i++) System.out.println(masta1.pop());

		System.out.println("Stack in my stack 2");
		for (int j = 0; j<2; j++) System.out.println(masta2.pop());

	}
}