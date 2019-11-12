package com.asaininfo.designpatterndemo.ObserverPattern.pattern;

/**
 * @author luowq
 * @description  观察者接口
 * @date 2019/11/8
 */
public interface Observer {
    void update(float bodyFat,float bodyWeight,float muscleMass);
}
