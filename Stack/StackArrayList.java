import java.util.ArrayList;
// import java.util.Scanner;

class Stack {
    ArrayList <Integer> list =new ArrayList<>();

    public boolean isEmpty(){
        return list.size()==0;
    }

    //push
    public void push(int data){
        list.add(data);
        System.out.println("The element " + data + " is pushed into the stack");
    }

    //pop
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top =list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
      //peek
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int top =list.get(list.size()-1);
        return top;
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("list is empty !");
            return ;
        }
        int n = list.size();
        for(int i=n-1;i>=0;i--){
           System.out.println("the element at pos " + i + " is "+ list.get(i));
        }
    }
}

public class StackArrayList {
    public static void main (String args[]){
     Stack myStack =new Stack();
    myStack.push(20);
    myStack.push(30);
    myStack.push(40);
    myStack.push(70);
    myStack.push(42);
    myStack.display();
    System.out.println("the poped element is "+ myStack.pop());
    myStack.display();
    myStack.push(1);
    myStack.push(67);
    System.out.println("the poped element is "+ myStack.pop());
    System.out.println("the poped element is "+ myStack.pop());
    System.out.println("the poped element is "+ myStack.pop());
    System.out.println("the poped element is "+ myStack.pop());
    System.out.println("the poped element is "+ myStack.pop());
    System.out.println("the poped element is "+ myStack.pop());
    System.out.println("the poped element is "+ myStack.pop());
    System.out.println("the poped element is "+ myStack.pop());
    myStack.push(70);
    myStack.display();
    System.out.println("Peek element :" + myStack.peek());
    }
}
