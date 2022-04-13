package decartor;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author zhouson
 * @create 2021-05-09 9:33
 */
class WithInner {
    class Inner {}
}
public class InheritInner extends WithInner.Inner {
    //- InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super();
    }
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }

}