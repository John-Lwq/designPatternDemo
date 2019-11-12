package com.asaininfo.designpatterndemo.statepattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/3
 */
public class AutoWashMachineV3 {
    private  State currentState = new NoCountState(this);

    public  void setState(State state){
        currentState = state;
    }

    public void insertCount(){
        currentState.insertCount();
    }

    public void rejectCount(){
        currentState.rejectCount();
    }

    public void startWash(){
        currentState.startWash();
    }

    public static void main(String[] args) {
        AutoWashMachineV3 washMachine = new AutoWashMachineV3();
        washMachine.insertCount();
        washMachine.insertCount();
        washMachine.startWash();
        washMachine.rejectCount();

        System.out.println("突然有一天，洗衣机坏了------------------");
        washMachine.setState(new ErrorMachineState(washMachine));
        washMachine.insertCount();
        washMachine.startWash();
        washMachine.rejectCount();

    }
}
