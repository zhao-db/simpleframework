package demo.generic;

import java.util.Random;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/28
 * @since 3.0.1
 */
public class RobotFactory implements GenericIFactory<String, Integer> {

    private String[] stringRobot = new String[]{"hello", "hi"};
    private Integer[] integerRobot = new Integer[]{111, 000};

    @Override
    public String nextObject() {
        Random random = new Random();
        return stringRobot[random.nextInt(2)];
    }

    @Override
    public Integer nextNumber() {
        Random random = new Random();
        return integerRobot[random.nextInt(2)];
    }

    public static void main(String[] args) {
        GenericIFactory<String, Integer> factory = new RobotFactory();
        System.out.println("factory.nextNumber() = " + factory.nextNumber());
        System.out.println("factory.nextObject() = " + factory.nextObject());
    }
}
