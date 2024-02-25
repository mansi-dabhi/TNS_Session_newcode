package tnssession;

public class Stack_Operation {
	 private int[] a;
	 private int top ;
	 public Stack_Operation(int size) {
		 a=new int[size];
		 top=-1;
	 }
	 
	 public void push(int element) {
		 if(top==a.length-1) {
			 System.out.println("can not push element..");
		 }
		 else {
			 top++;
			 a[top]=element;
			 System.out.println("pushed element :"+element);
		 }
	 }
	 public int pop()
	 {
	 if(top==-1) 
	 {
		 
		System.out.println("Stack Underflow");
		return -1;
		
	}
	else 
	{
		int poppedel = a[top];
		top--;
		System.out.println("Popped element :"+poppedel);
		return poppedel; 
	}
	
	}
	 public int peek() {
		 if(top==-1) {
			 System.out.println("Stack is empty");
			 return -1;
		 }
		 else {
			 return a[top];
		 }
	 }
	 public boolean isEmpty() {
		 return top==-1;
	 }
	void display() 
	{
		if(top==-1) {
			System.out.println("Stack is empty...");
		}
		else {
			System.out.println("printing elements..... ");
			for(int i =top;i>=0;i--) {
				System.out.println(a[i]);
			
		}
			System.out.println();
		}
		
}

}
