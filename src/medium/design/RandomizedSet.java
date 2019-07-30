package medium.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/7/30
 * @Version: 1.0
 */
public class RandomizedSet {

    /**
     * Your RandomizedSet object will be instantiated and called as such:
     * RandomizedSet obj = new RandomizedSet();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */
    private Map map;
    private List list;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        map = new HashMap();
        list = new ArrayList();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        int index = list.size();
        map.put(val, index);
        list.add(index,val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        int lastVal = (int) list.get(list.size() - 1);
        list.set((int)map.get(val),lastVal);
        map.put(lastVal,map.get(val));
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        int rand = (int) (Math.random() * list.size());
        return (int) list.get(rand);
    }
}
