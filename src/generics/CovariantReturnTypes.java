package generics;

/**
 * @version 1.0
 * @Description:
 * @author: hxw
 * @date: 2018/12/13 23:46
 */
public class CovariantReturnTypes {

    void test(DerivedGetter d) {
        Derived d2 = d.get();
    }
}
