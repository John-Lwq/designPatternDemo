package com.asaininfo.designpatterndemo.ObserverPattern;

/**
 * @author luowq
 * @description  体重秤类
 * @date 2019/11/8
 */
public class WeightScale {
    private float bodyFat;  //体脂
    private float bodyWeight;   //体重
    private float muscleMass;    //肌肉量

    public void updateBodyCondition(float bodyFat,float bodyWeight,float muscleMass){
        setBodyFat(bodyFat);
        setMuscleMass(muscleMass);
        setBodyWeight(bodyWeight);
        System.out.println("体重秤更新主人身体情况：体重"+getBodyWeight()+" kg,体脂率:"+getBodyFat()+" ,肌肉量："+getMuscleMass()+"kg");
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
