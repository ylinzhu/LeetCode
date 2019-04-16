package easy.easySortandSearch;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/15
 * @Version: 1.0
 */
public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex =m+n-1;
        int i=m-1;
        int j= n-1;
        int k=0;
        while (i >= 0 &&j >= 0){
            nums1[lastIndex--]=nums2[j]-nums1[i]<0?nums1[i--]:nums2[j--];
        }

        while (j >= 0){
            nums1[lastIndex--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] n ={0};
        int[] m={1};
        merge(n,0,m,1);
    }
}
