package com.asaininfo.designpatterndemo.ObserverPattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/8
 */
public class WeightScaleV2 implements Observer,Analysis{
    Subject subject;

    public WeightScaleV2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float bodyFat, float bodyWeight, float muscleMass) {
        System.out.println("体重秤更新主人身体情况：体重" + bodyWeight + " kg,体脂率:" + bodyFat + " ,肌肉量：" + muscleMass + "kg");
        analysis(bodyFat,bodyWeight,muscleMass);
    }

    @Override
    public void analysis(float bodyFat, float bodyWeight, float muscleMass) {
        System.out.println("体重秤内部未安装分析插件，无法解析主人身体情况");
    }
}
