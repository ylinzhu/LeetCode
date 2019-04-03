package easystring;

/**
 * @Designation:
 * @Author: Yuanlinzhu
 * @Date: 2019/4/3 12:44
 * @Version: 1.0
 */
public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] charCounter = new int[26];
        for (char c : s.toCharArray()) {
            charCounter[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            charCounter[c - 'a']--;
            if (charCounter[c - 'a'] < 0) return false;
        }
        return true;
    }


}
