package com.asaininfo.designpatterndemo.ObserverPattern.JavaObserver;

import com.asaininfo.designpatterndemo.ObserverPattern.pattern.Analysis;

import java.util.Observable;
import java.util.Observer;

/**
 * @author luowq
 * @description
 * @date 2019/11/10
 */
public class MiCloudV3 implements Observer, Analysis {
    Observable subject;
    private float bodyFat;       //体脂率
    private float bodyWeight;    //体重
    private float muscleMass;  //肌肉量

    public MiCloudV3(Observable subject){
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
            System.out.println("云端更新用户身体情况：体重" + bodyWeight + " kg,体脂率:" + bodyFat + " ,肌肉量：" + muscleMass + "kg");
            analysis(bodyFat,bodyWeight,muscleMass);
        }
    }


    @Override
    public void analysis(float bodyFat, float bodyWeight, float muscleMass) {
        System.out.println("云端咱们只管收了数据，然后交给市场部的去分析用户推荐商品");
    }
}
