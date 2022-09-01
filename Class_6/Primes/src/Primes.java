import java.util.*;

public class Primes {
    public static void main(String args[]){
        int n = 11;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            boolean prime = true;
            for(int x = 0; x < i; x++){
                if(x >= 2 && i%x==0) {
                    prime = false;
                }
            }
            if(prime){
                result.add(i);
            }
        }
        System.out.println(result);
    }
}