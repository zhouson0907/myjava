package generic;

/**
 * @author zhouson
 * @create 2019-05-01 20:34
 */
public class GenericTest {
    public static void main(String[] args) {
     /*   GenericCustomizeClass<String> g=new GenericCustomizeClass();
        g.setName("小明");
        String name = g.getName();
        System.out.println(name);*/
     GenericCustomizeMethod gm=new GenericCustomizeMethod();
     gm.method01(10);
     GenericCustomizeMethod.method02("abc");
    }
}
