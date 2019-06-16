package medium.arrayAndString;



import java.util.*;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/25
 * @Version: 1.0
 */
public class GroupAnagrams {




    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        if (strs.length == 0)
            return null;

        for (String str : strs) {
            char[] chars = new char[26];
            for (char c : str.toCharArray()) {
                chars[c-'a']++;
            }
            String s  = new String(chars);
         /*   char[] c = str.toCharArray();
            Arrays.sort(c);
           String s = String.valueOf(c);*/
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
