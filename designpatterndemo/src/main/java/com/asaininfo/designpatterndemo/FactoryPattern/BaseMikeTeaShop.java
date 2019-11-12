package com.asaininfo.designpatterndemo.FactoryPattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class BaseMikeTeaShop {

    public MikeTea orderMikeTea(String type){
        MikeTea mikeTea = null;
        if(type.equals("Pearl")){
            mikeTea = new PearlMikeTea();
        }else if(type.equals("Stock")){
            mikeTea = new StockMikeTea();
        }else if(type.equals("Coconut")){
            mikeTea = new CoconutMikeTea();
        }
        mikeTea.prepare();
        mikeTea.brew();
        mikeTea.done();
        return mikeTea;
    }

    public static void main(String[] args) {
        BaseMikeTeaShop baseMikeTeaShop = new BaseMikeTeaShop();
        baseMikeTeaShop.orderMikeTea("Stock");
        baseMikeTeaShop.orderMikeTea("Pearl");
    }

}
