package com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory;

import com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory.Material.Extra;
import com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory.Material.Ingredients;
import com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory.Material.Powder;

/**
 * @author luowq
 * @description  奶茶原料工厂
 * @date 2019/11/11
 */
public interface MikeTeaMaterialFactory {
    public Powder createPowder();
    public Ingredients createIngredients();
    public Extra createExtra();
}
