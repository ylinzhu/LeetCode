package medium.math;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/7/31
 * @Version: 1.0
 */
public class Happy {

    private int calculate( int n){
        int k = 0 ;
        while (n != 0){
          int temp = n%10;
          k += temp * temp;
          n/=10;

        }
        return k;

    }

    public boolean isHappy(int n) {
        if (n == 1){
            return true;
        }
        if (n < 0 || n == 4)
            return false;
        return  isHappy(calculate(n));
    }

    public static void main(String[] args) {
        System.out.println(new Happy().isHappy(19));
    }

}
