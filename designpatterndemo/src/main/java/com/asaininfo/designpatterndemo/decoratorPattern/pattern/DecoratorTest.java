package com.asaininfo.designpatterndemo.decoratorPattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/6
 */
public class DecoratorTest {
    public static void main(String[] args) {
        EggCakePattren eggCakePattren = new SpicyEggCake();
        System.out.println(eggCakePattren.getDescription()+"  共花费"+eggCakePattren.cost());

        EggCakePattren eggCakePattren1 = new SweetEggCake();
        eggCakePattren1 = new Baconic(eggCakePattren1);
        eggCakePattren1 = new Baconic(eggCakePattren1);
        eggCakePattren1 = new DoubleEgg(eggCakePattren1);
        eggCakePattren1 = new Fritters(eggCakePattren1);
        System.out.println(eggCakePattren1.getDescription()+"  共花费"+eggCakePattren1.cost());

    }

}
