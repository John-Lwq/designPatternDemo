package com.asaininfo.designpatterndemo.decoratorPattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/6
 */
public class SpicyEggCake extends EggCakePattren {

    public SpicyEggCake() {
        description = "辣酱鸡蛋饼";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
