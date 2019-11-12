package com.asaininfo.designpatterndemo.FactoryPattern.SimpleFactory;

import com.asaininfo.designpatterndemo.FactoryPattern.CoconutMikeTea;
import com.asaininfo.designpatterndemo.FactoryPattern.MikeTea;
import com.asaininfo.designpatterndemo.FactoryPattern.PearlMikeTea;
import com.asaininfo.designpatterndemo.FactoryPattern.StockMikeTea;

/**
 * @author luowq
 * @description
 * @date 2019/11/11
 */
public class SimpleMikeTeaFactory {

    public MikeTea getMikeTeaInstance(String type){
            MikeTea mikeTea = null;
            if(type.equals("Pearl")){
                mikeTea =  new PearlMikeTea();
            }else if(type.equals("Stock")){
                mikeTea =  new StockMikeTea();
            }else if(type.equals("Coconut")){
                mikeTea =  new CoconutMikeTea();
            }/*
               try{
                     mikeTea = (MikeTea) Class.forName("com.asaininfo.designpatterndemo.FactoryPattern."+type+"MikeTea").newInstance();
                }catch (Exception e){
                    System.out.println("抱歉，本店不销售"+type+"类型的奶茶");
                    mikeTea = null;
                }
            */
            return mikeTea;
    }
}
