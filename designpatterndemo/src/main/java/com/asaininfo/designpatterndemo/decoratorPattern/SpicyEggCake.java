package com.asaininfo.designpatterndemo.decoratorPattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/5
 */
public class SpicyEggCake extends EggCake {

    private String descrpition = "鸡蛋饼加辣酱";

    @Override
    public String getDescription(){
        return descrpition;
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
