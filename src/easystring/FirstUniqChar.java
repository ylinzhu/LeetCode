package easystring;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/2
 * @Version: 1.0
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        if (s.length()<=0)
            return -1;
        int len =s.length();
        char[] chars = new char[256];
        for (int i = 0; i < len; i++) {
            chars[s.charAt(i)]++;
        }
        for (int i = 0; i < len; i++) {
            if (chars[s.charAt(i)]==1)
                return i;
        }
        return -1;
        /**
         * 100的方法,还可以
         */
       /* if (s == null) return -1;
        int first = s.length();
        for(char i = 'a'; i <='z'; i++){
            int index = s.indexOf(i);
            if (index != -1 && index == s.lastIndexOf(i)){
                first = Math.min(first, index);
            }
        }
        return first == s.length() ? -1 : first;*/
    }
}
