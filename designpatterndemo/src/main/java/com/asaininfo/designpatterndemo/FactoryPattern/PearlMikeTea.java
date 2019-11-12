package com.asaininfo.designpatterndemo.FactoryPattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class PearlMikeTea implements MikeTea {
    @Override
    public void prepare() {
        System.out.println("准备珍珠奶茶");
    }

    @Override
    public void brew() {
        System.out.println("冲泡珍珠奶茶");
    }

    @Override
    public void done() {
        System.out.println("珍珠奶茶制作完毕，准备提供给客人");
    }
}
