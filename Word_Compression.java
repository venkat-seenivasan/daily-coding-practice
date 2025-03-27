import java.util.Scanner;
public class Word_Compression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        String a=sc.nextLine();
        String b="";
        int len=a.length();
        int count=1;
        for (int i=0;i<a.length()-1;i++){
            if(a.charAt(i)==a.charAt(i+1)){
                count=count+1;
            }
            else{
                b=b+a.charAt(i)+count;
                count=1;
            }
        }b = b + a.charAt(len - 1) + count;

        System.out.println("Output : "+b);
    }
}
