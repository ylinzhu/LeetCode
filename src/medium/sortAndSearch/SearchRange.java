package medium.sortAndSearch;

/**
 * @Designation:1234
 * @Author: Ylz
 * @Date: 2019/6/17
 * @Version: 1.0
 */
public class SearchRange {

    public static int[] searchRange(int[] nums, int target) {
        int len = nums.length -1 ;
        int l = 0;
        int r = len ;
        if (len < 0) return new int[]{-1,-1};
       while (l < r){
           int mid = (l+ r)/2;
           if (target == nums[mid])
               r = mid;
           else if (target > nums[mid])
               l = mid + 1;
           else
               r = mid - 1;
       }
       if (r < 0 ||nums[r] != target)return  new int[]{-1,-1};
       l = r;
       while (r < len ){
           int mid = (len+ r + 1)/2;
           if (target == nums[mid])
               r = mid;
           else if (target > nums[mid])
               r = mid + 1;
           else
               len = mid - 1;
       }
       return  new int[]{l,r};
    }


}
