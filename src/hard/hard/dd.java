package hard;

import java.util.HashMap;
import java.util.Map;

public class dd {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        int[] one =new int[A.length<<1];
        int[] two =new int[A.length<<1];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                one[index++] = A[i]+B[j];
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                two[index++] = C[i]+D[j];
            }
        }
        Map<Integer,Integer> map = new HashMap<>();

        for (int i : one) {
            if (map.containsKey(i)){
                map.put(i,map.get(i));
            }
            map.put(i,1);
        }
        for (int i : two) {
            if (map.containsKey(-i) & map.get(-i)>0){
                map.put(-i,map.get(-i) -1);
                res++;
            }
        }

        return res;
    }
}
