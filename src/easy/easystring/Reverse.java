package easy.easystring;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/2
 * @Version: 1.0
 */
public class Reverse {
    public int reverse(int x) {
       long rs =0;
       while (x!=0){
           rs =(rs*10) +(x%10);
           if (rs>Integer.MAX_VALUE)return 0;
           if (rs<Integer.MIN_VALUE)return 0;
           x =x/10;
       }
       return (int )rs;
    }
}
