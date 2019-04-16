package easy.easystring;

/**
 * @Designation:
 * @Author: Yuanlinzhu
 * @Date: 2019/4/8 13:43
 * @Version: 1.0
 */
public class StrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.trim().isEmpty()||haystack.equals(needle))
            return 0;
        if (haystack.length()==0&&needle!=null)
            return -1;
        int end = needle.length();
        int start = 0;
        int index =0;
        int i=0;
        while (start<end){

            if (haystack.charAt(i)==needle.charAt(start)){
                if (start==end-1)
                    return index;
                start++;
                i++;
            }else {
                index++;
                start=0;
                i=index;
                if (i==haystack.length()-needle.length()+1)
                    return -1;
            }

        }
        return -1;


    }

    }

