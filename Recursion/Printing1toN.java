import java.util.Scanner;


public class Printing1toN {
    void printndigi(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printndigi(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number :");
        int n=sc.nextInt();
        Printing1toN digi=new Printing1toN();
        System.out.println("********************************************************");
       digi.printndigi(1,n);
       sc.close();
    }
}
