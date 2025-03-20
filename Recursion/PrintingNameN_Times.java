import java.util.Scanner;
public class PrintingNameN_Times {
    void printntimes(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i+". manu");
        printntimes(++i, n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("the the number of times :");
        int n=sc.nextInt();
        PrintingNameN_Times print = new PrintingNameN_Times();
        print.printntimes(1,n);
        sc.close();
    }
}
