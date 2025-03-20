import java.util.Scanner;

public class PrintDigiNto1 {
    void backprint(int i,int n){
        if(i>n){
            return;
        }
        backprint(i+1, n);
        System.out.println(i);
    }
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the n number");
        int n=sc.nextInt();
        PrintDigiNto1 back =new PrintDigiNto1();
        back.backprint(1,n);
        sc.close();
    }
}
