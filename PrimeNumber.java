import java.util.ArrayList;
import java.util.List;
public class PrimeNumber {
    public static void main(String[] args) {
        int n=10;
        List<Integer>list=new ArrayList<>();
        list.add(0, 2);
        for (int i=3;i<=n;i++){
            for(int j:list){
                if(i%list.get(j)==0){
                    list.add(i);
                }
            }

            

        }
        System.out.println(list);
    }
}
