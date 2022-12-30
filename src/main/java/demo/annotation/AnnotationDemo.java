package demo.annotation;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
public class AnnotationDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        ZdbCourse zdbCourse = new ZdbCourse();
        zdbCourse.getCourseInfo();
        System.out.println("finish");
    }
}
