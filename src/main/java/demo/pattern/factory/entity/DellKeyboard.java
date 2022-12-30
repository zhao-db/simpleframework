package demo.pattern.factory.entity;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
public class DellKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println(" Dell keyboard ");
    }
}
