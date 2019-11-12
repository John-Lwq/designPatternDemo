package com.asaininfo.designpatterndemo.decoratorPattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/6
 */
public class DoubleEgg extends CondimentDecorator {
    private EggCakePattren eggCakePattren;

    public DoubleEgg(EggCakePattren eggCakePattren) {
        this.eggCakePattren = eggCakePattren;
    }

    @Override
    public String getDescription() {
        return eggCakePattren.getDescription() + "多加鸡蛋";
    }

    @Override
    public double cost() {
        return eggCakePattren.cost() + 1.5;
    }
}
