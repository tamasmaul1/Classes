import java.math.*;
import java.util.*;

public class Fibo {
    public static void main(String args[]){
        List<BigInteger> nums = new ArrayList<BigInteger>(Arrays.asList(BigInteger.valueOf(1),BigInteger.valueOf(1)));
        int n = 100;
        for(int i = 0; i < n; i++){
            BigInteger newnum = nums.get(nums.size()-1).add(nums.get(nums.size()-2));
            nums.add(newnum);
        }
        System.out.println(nums);
    }
}