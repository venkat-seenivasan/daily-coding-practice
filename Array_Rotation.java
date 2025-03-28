import java.util.Scanner;

public class Array_Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=sc.nextInt();
        System.out.println("Enter the number of rotation :");
        int k=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        // int arr[]={1,2,3,4,5,6,7};
        // int k=3;
        int m=arr[3];
        for (int i=0;i<k;i++){
            int temp=arr[i];
            arr[i]=arr[i+4];
            arr[i+k]=temp;
        }
        arr[6]=m;
        System.out.println("Output is : ");
        for (int i : arr) {
            System.out.print(i+" ");

        }
    }
}
