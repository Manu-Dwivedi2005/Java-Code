import java.util.Stack;
public class StackUsngJFW {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(90);
        System.out.println("After pushing 90: " + stk);
        
        stk.push(78);
        System.out.println("After pushing 78: " + stk);
        
        // Pop element
        int popped = stk.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after popping: " + stk);
        
    }
}
