package com.asaininfo.designpatterndemo.ObserverPattern.pattern;

import java.util.ArrayList;


/**
 * @author luowq
 * @description
 * @date 2019/11/8
 */
public class BodyConditionV2 implements Subject {
    private ArrayList<Observer> observerList;
    private float bodyFat;       //体脂率
    private float bodyWeight;    //体重
    private float muscleMass;  //肌肉量

    public BodyConditionV2(){
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList){
            observer.update(getBodyFat(),getBodyWeight(),getMuscleMass());
        }
    }

    public void weightBody(float bodyFat,float bodyWeight,float muscleMass){
        this.bodyFat = bodyFat;
        this.bodyWeight = bodyWeight;
        this.muscleMass = muscleMass;
        changeBodyCondition();
    }

    public void changeBodyCondition(){
        notifyObserver();
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
