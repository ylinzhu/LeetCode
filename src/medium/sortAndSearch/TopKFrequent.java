package medium.sortAndSearch;

import java.util.*;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/14
 * @Version: 1.0
 */
public class TopKFrequent {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>(k>>1);
        Map<Integer, Integer> map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        Map<Integer, Integer> counter = new HashMap<>();
        char[] temp = new char[len];
        for (int i = 0; i < len; i++) {
                if (counter.containsKey(nums[i])){
                    counter.put(nums[i],counter.get(nums[i])+ 1);
                    map.put(counter.get(nums[i]),nums[i]);
                }
                else {
                    counter.put(nums[i],1);
                    map.put(1,nums[i]);
                }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (k >0){
            res.add(iterator.next().getKey());
            k--;
        }

        return res;
    }

    public static void main(String[] args) {
        int [] s ={-1,-2};
        System.out.println(topKFrequent(s, 2));
    }
}
