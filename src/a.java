import java.lang.reflect.Field;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/5/23
 * @Version: 1.0
 */
public class a {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        v v= new v();
        d d = new d();
        Field age = v.getClass().getDeclaredField("age");
       // age.setAccessible(true);
        age.set(v,d.getAge());
        System.out.println(v.getAge());


    }
}
