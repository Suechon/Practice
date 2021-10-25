package main.answer.sue;

import java.io.IOException;
import java.util.*;

/**
 *　標準偏差出す
 * */
public class Horoscope002 {

    public void execute(List<HoroscopeBean> list) throws IOException {
        System.out.println("----------------");
        //平均
       double average = getAverage(list);
       System.out.println("平均:"+average);
       if(average==0){
           System.out.println("有効なデータがありません");
           return;
       }
        //分散
        double totalDeviation=0;
        for(HoroscopeBean bean : list) {
            double deviation =  deviation(average,bean.getTotalPoint());
            bean.setDeviation(deviation);
            totalDeviation+=deviation;
        }
        double variance=totalDeviation/list.size();
        System.out.println("分散:"+Math.round(variance));

        //標準偏差
        double standardDeviation = Math.round(Math.sqrt(totalDeviation/list.size()));
        System.out.println("標準偏差:"+standardDeviation);

        //偏差値
        for(HoroscopeBean bean : list) {
            double deviationValue =Math.round((((bean.getTotalPoint()-average)/standardDeviation)*10)+50);
            System.out.println(bean.getSign().getName()+"の偏差値:"+deviationValue);
        }



    }

    private double getAverage(List<HoroscopeBean> list){
        int total=0;
        for(HoroscopeBean bean : list) {
            total += bean.getTotalPoint();
        }
        if(total==0) { return total; }
        return Math.round(total/list.size());
    }

    private double deviation(double average, int point){
        return Math.round(Math.pow((average-point),2));
    }



}
