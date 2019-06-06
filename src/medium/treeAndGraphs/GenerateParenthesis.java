package medium.treeAndGraphs;

import java.util.ArrayList;
import java.util.List;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/6
 * @Version: 1.0
 */
public class GenerateParenthesis {

    public void i(int left,int right,int index,String s){
        if (right>0){
            s+="(";
            left--;
            index++;
            i(left,right,index,s);
        }

        s+=")";
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>(16);
        if(n < 1) return res;
        int index =0 ;
        while (true){
            if (index == 0){

            }
        }
    }
}
