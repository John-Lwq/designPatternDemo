package com.asaininfo.designpatterndemo.FactoryPattern.Factory;

import com.asaininfo.designpatterndemo.FactoryPattern.MikeTea;
import com.asaininfo.designpatterndemo.FactoryPattern.StockMikeTea;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class StockMikeTeaFactory extends MikeTeaShop {

    @Override
    public MikeTea createMikeTea() {
        return new StockMikeTea();
    }
}
