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
        char[] chars = digits.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char[] chars1 = phone.get(String.valueOf(chars[i])).toCharArray();
            List<String> temp = res;
            res = new ArrayList<>(16);
            if (temp.size() == 0) {
                for (char c : chars1) {
                    res.add(String.valueOf(c));
                }
            } else {
                for (String o : temp) {
                    for (char c : chars1) {
                        res.add(o+c);
                    }
                }
            }
        }


        return res;
    }



}
