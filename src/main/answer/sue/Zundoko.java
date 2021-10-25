package main.answer.sue;

import java.util.Random;

/**
 * "ズン"と"ドコ"をランダムに出力し、
 * ズン ズン ズン ズンドコが揃ったら最後に"きよし!"を出力して終了するプログラムをかいてください。
 *
 * */
public class Zundoko {
    private static final String ZUN ="ズン";
    private static final String DOKO ="ドコ";


    public int  execute(){
        Random rand = new Random();
        int zunCount=0;
        int i =0;
        while(true){
            i++;
            int num = rand.nextInt(10) + 1;
            if (num%2==0){
//                System.out.print(ZUN);
                if(4<=zunCount){
                    continue;
                }else{
                zunCount++;}
            }else{
//                System.out.print(DOKO);
                if(zunCount==4){break;}
                zunCount=0;
            }
        }
//        System.out.print("きよし!");
        return i;
    }
}
