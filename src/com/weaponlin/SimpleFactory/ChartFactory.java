package com.weaponlin.SimpleFactory;

/**
 * 图表工厂类：工厂类
 * Created by Weapon Lin on 2017/1/15.
 */
public class ChartFactory {

    public static Chart getChart(String type){
        Chart chart = null;
        if("histogramChart".equalsIgnoreCase(type)){
            chart = new HistogramChart();
            System.out.println("initial histogramChart!");
        }else if("pieChart".equalsIgnoreCase(type)){
            chart = new PieChart();
            System.out.println("initial pieChart!");
        }else if("lineChart".equalsIgnoreCase(type)){
            chart = new LineChart();
            System.out.println("initial lineChart!");
        }

        return chart;
    }

}
