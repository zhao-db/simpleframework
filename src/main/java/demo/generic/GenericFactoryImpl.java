package demo.generic;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/28
 * @since 3.0.1
 */
public class GenericFactoryImpl<T, N> implements GenericIFactory<T, N> {
    @Override
    public T nextObject() {
        return null;
    }

    @Override
    public N nextNumber() {
        return null;
    }
}
