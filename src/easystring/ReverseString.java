package easystring;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/2
 * @Version: 1.0
 */
public class ReverseString {
    public void reverseString(char[] s) {
           int len = s.length;
        for (int i = 0; i < len-i; i++) {
            char c =s[i];
            s[i] = s[len-1-i];
            s[len-1-i]=c;
        }
        /**
         * while循环看起来更加简单一点
         */
      /*  int max =s.length -1;
        int min =0;
        while (min<max){
            char c =s[min];
            s[min] = s[max];
            s[max]=c;
            min++;
            max--;
        }*/
    }
}
