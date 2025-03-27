import java.util.Scanner;

public class SubsequenceCheck {
    public static boolean isSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++; 
            }
            j++; 
        }
        return i == str1.length(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        System.out.println(isSubsequence(str1, str2));
        sc.close();
    }
}
