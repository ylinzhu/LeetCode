package medium.backtacking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/6
 * @Version: 1.0
 */
public class GenerateParenthesis {
    
    public void match(int left,int right,int index,String s,List res){
        if (left == 0 && right == 0 ){
            res.add(s);
            return;
        }
        if (left > 0 ){
            match(left - 1,right,index + 1,s+"(",res);
        }
        if (right > 0 && index > 0 ){
            match(left,right - 1,index - 1,s+")",res);
        }
        return;

    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>(16);
        if(n < 1) return res;
        int index =0 ;
        String s = "";
        match(n,n,index,s,res);
       return res;
    }


}
