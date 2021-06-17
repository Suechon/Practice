package main.answer.sue;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *　干支から西暦を判定するメソッドと、西暦から干支を判定するメソッドを作成してください。
 * 干支から判定する場合は西暦1~西暦3000年までの範囲とする
 * */
public class Practice004 {
    private static final List<String> ZYUUNISHI= new ArrayList<>(Arrays.asList("子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"));
    private static final List<String> ZIKKAN= new ArrayList<>(Arrays.asList("甲","乙","丙","丁","戊","己","庚","辛","壬","癸"));

    public static void main(String[] args) {
        String eto = convertEto(0);
        System.out.println(eto);
        convertYear("甲子");


    }
    public static String convertEto(int year){
        if(year<=0){
            return "存在しません:"+year;
        }
        String eto="";
        int modZikkan = (year+6)%10;
        int modEto = (year+8)%12;

        eto +=ZIKKAN.get(modZikkan);
        eto +=ZYUUNISHI.get(modEto);

        return eto;
    }
    public static void convertYear(String eto){
        String[] etoList = eto.split("");
        Integer[] modList = new Integer[2];
        boolean validate=false;


        for(int i = 0; i<ZIKKAN.size();i++){
            if(ZIKKAN.get(i).equals(etoList[0])){
                validate=true;
                int mod=i+4;
                if(9<mod){
                    mod=mod-10;
                }
                modList[0]=mod;
                break;
            }
        }
        if(!validate){
            System.out.println("入力値おかしい:"+eto);
            return;
        }
        validate=false;

        for(int i = 0; i<ZYUUNISHI.size();i++){
            if(ZYUUNISHI.get(i).equals(etoList[1])){
                validate=true;
                int mod=i+4;
                if(12<mod){
                    mod=mod-12;
                }
                modList[1]=mod;
                break;
            }
        }
        if(!validate){
            System.out.println("入力値おかしい:"+eto);
            return;
        }

        StringBuilder sb = new StringBuilder();

        int j=0;
        for(int i =1; i<3000; i++ ){

            //力尽きた
//            System.out.println(modList[0]+"aaaa"+modList[1]);
            if((i%10)==modList[0]&&(i%12)==modList[1]){
                j++;
                sb.append(i);
                sb.append(",");
                if(j%10==0){
                    sb.append("\n");
                }
            }

        }
        System.out.println(sb.toString());
    }



}
