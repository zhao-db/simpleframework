package demo.pattern.factory.method;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        MouseFactory mf = new HpMouseFactory();
        mf.createMouse();
    }

}
