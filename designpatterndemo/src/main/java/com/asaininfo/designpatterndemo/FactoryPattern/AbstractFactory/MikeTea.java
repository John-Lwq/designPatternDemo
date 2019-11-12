package com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory;

import com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory.Material.Extra;
import com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory.Material.Ingredients;
import com.asaininfo.designpatterndemo.FactoryPattern.AbstractFactory.Material.Powder;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public abstract class MikeTea {
     Powder powder;
     Ingredients ingredients;
     Extra extra;

    abstract void prepare();

    void brew(){
        System.out.println("开始冲泡奶茶");
    };

    void done(){
        System.out.println("制作完毕，准备提供给客户");
    };


}
