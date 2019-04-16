package easy.easystring;

/**
 * @Designation:排第二,第一的算法让人看得很迷糊,说简单很简单,但是代码多的让人心碎,他用的枚举.一步到位.枚举多的不要不要的
 * @Author: Ylz
 * @Date: 2019/4/9
 * @Version: 1.0
 */
public class CountAndSay {


    public static String result(String rs){
        char[] chars = rs.toCharArray();
        StringBuilder sb = new StringBuilder();
        int index =1;
        if (chars.length<1)
            return rs;
        if (chars.length==1)
            return "11";
        for (int i = 0; i < chars.length; i++) {
            if (i==chars.length-1){
                if (chars[i-1] == chars[i]) {

                    return sb.append(index).append(chars[i]).toString();
                }
                else {
                    return   sb.append(index).append(chars[i]).toString();
                }
            }
            if (chars[i] == chars[i+1]){
                index++;
            }else {
                sb.append(index).append(chars[i]);
                index = 1;
            }
        }
        return sb.toString();
    }
   public static String countAndSay(int n) {
        if(n<=0)
            return "";
        if (n==1)
            return String.valueOf(n);
        return result(countAndSay(n-1));
    }

    public static void main(String[] args) {
        String s="1";
        System.out.println(result(s));
        System.out.println(countAndSay(5));
    }
}
