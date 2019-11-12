package com.asaininfo.designpatterndemo.statepattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/3
 */
public class HasTwoCountState implements State {
    AutoWashMachineV3 washMachine;


    public HasTwoCountState(AutoWashMachineV3 washMachine){
        this.washMachine = washMachine;
    }

    @Override
    public void insertCount() {
        System.out.println("投入三枚硬币，可以进入升级洗衣模式");
        washMachine.setState(new HasTwoCountState(washMachine));
    }

    @Override
    public void rejectCount() {
        System.out.println("退出两枚硬币，欢迎再次使用");
        washMachine.setState(new NoCountState(washMachine));
    }

    @Override
    public void startWash() {
        System.out.println("开始进行普通洗衣，请稍后");
        washMachine.setState(new NoCountState(washMachine));
    }
}
