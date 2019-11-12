package com.asaininfo.designpatterndemo.FactoryPattern.Factory;

import com.asaininfo.designpatterndemo.FactoryPattern.MikeTea;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public abstract class MikeTeaShop {

    public MikeTea orderMikeTea() {
        MikeTea mikeTea = createMikeTea();
        mikeTea.prepare();
        mikeTea.brew();
        mikeTea.done();
        return mikeTea;
    }

    public abstract MikeTea createMikeTea();

}
