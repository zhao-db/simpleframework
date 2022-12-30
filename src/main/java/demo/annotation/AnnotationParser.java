package demo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
public class AnnotationParser {

    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class zdbClazz = Class.forName("demo.annotation.ZdbCourse");
        Annotation[] annotations = zdbClazz.getAnnotations();
        for (Annotation annotation : annotations) {
            CourseInfoAnnotation an = (CourseInfoAnnotation) annotation;
            System.out.println("annotation = " + an.courseName() + an.courseProfile() + an.courseTag() + an.courseIndex());
        }
//        Constructor[] constructors = zdbClazz.getDeclaredConstructors();
//        for (Constructor constructor : constructors) {
//            System.out.println("constructor.isAnnotationPresent() = " + constructor.isAnnotationPresent());
//        }
    }

    public static void parseFiledAnnotation() throws ClassNotFoundException {
        Class zdbClazz = Class.forName("demo.annotation.ZdbCourse");
        Field[] fields = zdbClazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(PersonInfoAnnotation.class)) {
                PersonInfoAnnotation personInfoAnnotation = field.getAnnotation(PersonInfoAnnotation.class);
                System.out.println("personInfoAnnotation = " + personInfoAnnotation.name() + personInfoAnnotation.gender() + personInfoAnnotation.age());
                for (String language : personInfoAnnotation.language()) {
                    System.out.println("language = " + language);
                }
            }
        }
    }

    public static void parseMethodAnnotation() throws ClassNotFoundException {
        Class zdbClazz = Class.forName("demo.annotation.ZdbCourse");
        Method[] methods = zdbClazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(CourseInfoAnnotation.class)) {
                CourseInfoAnnotation methodAnnotation = method.getAnnotation(CourseInfoAnnotation.class);
                System.out.println("methodAnnotation = " + methodAnnotation.courseName() + methodAnnotation.courseIndex() + methodAnnotation.courseTag() + methodAnnotation.courseProfile());
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        parseMethodAnnotation();
    }

}
