package com.asaininfo.designpatterndemo.decoratorPattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/5
 */
public class SpicyEggCakeV2 extends EggCakeV2 {

    @Override
    public String getDescription() {
        StringBuilder str = new StringBuilder("辣酱鸡蛋饼");
        if (isBaconic()) str.append("加培根");
        if (isDoubleEgg()) str.append("双倍鸡蛋");
        if (isFritters()) str.append("加油条");
        if (isLettuce()) str.append("加生菜");
        return str.toString();
    }

    public static void main(String[] args) {
        SpicyEggCakeV2 spicyEggCake = new SpicyEggCakeV2();
        spicyEggCake.setBaconic(true);
        spicyEggCake.setLettuce(true);
        System.out.println(spicyEggCake.getDescription()+"   花费"+spicyEggCake.cost());
    }
}
