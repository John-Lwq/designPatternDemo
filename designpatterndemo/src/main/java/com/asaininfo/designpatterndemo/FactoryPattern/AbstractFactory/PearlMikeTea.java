package com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory;


import com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory.Material.Extra;
import com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory.Material.Ingredients;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class PearlMikeTea extends MikeTea {
    MikeTeaMaterialFactory materialFactory;

    public PearlMikeTea(MikeTeaMaterialFactory materialFactory){
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
