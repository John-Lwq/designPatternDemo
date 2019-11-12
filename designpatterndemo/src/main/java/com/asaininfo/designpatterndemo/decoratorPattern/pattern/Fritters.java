package com.asaininfo.designpatterndemo.decoratorPattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/6
 */
public class Fritters extends CondimentDecorator {
    private EggCakePattren eggCakePattren;

    public Fritters(EggCakePattren eggCakePattren) {
        this.eggCakePattren = eggCakePattren;
    }

    @Override
    public String getDescription() {
        return eggCakePattren.getDescription()+"加油条";
    }

    @Override
    public double cost() {
        return eggCakePattren.cost() + 1.5;
    }
}
