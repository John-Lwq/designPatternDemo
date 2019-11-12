package com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class CoconutMikeTeaFactory extends MikeTeaShop{

    @Override
    public MikeTea createMikeTea() {
        MikeTeaMaterialFactory materialFactory = new CoconutMikeTeaMaterialFactory();
        MikeTea mikeTea = new CoconutMikeTea(materialFactory);
        return mikeTea;
    }
}
