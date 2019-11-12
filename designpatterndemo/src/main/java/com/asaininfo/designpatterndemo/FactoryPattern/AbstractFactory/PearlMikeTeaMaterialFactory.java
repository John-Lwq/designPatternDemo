package com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory;

import com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory.Material.*;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class PearlMikeTeaMaterialFactory implements MikeTeaMaterialFactory {

    @Override
    public Powder createPowder() {
        return new PearlMikePowder();
    }

    @Override
    public Ingredients createIngredients() {
        return new PearlIngredient();
    }

    @Override
    public Extra createExtra() {
        return new ExtreIce();
    }
}
