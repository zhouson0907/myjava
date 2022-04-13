package method;

import java.util.HashMap;

/**
 * @author zhouson
 * @create 2022-04-02 16:41
 */
public class MethodFeature {
    static class Father {
        private String name;

        public Father() {
        }

        //这个就是对构造方法的重载
        public Father(String name) {
            this.name = name;
        }
        public void override(String content) {
            System.out.println(content);
        }

        public String overload(String s) {
            return s;
        }

        public String overload(String s, String plus) {
            return s + plus;
        }
    }

    static class Child extends Father{
        public Child() {

        }
        @Override
        // 这个就是对Father类override方法的重写
        public void override(String content) {
            System.out.println("重写内容为：子类"+content);
        }
    }

    public static void main(String[] args) {
        System.out.println("******************下面是重写******************");
        //对构造方法重写
        Father f = new Father();
        Father f1 = new Father("I am father");
        //子类重写父类方法
        f.override("father方法");
        Child child = new Child();
        child.override("重写父类方法");
        System.out.println("******************下面是重载******************");
        System.out.println(f.overload("helloworld"));
        System.out.println(f.overload("hello","world"));

    }
}
