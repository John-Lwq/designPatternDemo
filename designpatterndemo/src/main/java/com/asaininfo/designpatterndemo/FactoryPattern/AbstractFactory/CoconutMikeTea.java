package com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory;

import com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory.MikeTea;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class CoconutMikeTea extends MikeTea {
    MikeTeaMaterialFactory materialFactory;

    public CoconutMikeTea(MikeTeaMaterialFactory materialFactory){
        this.materialFactory = materialFactory;
    }

    @Override
    void prepare() {
        powder = materialFactory.createPowder();
        ingredients = materialFactory.createIngredients();
        extra = materialFactory.createExtra();
        System.out.println("往奶茶杯中添加"+powder+"," +ingredients+",额外加入"+extra);
    }
}
