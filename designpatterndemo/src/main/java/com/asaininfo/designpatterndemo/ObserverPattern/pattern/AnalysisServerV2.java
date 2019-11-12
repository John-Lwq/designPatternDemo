package com.asaininfo.designpatterndemo.ObserverPattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/8
 */
public class AnalysisServerV2 implements Observer,Analysis{

    Subject subject;

    public AnalysisServerV2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float bodyFat, float bodyWeight, float muscleMass) {
        System.out.println("分析服务器分析用户身体情况：体重" + bodyWeight + " kg,体脂率:" + bodyFat + " ,肌肉量：" + muscleMass + "kg");
        analysis(bodyFat,bodyWeight,muscleMass);
    }

    @Override
    public void analysis(float bodyFat, float bodyWeight, float muscleMass) {
        System.out.println("此处应该有一套详细的分析逻辑，但是我不太懂");
    }
}
