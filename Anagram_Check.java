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
        char ans1[]=new char[a.length()];
        char ans2[]=new char[a.length()];
        for (int i=0;i<a.length();i++){
            ans1[i]=a.charAt(i);
            ans2[i]=b.charAt(i);
        }
        Arrays.sort(ans1);
        Arrays.sort(ans2);
        
        // char[] arr1 = a.toCharArray();
        // char[] arr2 = b.toCharArray();
        
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        
        // System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(ans1, ans2));

    }
}
