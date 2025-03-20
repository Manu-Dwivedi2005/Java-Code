import java.util.LinkedList;

class Stack2 {
    LinkedList<Integer> list = new LinkedList<>();

    // Push an element onto the stack
    public void push(int value) {
        list.addFirst(value); // Add at the front of the list
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        return list.removeFirst();
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        return list.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return list.size();
    }

    // Display stack elements
    public void display() {
        System.out.println("Stack: " + list);
    }
}

public class StackLinkedListJFW {
    public static void main(String[] args) {
        Stack2 stack = new Stack2();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display current stack
        stack.display();

        // Peek at the top element
        System.out.println("Peek: " + stack.peek());

        // Pop an element
        System.out.println("Popped: " + stack.pop());

        // Display after popping
        stack.display();

        // Stack size
        System.out.println("Stack size: " + stack.size());

        // Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Pop remaining elements
        stack.pop();
        stack.pop();

        // Check if empty after popping all elements
        System.out.println("Is stack empty now? " + stack.isEmpty());
    }
}
