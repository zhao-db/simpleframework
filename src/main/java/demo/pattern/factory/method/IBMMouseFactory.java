package demo.pattern.factory.method;

import demo.pattern.factory.entity.IBMMouse;
import demo.pattern.factory.entity.Mouse;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
public class IBMMouseFactory extends LenovoMouseFactory {
    @Override
    public Mouse createMouse() {
        return new IBMMouse();
    }

}
