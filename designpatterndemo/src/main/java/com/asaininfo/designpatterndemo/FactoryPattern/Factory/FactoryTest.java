package com.asaininfo.designpatterndemo.FactoryPattern.Factory;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class FactoryTest {
    public static void main(String[] args) {
        MikeTeaShop mikeTeaShop = new PearlMikeTeaFactory();
        mikeTeaShop.orderMikeTea();

        mikeTeaShop = new CoconumMikeTeaFactory();
        mikeTeaShop.orderMikeTea();
    }
}
