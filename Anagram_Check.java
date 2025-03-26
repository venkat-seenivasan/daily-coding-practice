import java.util.Arrays;

public class Anagram_Check
{
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        
        if(a.length() != b.length()) {
            System.out.println(false);
            return;
        }
        
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
