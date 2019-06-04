package medium.backtacking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/4
 * @Version: 1.0
 */
public class letterCombinations {

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>(16);
        if (digits == null)
            return res;
        //映射
        Map<String, String> phone = new HashMap<String, String>() {{
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }};


        return res;
    }

    public static void main(String[] args) {
        String s= "23";
        String k ="abcd";
        System.out.println((byte)s.charAt(0));
        System.out.println((byte)k.charAt(0));

        System.out.println((byte)s.charAt(1));
        System.out.println((byte)k.charAt(3));
    }
    
}
