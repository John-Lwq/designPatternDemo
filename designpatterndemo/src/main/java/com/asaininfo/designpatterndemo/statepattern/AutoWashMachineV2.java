package com.asaininfo.designpatterndemo.statepattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/3
 */
public class AutoWashMachineV2 {
    private final static int MACHINE_ERROR = 9999;
    private final static int NO_COUNT = 0;
    private final static int HAS_COUNT_1 = 1;
    private final static int HAS_COUNT_2 = 2;
    private final static int HAS_COUNT_3 = 3;

    int state = NO_COUNT;
    public void insertCount(){
        if(state == MACHINE_ERROR){
            throw new RuntimeException("机器故障，请联系工作人员");
        }
        if(state == HAS_COUNT_3){
            System.out.println("已经投币3元，无需再次投币");
        }
        if(state == HAS_COUNT_2){
            System.out.println("共投币3元，将会进行加长型洗衣");
            state = HAS_COUNT_3;
        }
        if(state == HAS_COUNT_1){
            System.out.println("共投币2元，将会进行普通型洗衣");
            state = HAS_COUNT_2;
        }
        if(state == NO_COUNT){
            System.out.println("投币成功，将会进行漂洗工作");
            state = HAS_COUNT_1;
        }
    }

    public void rejectCount(){
        if(state == MACHINE_ERROR){
            throw new RuntimeException("机器故障，请联系工作人员");
        }
        if(state == NO_COUNT){
            System.out.println("没有投币，无法退币");
        }
        if(state == HAS_COUNT_1){
            System.out.println("退币1元，欢迎再次使用");
            state = NO_COUNT;
        }
        if(state == HAS_COUNT_2){
            System.out.println("退币2元，欢迎再次使用");
            state = NO_COUNT;
        }
        if(state == HAS_COUNT_3){
            System.out.println("退币3元，欢迎再次使用");
            state = NO_COUNT;
        }
    }

    public void startWash(){
        if(state == MACHINE_ERROR){
            throw new RuntimeException("机器故障，请联系工作人员");
        }
        if(state == NO_COUNT){
            System.out.println("您没有投币，无法洗衣");
        }
        if(state == HAS_COUNT_3){
            System.out.println("开始进行加长型洗衣,请稍后");
            state = NO_COUNT;
        }
        if(state == HAS_COUNT_2){
            System.out.println("开始进行普通型洗衣,请稍后");
            state = NO_COUNT;
        }
        if(state == HAS_COUNT_1){
            System.out.println("开始进行漂洗,请稍后");
            state = NO_COUNT;
        }
    }

    public static void main(String[] args) {
        AutoWashMachineV2 washMachine = new AutoWashMachineV2();
        washMachine.insertCount();
        washMachine.insertCount();
        washMachine.insertCount();
        //washMachine.rejectCount();
        washMachine.startWash();
    }
}
