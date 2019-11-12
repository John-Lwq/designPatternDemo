package com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class PearlMikeTeaFactory extends MikeTeaShop {

    @Override
    public MikeTea createMikeTea() {
        MikeTeaMaterialFactory materialFactory = new PearlMikeTeaMaterialFactory();
        MikeTea mikeTea = new PearlMikeTea(materialFactory);
        return mikeTea;
    }
}
