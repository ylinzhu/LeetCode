package medium.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/7/8
 * @Version: 1.0
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        return 1;
    }

    public static void main(String[] args) throws IOException {
            StringBuffer buf=new StringBuffer();
            URL url=new URL("https://github.com/code4craft");
            InputStreamReader is=new InputStreamReader(url.openStream(),"gbk");
            BufferedReader bs=new BufferedReader(is);
            String test=null;
            Pattern pa=Pattern.compile("href=\"[(http)|(https)].+?\"");
            while((test=bs.readLine())!=null) {
                buf.append(test);
            }
           System.out.println(buf.toString());
            Matcher ma=pa.matcher(buf.toString());
            while(ma.find()) {
                System.out.println(ma.group());
            }
            is.close();
            bs.close();

    }
}
