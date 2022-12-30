package demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PersonInfoAnnotation {

    public String name();

    public int age() default 19;

    public String gender() default "男";

    public String[] language();
}
