package com.asaininfo.designpatterndemo.ObserverPattern.JavaObserver;

import com.asaininfo.designpatterndemo.ObserverPattern.pattern.Analysis;

import java.util.Observable;
import java.util.Observer;

/**
 * @author luowq
 * @description
 * @date 2019/11/10
 */
public class AnalysisServerV3 implements Observer, Analysis {
    Observable subject;
    private float bodyFat;       //体脂率
    private float bodyWeight;    //体重
    private float muscleMass;  //肌肉量

    public AnalysisServerV3(Observable subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable object, Object arg) {
        if(object instanceof BodyConditionV3){
            BodyConditionV3 bodyCondition = (BodyConditionV3) object;
            this.bodyFat = bodyCondition.getBodyFat();
            this.bodyWeight = bodyCondition.getBodyWeight();
            this.muscleMass = bodyCondition.getMuscleMass();
            System.out.println("分析服务器分析用户身体情况：体重" + bodyWeight + " kg,体脂率:" + bodyFat + " ,肌肉量：" + muscleMass + "kg");
            analysis(bodyFat,bodyWeight,muscleMass);
        }
    }

    @Override
    public void analysis(float bodyFat, float bodyWeight, float muscleMass) {
        System.out.println("此处应该有一套详细的分析逻辑，但是我不太懂");
    }

}
