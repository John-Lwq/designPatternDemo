package com.asaininfo.designpatterndemo.decoratorPattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/6
 */
public class Baconic extends CondimentDecorator {

    private EggCakePattren eggCakePattren;

    public Baconic(EggCakePattren eggCakePattren) {
        this.eggCakePattren = eggCakePattren;
    }

    @Override
    public String getDescription() {
        return eggCakePattren.getDescription() + "加培根";
    }

    @Override
    public double cost() {
        return eggCakePattren.cost() + 2.0;
    }
}
