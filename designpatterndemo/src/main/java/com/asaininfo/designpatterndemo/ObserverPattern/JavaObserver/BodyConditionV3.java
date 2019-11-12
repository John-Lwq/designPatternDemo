package com.asaininfo.designpatterndemo.ObserverPattern.JavaObserver;

import java.util.Observable;

/**
 * @author luowq
 * @description
 * @date 2019/11/10
 */
public class BodyConditionV3 extends Observable {
    private float bodyFat;       //体脂率
    private float bodyWeight;    //体重
    private float muscleMass;  //肌肉量

    public BodyConditionV3(){} //不再需要维护一个集合，由父类代劳

    public void weightBody(float bodyFat,float bodyWeight,float muscleMass){
        this.bodyFat = bodyFat;
        this.bodyWeight = bodyWeight;
        this.muscleMass = muscleMass;
        changeBodyCondition();
    }

    public void changeBodyCondition(){
        setChanged();
        notifyObservers();
    }

    public float getBodyFat() {
        return bodyFat;
    }

    public void setBodyFat(float bodyFat) {
        this.bodyFat = bodyFat;
    }

    public float getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(float bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public float getMuscleMass() {
        return muscleMass;
    }

    public void setMuscleMass(float muscleMass) {
        this.muscleMass = muscleMass;
    }
}
