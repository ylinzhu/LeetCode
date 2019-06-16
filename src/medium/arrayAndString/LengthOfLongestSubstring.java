package medium.arrayAndString;



import java.util.HashMap;
import java.util.Map;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/26
 * @Version: 1.0
 */
public class LengthOfLongestSubstring {

    public void test() {
        String strs = "alouzxilkaxkufsu";
        System.out.println(lengthOfLongestSubstring(strs));
    }
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int temp =0;
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
               temp = Math.max(temp ,map.get(s.charAt(i))+1);
               map.put(s.charAt(i),i);
               max = Math.max(i-temp+1, max);

        }
        return max;
    }
}
