package com.zhouson.practice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author zhouson
 * @create 2019-05-01 20:58
 */
//斗地主案例
public class FightAgainstLandlords {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        //准备扑克牌
        String[] colors = {"♠", "❤", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        poker.add("小王");
        poker.add("大王");
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }
        //洗牌
        Collections.shuffle(poker);
        System.out.println(poker);
        System.out.println(poker.size());
        //发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> ihand = new ArrayList<>();
        //注意先判断底牌，否则牌发完了就凉了
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
            //轮流发牌
            if (i >= 51) {
                //给底牌发牌
                ihand.add(p);
            } else if (i % 3 == 0) {
                //给玩家1发牌
                player01.add(p);
            } else if (i % 3 == 1) {
                //给玩家2发牌
                player02.add(p);
            } else if (i % 3 == 2) {
                //给玩家3发牌
                player03.add(p);
            }
        }
        System.out.println("刘德华：" + player01);
        System.out.println("周星驰：" + player02);
        System.out.println("周润发：" + player03);
        System.out.println("底牌：" + ihand);
    }

}
