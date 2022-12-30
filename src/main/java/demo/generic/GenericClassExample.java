package demo.generic;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/27
 * @since 3.0.1
 */
@Data
public class GenericClassExample<T> {

    private T member;

    public GenericClassExample(T member) {
        this.member = member;
    }

    public T handleSomething(T target) {
        return target;
    }

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s", element);
            System.out.printf(" ");
        }
        System.out.println();
    }
}
