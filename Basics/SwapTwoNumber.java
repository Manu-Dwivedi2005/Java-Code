public class SwapTwoNumber {
    public static void main(String[] args) {
        int n=9;
        int m=7;
        System.out.println("Before swap :");
        System.out.println("m :" + m);
        System.out.println("n: " + n);
        int temp=n;
        n=m;
        m=temp;
        System.out.println("After swap :");
        System.out.println("m :" + m);
        System.out.println("n: " + n);
    }
}
