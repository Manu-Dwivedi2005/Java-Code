import java.util.Stack;
import java.util.Scanner;



public class ReverseA_String {
    String reverseStr(String str){
        Stack<Character> stk =new Stack<>();
         int idx =0;
         while(idx< str.length()){
            stk.push(str.charAt(idx));
            idx++;
         }
         StringBuilder result = new StringBuilder("");
         while(!stk.isEmpty()){
            char curr=stk.pop();
            result.append(curr);
         }
         return result.toString();
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("enter the string to reverse : ");
         String str=sc.nextLine();
         ReverseA_String rev=new ReverseA_String();
         System.out.println("String is :" + str);
        System.out.println("Reverse of the String : "+  rev.reverseStr(str));
        sc.close();
    }
}
