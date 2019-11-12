package com.asaininfo.designpatterndemo.statepattern;

/**
 * @author luowq
 * @description 自助洗衣机类
 * @date 2019/11/3
 */
public class AutoWashMachine {
    private final static int MACHINE_ERROR = 9999;
    private final static int NO_COUNT = 0;
    private final static int HAS_COUNT = 1;

    int state = NO_COUNT;

    public void insertCount(){
        if(state == MACHINE_ERROR){
            throw new RuntimeException("机器故障，请联系工作人员");
        }
        if(state == HAS_COUNT){
            System.out.println("已经投币，无需再次投币");
        }
        if(state == NO_COUNT){
            System.out.println("投币成功，请按下‘开始洗衣’按钮");
            state = HAS_COUNT;
        }
    }

    public void rejectCount(){
        if(state == MACHINE_ERROR){
            throw new RuntimeException("机器故障，请联系工作人员");
        }
        if(state == NO_COUNT){
            System.out.println("您没有投币，无法退币");
        }if(state == HAS_COUNT){
            state = NO_COUNT;
            System.out.println("退币成功，欢迎再次使用");
        }
    }

    public void startWash(){
        if(state == MACHINE_ERROR){
            throw new RuntimeException("机器故障，请联系工作人员");
        }
        if(state == NO_COUNT){
            System.out.println("您没有投币，无法洗衣");
        }if(state == HAS_COUNT){
            state = NO_COUNT;
            System.out.println("开始洗衣，请稍后");
        }
    }

    public static void main(String[] args) {
        AutoWashMachine washMachine = new AutoWashMachine();
        washMachine.insertCount();
        //washMachine.rejectCount();
        washMachine.startWash();
    }
}
