package medium.backtacking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/10
 * @Version: 1.0
 */
public class Permute {

    public  List<List<Integer>> xxx(int num,List res,int index){
        List<List<Integer>> re = new ArrayList<>(16);

        for (int j = 0; j < res.size(); j++) {
          List<Integer>  temp2 = (List<Integer>) res.get(j);
          int len = temp2.size();
            for (int i = 0; i < len + 1 ; i++) {
                temp2.add(i,num);
                re.add(new ArrayList<>(temp2));
                temp2 .remove(i);
            }
        }
        res = re;
        return res;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(16);
        List<Integer> temp1 = new ArrayList<>(16);
        if (nums.length < 1) {
            return res;
        }
        temp1.add(nums[0]);
        res.add(temp1);
        for (int i = 1; i < nums.length; i++) {
            List<Integer> temp2 = new ArrayList<>(16);
              res = xxx(nums[i],res,0);
        }
        return res;
    }

}
