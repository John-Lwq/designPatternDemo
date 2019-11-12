package com.asaininfo.designpatterndemo.ObserverPattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/8
 */
public class BodyCondition {
    private float bodyFat;  //体脂
    private float bodyWeight;   //体重
    private float muscleMass;    //肌肉量

    private WeightScale weightScale = new WeightScale();
    private MiCloud miCloud = new MiCloud();
    private AnalysisServer analysisServer = new AnalysisServer();

    public void weightBody(float bodyFat,float bodyWeight,float muscleMass){
        this.bodyFat = bodyFat;
        this.muscleMass = muscleMass;
        this.bodyWeight = bodyWeight;
        weightScale.updateBodyCondition(bodyFat,bodyWeight,muscleMass);
        miCloud.updateBodyCondition(bodyFat,bodyWeight,muscleMass);
        analysisServer.updateBodyCondition(bodyFat,bodyWeight,muscleMass);
    }

    public static void main(String[] args) {
        BodyCondition bodyCondition = new BodyCondition();
        bodyCondition.weightBody(25,75,42);
    }
}
