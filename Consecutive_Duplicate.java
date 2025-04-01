public class Consecutive_Duplicate {
    public static void main(String[] args) {
        String n="1125566133111444";
        String res=" ";
        char index=n.charAt(0);
        for (int i=0;i<n.length();i++){
            if(index!=n.charAt(i)){
                res=res+index;
                index=n.charAt(i);
                // System.out.println(i);
            }
        }
        res=res+index;
        System.out.println("Consecutive_Duplicate : "+res);
    }
}
