package decartor;

import java.util.stream.Stream;

/**
 * @author zhouson
 * @create 2021-05-09 11:33
 */
public class FlatMap {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of(i+"Gonzo", i+"Fozzie", i+"Beaker"))
                .forEach(System.out::println);
    }
}