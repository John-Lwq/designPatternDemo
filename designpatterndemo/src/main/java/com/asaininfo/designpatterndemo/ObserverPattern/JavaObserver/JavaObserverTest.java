package com.asaininfo.designpatterndemo.ObserverPattern.JavaObserver;

/**
 * @author luowq
 * @description
 * @date 2019/11/10
 */
public class JavaObserverTest {
    public static void main(String[] args) {
        BodyConditionV3 bodyConditionV3 = new BodyConditionV3();
        WeightScaleV3 weightScaleV3 = new WeightScaleV3(bodyConditionV3);
        MiCloudV3 miCloudV3 = new MiCloudV3(bodyConditionV3);
        AnalysisServerV3 analysisServerV3 = new AnalysisServerV3(bodyConditionV3);
        bodyConditionV3.weightBody(25,75,45);
    }
}
