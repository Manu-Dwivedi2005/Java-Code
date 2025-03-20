import java.util.Scanner;
public class PrintDigi1toN {
    void backprint(int i,int n){
        if(i<1){
            return;
        }
        backprint(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the n number");
        int n=sc.nextInt();
        PrintDigi1toN back =new PrintDigi1toN();
        back.backprint(n,n);
        sc.close();
    }
}
