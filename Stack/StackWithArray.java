import java.util.Scanner;
 


public class StackWithArray{
    static class Stack{
        int maxSize;
        int top;
        int[] arr;
    
        public Stack(int size){
            this.maxSize=size;
            this.arr= new int[maxSize];
           this.top=-1;
        }
    public void push(int value){
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }
    
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return an invalid value or throw exception
        } else {
            int poppedValue = arr[top--];
            System.out.println(poppedValue + " popped from stack.");
            return poppedValue;
        }
    }
    
    public boolean isEmpty(){
        return (top == -1); 
    }
    public boolean isFull(){
        return (top == maxSize - 1);
    }
    
    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        } else {
            return arr[top];
        }
       
    }
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of max Stack:");
        int n=sc.nextInt();
        Stack myStack =new Stack(n);
        myStack.push(20);

        sc.close();
    }
}