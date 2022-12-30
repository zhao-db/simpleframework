package demo.generic;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/27
 * @since 3.0.1
 */
public class GenericDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("words");
        linkedList.forEach(x -> System.out.println("x = " + (String) x));


        GenericClassExample<String> stringExample = new GenericClassExample<>("abc");
        Integer[] ints = {1, 2, 3, 4};
        String[] strs = {"11", "21", "31", "41"};
        stringExample.printArray(ints);
        stringExample.printArray(strs);

    }
}
