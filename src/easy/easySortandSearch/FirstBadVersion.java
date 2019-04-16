package easy.easySortandSearch;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/15
 * @Version: 1.0
 */
public class FirstBadVersion {

    public static boolean isBadVersion(int n){
        if (n<4)
        return  false;
        return true;
    }
    public static int firstBadVersion(int n) {
        int start =0;
        int mid =1;
        while (start+1<n){
            mid =start+((n-start)>>1);
            if (isBadVersion(mid)){
               n=mid;
            }else {
                start =mid+1;
            }
        }
        return isBadVersion(start)?start:n;



    }

    public static void main(String[] args) {
        int  k =(2126753390+1063376695)<<1;
        Long i= Long.valueOf((2126753390+1063376695));
        System.out.println(i);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(firstBadVersion(5));
        System.out.println(5>>1);
    }
}
