import java.util.Scanner;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Matrix");
        int num=sc.nextInt();
        int left=1;
        int right=0;
        int count=0;
        int n=num*num;
        for (int i=1;i<(n)+1;i++){
            if(i==left){
                count=count+i;
                left=left+(num+1);
            }
        }if(num%2==0){
            System.out.println(count+count);
        }
        else{
            System.out.println((count+count)-((n/2)+1));
        }
        sc.close();
    }
}
