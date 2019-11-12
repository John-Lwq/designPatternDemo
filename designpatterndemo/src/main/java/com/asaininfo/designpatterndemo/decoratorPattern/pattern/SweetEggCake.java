package com.asaininfo.designpatterndemo.decoratorPattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/6
 */
public class SweetEggCake extends EggCakePattren {

    public SweetEggCake() {
        description = "甜酱鸡蛋饼";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
