package hard;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int k = A[i] + B[j];
                map.put(k, map.getOrDefault(k, 0) + 1);
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int k = C[i] + D[j];
               res += map.getOrDefault(-k,0);
            }
        }
        return res;
    }
}
