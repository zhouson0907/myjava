import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @author zhouson
 * @create 2019-05-04 0:56
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
        Test1.class
)
//@SuiteClasses 表示运行这一个单元测试用例会运行多个用例（比如Test1.class,多个用，隔开）
public class Test1 {
    @Before
    public void setup() {

    }

    @Test
    public void test() {
        System.out.println(Math.round(-11.5));
        User u = new User(1, "xiaosan");
    }

    private static class User {
        private int age;
        private String username;

        public User(int age, String username) {
            this.age = age;
            this.username = username;
        }
    }

    @Test
    public void MyWifeOfTriple() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j && i == 0) {
                    System.out.print("小妍");
                    continue;
                }
                System.out.print("我的 ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        final int SQUARE_PROPERTY = 9;
        int edgeNumber = Math.floorDiv(SQUARE_PROPERTY, 2);
        for (int i = 0; i < SQUARE_PROPERTY; i++) {
            // 中间变量
            int t = i;
            if(i > edgeNumber) {
                t = i - 2 * (i - edgeNumber);
            }
            // 运行次数
            int k = 0;
            for (int j = 0; j < 9; j++) {
                if (j + (t + 1) <= edgeNumber) {
                    System.out.print("   ");
                } else {
                    if(t == 4 && k == 4) {
                        System.out.print("小妍 ");
                    } else {
                        System.out.print("我的 ");
                    }
                    k++;

                }
                // 需要打印出 “我的 ”次数
                if (k == (t == 0 ? 1 : 1 + 2 * t)) {
                    break;
                }
            }
            System.out.println();
        }

    }

    @Test
    public void test5() throws ParseException {
        ArrayList<String> args = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2099-04-11");
        System.out.println(parse);
    }

}


