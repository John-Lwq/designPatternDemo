package com.asaininfo.designpatterndemo.decoratorPattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/5
 */
public class SpicyEggCakeWithBaconic extends EggCake {
    private String description;

    @Override
    public String getDescription() {
        return "辣酱鸡蛋饼加培根";
    }

    @Override
    public double cost() {
        return 5;
    }
}
