package com.asaininfo.designpatterndemo.decoratorPattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/5
 */
public abstract class EggCakeV2 {
    private boolean baconic;
    private boolean doubleEgg;
    private boolean lettuce;
    private boolean fritters;

    public String description;

    public boolean isBaconic() {
        return baconic;
    }

    public void setBaconic(boolean baconic) {
        this.baconic = baconic;
    }

    public boolean isDoubleEgg() {
        return doubleEgg;
    }

    public void setDoubleEgg(boolean doubleEgg) {
        this.doubleEgg = doubleEgg;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public boolean isFritters() {
        return fritters;
    }

    public void setFritters(boolean fritters) {
        this.fritters = fritters;
    }

    public abstract String getDescription();

    public double cost(){
        double result = 3.0;
        if (isBaconic()) result += 2.0;
        if (isDoubleEgg()) result += 1.5;
        if (isFritters()) result += 1.5;
        if (isLettuce()) result += 1.0;
        return result;
    };
}
