import java.util.Scanner;

public class Array_Merge_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String arr1[] = {"Hello","World"};
        String arr2[] = {"H","ello","World"};

        String r1="";
        String r2="";
        for(int i=0;i<arr1.length;i++){
            r1=r1+arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            r2=r2+arr2[j];
        }
        System.out.println(r1.equals(r2));

    }
}
