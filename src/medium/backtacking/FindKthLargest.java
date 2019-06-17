package medium.backtacking;

import java.util.PriorityQueue;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        int start = 0;
        int end = nums.length ;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        int[] bucket = new int[max - min + 1];
        for (int num : nums) {
            bucket[num - min]++;
        }
        int index = max - min;
        while (k > 0 ){
            while (bucket[index] == 0 && index>0)index--;
            k--;
            bucket[index]--;
            if (k == 0)return index+min;
        }
        return -1;



    }

    public static void main(String[] args) {
        int[] ints = {3,2,1,5,6,4};
        new FindKthLargest().findKthLargest(ints,2);
    }

    public int  swap(int[] nums ,int k){
        PriorityQueue<Integer> qq = new PriorityQueue<>((x, y)->y-x);
        for(int i:nums)
            qq.add(i);
        //Iterator<Integer> it = qq.iterator();
        while(--k > 0)
            qq.poll();
        return qq.poll();

    }
}
