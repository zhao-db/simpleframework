package demo.pattern.factory.entity;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
public class IBMMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println(" IBM mouse ");
    }
}
