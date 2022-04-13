package MyAnnotation;

import java.lang.annotation.*;

/**
 * @author zhouson
 * @create 2021-05-10 22:47
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Tests.class)
public @interface Test {
    int id() default 0;
}
