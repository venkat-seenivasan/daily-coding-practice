import java.util.Scanner;

public class StringTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        String a = sc.nextLine();
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if (i % 2 == 0) {
                b = b + a.charAt(i);
            }
            else{
                b=b+(int)a.charAt(i);
            }
        }
        System.out.println("Ouput : "+b);
    }
}
