package com.asaininfo.designpatterndemo.FactoryPattern.Factory;

import com.asaininfo.designpatterndemo.FactoryPattern.CoconutMikeTea;
import com.asaininfo.designpatterndemo.FactoryPattern.MikeTea;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class CoconumMikeTeaFactory extends MikeTeaShop {
    @Override
    public MikeTea createMikeTea() {
        return new CoconutMikeTea();
    }
}
