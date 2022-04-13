package MyAnnotation;

import decartor.Cake;

import java.lang.annotation.*;

/**
 * @author zhouson
 * @create 2021-05-10 22:30
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    int id();
    String description() default "no description";
}
