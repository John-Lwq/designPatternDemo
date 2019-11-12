package com.asaininfo.designpatterndemo.ObserverPattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/8
 */
public class MiCloudV2 implements Observer ,Analysis{
    Subject subject;

    public MiCloudV2(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float bodyFat, float bodyWeight, float muscleMass) {
        System.out.println("云端更新用户身体情况：体重" + bodyWeight + " kg,体脂率:" + bodyFat + " ,肌肉量：" + muscleMass + "kg");
        analysis(bodyFat,bodyWeight,muscleMass);
    }

    @Override
    public void analysis(float bodyFat, float bodyWeight, float muscleMass) {
        System.out.println("云端咱们只管收了数据，然后交给市场部的去分析用户推荐商品");
    }

    public void removeObsever(){
        subject.removeObserver(this);
        System.out.println("");
        System.out.println("云端退出观察");
    }
}
