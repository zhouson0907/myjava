package system;

import java.util.Arrays;

/**
 * @author zhouson
 * @create 2019-04-29 21:52
 */
public class SystemDemo {
    public static void main(String[] args) {
        //返回以毫秒为单位的当前时间
        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.print(i);
        }
        System.out.println();
        long l1 = System.currentTimeMillis();
        System.out.println("程序耗时：" + (l1 - l) + "毫秒");
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {4, 5, 6};
        /**
         * 参数:
         *   src -源数组
         *   srcPos -原数组的其实位置（起始索引）
         *   dest -目标数组
         *   destPos -目标数组的其实位置（起始索引）
         *   length -要复制的数组元素的数量
         */
        System.arraycopy(b1, 0, b2, 1, 2);
        System.out.println(Arrays.toString(b2));
    }
}
