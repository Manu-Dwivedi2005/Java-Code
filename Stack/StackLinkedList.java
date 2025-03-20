
class StackB {
    int data;
    StackB next;

    StackB(int data){
        this.data=data;
        this.next=null;
    }
}
class StackA {
    StackB head =null;

    public boolean isEmpty(){
        return head==null;
    }

    public void push(int data){
        StackB newStack = new StackB(data);
        if(isEmpty()){
            head=newStack;
            System.out.println("pushed:" + data);
            return;
        }
        newStack.next=head;
        head=newStack;
        System.out.println("pushed:"+ data);
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        int top = head.data;
        head=head.next;
        return top;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        return head.data;
    }

    public void display(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        StackB temp =head;
        System.out.println("Display : ");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class StackLinkedList {
    public static void main(String[] args) {
        StackA stk = new StackA();
        stk.push(90);
        stk.push(97);
        stk.push(95);
        stk.push(93);
        stk.push(23);
        stk.push(67);
        stk.push(12);
        stk.push(91);
        stk.display();
        System.out.println("pop:"+stk.pop());
        System.out.println("pop:"+stk.pop());
        System.out.println("pop:"+stk.pop());
        System.out.println("pop:"+stk.pop());
        stk.display();
        stk.push(123);
       System.out.println("peek: "+stk.peek());
        stk.display();
        System.out.println("pop:"+stk.pop());
        System.out.println("pop:"+stk.pop());
        
    }
}
