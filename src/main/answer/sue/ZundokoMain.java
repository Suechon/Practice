package main.answer.sue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**

 *
 * */
public class ZundokoMain {

    public static void main(String args[]) {
        Zundoko zundoko = new Zundoko();
        //List<Integer> aveList = new ArrayList<>();
        long total=0;
        int i = 0;
        for(i = 0; i < 999999; i++){
            int num = zundoko.execute();
            total += num;
            //aveList.add(total/i);
        }
        System.out.println(String.format("average: %.5f", ((double) total) / i));
        //aveList.forEach(System.out::println);

    }

}
