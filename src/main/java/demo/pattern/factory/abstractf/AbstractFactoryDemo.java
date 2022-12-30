package demo.pattern.factory.abstractf;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ComputerFactory cf = new HpComputerFactory();
        cf.createMouse().sayHi();
        cf.createKeyboard().sayHello();
    }
}
