package generic;

/**
 * @author zhouson
 * @create 2019-05-01 20:48
 */

import java.util.ArrayList;

/**
 * 泛型通配符:
 *     ?:代表任意的数据类型
 * 使用方式：
 *     不能创建对象使用
 *     只能作为方法的参数使用
 *  泛型是没有继承关系的，即是什么类型就是什么类型，object类型是不能接收其他类型的
 *  泛型的上限限定：？extends E 代表使用的泛型只能是E类型的子类/本身
 *  泛型的下限限定：？super E 代表使用的泛型只能是E类型的父类/本身
 *
 */
public class GenericWildcards {
    public void test(ArrayList<?> a){

    }
}
