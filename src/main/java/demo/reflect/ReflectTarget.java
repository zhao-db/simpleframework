package demo.reflect;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
public class ReflectTarget {

    public static void main(String[] args) throws ClassNotFoundException {
        ReflectTarget reflectTarget = new ReflectTarget();
        Class reflectTargetClass1 = reflectTarget.getClass();
        System.out.println("reflectTargetClass1.getName() = " + reflectTargetClass1.getName());
        Class reflectTargetClass2 = ReflectTarget.class;
        System.out.println("reflectTargetClass2.getName() = " + reflectTargetClass2.getName());
        System.out.println(reflectTargetClass1 == reflectTargetClass2);
        Class reflectTargetClass3 = Class.forName("demo.reflect.ReflectTarget");
        System.out.println("reflectTargetClass3.getName() = " + reflectTargetClass3.getName());
        System.out.println(reflectTargetClass2 == reflectTargetClass3);

    }

}
