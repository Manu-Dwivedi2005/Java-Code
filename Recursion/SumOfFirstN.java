import java.util.Scanner;

public class SumOfFirstN {
    int sum(int n){
        if(n==0) return 0;
        return n +sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the n number for summation:");
        int n=sc.nextInt();
        SumOfFirstN s=new SumOfFirstN();
        System.out.println("the summation of first " + n +" number is :"+ s.sum(n));
        sc.close();
    }
}
