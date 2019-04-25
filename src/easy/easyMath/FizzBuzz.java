package easy.easyMath;

import java.util.ArrayList;
import java.util.List;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/17
 * @Version: 1.0
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String FizzBuzz = "FizzBuzz";
        int index =1;

        while (index<=n){
            if (index%3 == 0&&index%5 == 0){
                list.add(FizzBuzz);
            }else if (index%3 == 0){
                list.add(Fizz);
            }else if (index%5 == 0){
                list.add(Buzz);
            }else {
            list.add(String.valueOf(index));
            }
            index++;
        }
        return list;
    }
}
