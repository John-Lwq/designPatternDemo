package com.asaininfo.designpatterndemo.ObserverPattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/8
 */
public class PatternTest {
    public static void main(String[] args) {
        BodyConditionV2 bodyConditionV2 = new BodyConditionV2();
        WeightScaleV2 weightScaleV2 = new WeightScaleV2(bodyConditionV2);
        MiCloudV2 miCloudV2 = new MiCloudV2(bodyConditionV2);
        AnalysisServerV2 analysisServerV2 = new AnalysisServerV2(bodyConditionV2);

        bodyConditionV2.weightBody(25,75,45);

        miCloudV2.removeObsever();

        bodyConditionV2.weightBody(23,72,46);

    }
}
