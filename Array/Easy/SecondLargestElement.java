import java.util.Scanner;
import java.util.Arrays;
public class SecondLargestElement {

    // brute force solution
    int findSecondLargest1(int[] arr){
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        int secondLargest=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(largest!=arr[i]){
                secondLargest=arr[i];
                break;
            }
        }
        return secondLargest;
    }
   //optimum solution
    int findSecondLargest2(int[] arr){
        int n=arr.length;
        int largest=arr[0];
        int secondLargest=-1;
        for(int i=0;i<n;i++){
            if(largest <arr[i]){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(largest>arr[i] && secondLargest<arr[i]){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of element in array:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the element of array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SecondLargestElement solution =new SecondLargestElement();
        System.out.println("the second largest element: " + solution.findSecondLargest1(arr));
        System.out.println("the second largest element: " + solution.findSecondLargest2(arr));
        sc.close();
    }
}
