package com.asaininfo.designpatterndemo.FactoryPattern.SimpleFactory;

import com.asaininfo.designpatterndemo.FactoryPattern.MikeTea;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class SimpleMikeTeaShop {
    SimpleMikeTeaFactory mikeTeaFactory;

    public SimpleMikeTeaShop(SimpleMikeTeaFactory mikeTeaFactory){
        this.mikeTeaFactory = mikeTeaFactory;
    }

    public MikeTea orderMikeTea(String type){
        MikeTea mikeTeaInstance = mikeTeaFactory.getMikeTeaInstance(type);
        mikeTeaInstance.prepare();
        mikeTeaInstance.brew();
        mikeTeaInstance.done();
        return mikeTeaInstance;
    }

    public static void main(String[] args) {
        SimpleMikeTeaFactory mikeTeaFactory = new SimpleMikeTeaFactory();
        SimpleMikeTeaShop mikeTeaShop = new SimpleMikeTeaShop(mikeTeaFactory);
        mikeTeaShop.orderMikeTea("Pearl");
        mikeTeaShop.orderMikeTea("Coconut");
    }
}
