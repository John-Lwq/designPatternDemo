package com.asaininfo.designpatterndemo.FactoryPattern.Factory;

import com.asaininfo.designpatterndemo.FactoryPattern.MikeTea;
import com.asaininfo.designpatterndemo.FactoryPattern.PearlMikeTea;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class PearlMikeTeaFactory extends MikeTeaShop{
    @Override
    public MikeTea createMikeTea() {
        return new PearlMikeTea();
    }
}
