package easystring;

/**
 * @Designation:
 * @Author: Yuanlinzhu
 * @Date: 2019/4/8 13:43
 * @Version: 1.0
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        if (haystack.length()==0&&needle!=null)
            return -1;
        if (needle.equals("")||)
            return 0;
        int end = needle.length();
        int start = 0;
        int index =0;
        for (int i = index; i < haystack.length(); i++) {
            if (haystack.charAt(i)==needle.charAt(start)){
                if (start==end-1)
                    return i;
                start++;
            }else {
                index++;
                start=0;
                if (i==haystack.length())
                    return -1;
            }
        }
        int i=index;
        while (start<end){
            if (haystack.charAt(i)==needle.charAt(start)){
                if (start==end-1)
                    return i;
                start++;
            }else {
                index++;
                start=0;
                if (i==haystack.length())
                    return -1;
            }

        }
        return index;


    }
}
