import java.util.Scanner;
import java.util.Arrays;

public class LargestElement {

    int findlargestBrute(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    int findLargestOptimum(int arr[]){
        int n=arr.length;
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array:");
        int n =sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the element in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        LargestElement solution =new LargestElement();
        System.out.println("the largest element of arrays is :"+ solution.findlargestBrute(arr));
        System.out.println("the largest element of arrays is :"+ solution.findLargestOptimum(arr));
        sc.close();
    }
}