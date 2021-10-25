package main.answer.sue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**例
 *
 * String型の引数を受け取り、受け取った引数をそのまま返却する関数を作成してください。
 * */
public class HoroscopeMain {
    public static void main(String args[]) throws IOException{
        Horoscope001 horoscope001 = new Horoscope001();
        List<Map.Entry<HoroscopeEnum, Integer>> list = horoscope001.execute();
        list.forEach(item->System.out.println(item.getKey().getName()+"::"+item.getValue()));

        List<HoroscopeBean> beanList= new ArrayList<>();
        for(Map.Entry<HoroscopeEnum, Integer> entry:list){
            HoroscopeBean bean =new HoroscopeBean();
            bean.setSign(entry.getKey());
            bean.setTotalPoint(entry.getValue());
            beanList.add(bean);
        }


        Horoscope002 horoscope002 = new Horoscope002();
        horoscope002.execute(beanList);
    }

}
