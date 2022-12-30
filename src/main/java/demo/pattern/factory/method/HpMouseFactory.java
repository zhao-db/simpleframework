package demo.pattern.factory.method;

import demo.pattern.factory.entity.HpMouse;
import demo.pattern.factory.entity.Mouse;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
