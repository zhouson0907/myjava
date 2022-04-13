package MyAnnotation;

import java.lang.annotation.*;

/**
 * @author zhouson
 * @create 2021-05-10 23:05
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {
    boolean primaryKey() default false;
    boolean allowNull() default true;
    boolean unique() default false;
}
