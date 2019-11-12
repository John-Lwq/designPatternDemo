package com.asaininfo.designpatterndemo.statepattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/3
 */
public class NoCountState implements State {
    AutoWashMachineV3 washMachine;

    public  NoCountState(AutoWashMachineV3 washMachine){
        this.washMachine = washMachine;
    }

    @Override
    public void insertCount() {
        System.out.println("投入一枚硬币，可以进入漂洗模式");
        washMachine.setState(new HasOneCountState(washMachine));
    }

    @Override
    public void rejectCount() {
        System.out.println("没有投入硬币，请投入后再重试此操作");
    }

    @Override
    public void startWash() {
        System.out.println("您没有投入硬币，无法进行洗衣工作"
        );
    }
}
