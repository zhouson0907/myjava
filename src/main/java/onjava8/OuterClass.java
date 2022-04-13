package onjava8;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * @author zhouson
 * @create 2021-05-08 10:25
 */
public class OuterClass {
    class Contents {
        private int i = 11;
        public int value() { return i; }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() { return label; }

        public OuterClass outer() {
            //这个this是内部类的this，相当于和内部类和外部类链接起来
            return OuterClass.this;
        }
    }

    public void ship(String dest) {
        OuterClass outer = new OuterClass();
        Contents c = outer.new Contents();
        Destination d = outer.new Destination("s");
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        OuterClass p = new OuterClass();
        p.ship("Tasmania");
        OuterClass q = new OuterClass();
        // Defining references to inner classes:
        OuterClass.Contents c = q.new Contents();
        System.out.println(c.i);
        OuterClass.Destination d = q.new Destination("Borneo");
        OuterClass outer = d.outer();
        outer.ship("a");
    }
}
