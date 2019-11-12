package com.asaininfo.designpatterndemo.statepattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class ErrorMachineState implements State {
    AutoWashMachineV3 washMachine;

    public ErrorMachineState(AutoWashMachineV3 washMachine){
        this.washMachine = washMachine;
    }

    @Override
    public void insertCount() {
        System.out.println("洗衣机出现故障，无法接受投币");
    }

    @Override
    public void rejectCount() {
        System.out.println("洗衣机故障，无法退出硬币");
    }

    @Override
    public void startWash() {
        System.out.println("洗衣机故障，无法进行洗衣操作");
    }
}
