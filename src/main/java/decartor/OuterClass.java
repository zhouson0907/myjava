package decartor;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @author zhouson
 * @create 2021-05-09 7:52
 */
public final class OuterClass<T> {

    interface TransformX<T> {
        //传递了x对象，相当于绑定了方法引用
        Boolean transform(OuterClass o);
    }

    @Test
    public boolean isPresent() {
        return true;
    }

    public static void main(String[] args) {
        TransformX  x = OuterClass::isPresent;
    }


}
