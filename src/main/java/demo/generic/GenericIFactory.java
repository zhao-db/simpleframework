package demo.generic;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/28
 * @since 3.0.1
 */
public interface GenericIFactory<T, N> {

    T nextObject();

    N nextNumber();
}
