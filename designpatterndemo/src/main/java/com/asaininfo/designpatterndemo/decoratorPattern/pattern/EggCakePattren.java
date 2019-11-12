package com.asaininfo.designpatterndemo.decoratorPattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/6
 */
public abstract class EggCakePattren {

    String description = "原味鸡蛋饼";

    public String getDescription(){
        return  description;
    }

    public abstract double cost();

}
