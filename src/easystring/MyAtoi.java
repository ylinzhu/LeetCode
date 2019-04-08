package easystring;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/4
 * @Version: 1.0
 */
public class MyAtoi {
    public static boolean valid(char c){
        if (c>='0'&&c<='9')
            return true;
        return false;
    }
    public static int myAtoi(String str) {
       int len =str.length();
        char[] chars = str.toCharArray();
        long rs=0;
        int index =0;
        boolean flag =true;
        int k=0;
        for (int i = 0; i < len; i++) {
            if (chars[i]==' '){
                if (rs!=0)
                    return (int) (rs=flag==true?rs:-rs);
               if (index!=0&&rs==0){
                 return 0;
               }
                continue;
            }
             if (rs==0){
                 if ((chars[i]=='-'||chars[i]=='+')&&(index++)==0){
                     flag=chars[i]=='-'?false:true;
                     continue;
                 }else if ((chars[i]=='-'||chars[i]=='+')&&(index++)!=0){
                     return (int) (rs=flag==true?rs:-rs);
                 }
             }

            if (chars[i]=='0'&&rs==0){
                if (!valid(chars[i+1]))
                    return 0;
            }
            if (chars[i]=='0'&&rs==0&&index!=0&&k!=0){
                return 0;
            }
            if (valid(chars[i])){
                if ((rs*10+(chars[i]-'0'))>Integer.MAX_VALUE){
                    return (int) (rs=flag==true?Integer.MAX_VALUE-1:Integer.MIN_VALUE);
                }
               rs=rs*10+(chars[i]-'0');
            } else {
                return (int) (rs=flag==true?rs:-rs);
            }



        }
        return (int) (rs=flag==true?rs:-rs);
    }

    public static void main(String[] args) {
        String str =" 123-";
        System.out.println(Integer.MAX_VALUE);
        System.out.println(myAtoi(str));
    }
}
