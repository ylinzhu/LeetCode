package hard.arrayAndString;

import java.util.Stack;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/8/22
 * @Version: 1.0
 */
public class Calculate {

    public int calculate(String s) {
        int len = s.length();
        if (s == null || len == 0){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        char sign  = '+';
        int res = 0;
        int cur = 0;
        for (int i = 0; i <= len; i++) {
            char c = i == len ? 0 :  s.charAt(i);
            if (c == ' ') continue;
            if (c >='0' && c <='9'){
                cur=cur * 10 + (c -'0');
                continue;
            }
            if (sign == '+'){
                stack.push(cur);
            }else if (sign == '-'){
                stack.push(-cur);
            }else if (sign == '*'){
                stack.push(stack.pop() * cur);
            }else if (sign == '/'){
                stack.push(stack.pop() / cur);
            }
            sign = c;
            cur = 0;
        }
        for (Integer i : stack) {
            res +=i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Calculate().calculate("3/2"));
    }
}
