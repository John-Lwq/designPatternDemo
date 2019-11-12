package com.asaininfo.designpatterndemo.decoratorPattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/5
 */
public class SpicyEggCakeWithDoubleEgg extends EggCake {

    public String description;

    @Override
    public String getDescription(){
        return "辣酱鸡蛋饼额外多加一个鸡蛋";
    }

    @Override
    public double cost() {
        return 4.5;
    }
}
