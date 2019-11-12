package com.asaininfo.designpatterndemo.statepattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/3
 */
public class HasThreeCountState implements State {

    AutoWashMachineV3 washMachine;


    public HasThreeCountState(AutoWashMachineV3 washMachine){
        this.washMachine = washMachine;
    }

    @Override
    public void insertCount() {
        System.out.println("已经投入三枚硬币，无法再接受更多硬币");
    }

    @Override
    public void rejectCount() {
        System.out.println("退出三枚硬币，欢迎再次使用");
        washMachine.setState(new NoCountState(washMachine));
    }

    @Override
    public void startWash() {
        System.out.println("开始进行加长型洗衣，请稍后");
        washMachine.setState(new NoCountState(washMachine));
    }
}
