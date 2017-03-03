package com.weaponlin.SimpleFactory.exercise;

/**
 * Created by Weapon Lin on 2017/2/6.
 */
public class DrawToolFactory {

    public static DrawTool getDrawTool(String type){
        DrawTool dt = null;

        if(type == null){
            return dt;
        }

        if("circle".equals(type)){
            dt = new Circle();
        }else if("triangle".equals(type)){
            dt = new Triangle();
        }else if("square".equals(type)){
            dt = new Square();
        }

        return dt;
    }
}
