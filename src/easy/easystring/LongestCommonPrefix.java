package easy.easystring;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/9
 * @Version: 1.0
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            if (pre=="")
                return pre;
            i++;
        }
        return pre;
    }

    public static void main(String[] args) {
        String s="aaab";
        String ss="ab";
        System.out.println(ss.indexOf(s));
    }
}
