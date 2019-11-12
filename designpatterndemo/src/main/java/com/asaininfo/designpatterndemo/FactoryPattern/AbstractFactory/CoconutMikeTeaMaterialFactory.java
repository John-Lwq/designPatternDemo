package com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory;

import com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory.Material.*;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class CoconutMikeTeaMaterialFactory implements MikeTeaMaterialFactory {

    @Override
    public Powder createPowder() {
        return new CoconutMikePowder();
    }

    @Override
    public Ingredients createIngredients() {
        return new CoconutIngredient();
    }

    @Override
    public Extra createExtra() {
        return new ExtraSugar();
    }
}
