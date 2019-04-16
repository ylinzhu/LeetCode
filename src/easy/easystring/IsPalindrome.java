package easy.easystring;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/3
 * @Version: 1.0
 */
public class IsPalindrome {
    /**
     * 正则匹配效率低
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        int end =s1.length()-1;
         int start =0;
         while (start<end){
             if (s1.charAt(start) == s1.charAt(end)){
                 start++;
                 end--;

             }
             else {
                 return false;
             }

         }
         return true;
    }

    public static boolean valid(char c){
        return ((c>='a'&&c<='z')||(c>='0'&&c<='9'));
    }
    public boolean is(String s){
        char[] chars = s.toLowerCase().toCharArray();
        int start =0;
        int end =chars.length-1;
        while (start<end){
             if (chars[start] == chars[end]){
                 start++;
                 end--;
             }else if (!valid(chars[start])){
                 start++;
             }else if (!valid(chars[end])){
                 end--;
             }else {
                 return false;
             }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
