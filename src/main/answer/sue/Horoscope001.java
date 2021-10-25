package main.answer.sue;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.Map.Entry;

/**
 *
 * 総合ランキング順にならべる
 * */
public class Horoscope001 {


    public  List<Entry<HoroscopeEnum, Integer>> execute() throws IOException {
        File readFile = new File("src/main/answer/sue/fortune.csv");
        if(!readFile.exists()){
            return null;
        }
        try(BufferedReader br = new BufferedReader(new FileReader(readFile))){
            String line;
            String[] data;

            int s=0;

            Map<HoroscopeEnum,Integer> pointMap = createPointMap();
//            List<Integer> pointList = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0));
            while ((line = br.readLine()) != null) {
                String replaceLine = line.replaceAll("\"", "");
                data = replaceLine.split(",");
                Pattern pattern = Pattern.compile("\\d");

                boolean result = pattern.matcher(data[0]).find();

                //Headerや空行はスキップする
                if (!pattern.matcher(data[0]).find()) {
                    continue;
                }
                for (int i = 1; i < data.length; i++) {
                    HoroscopeEnum horoscope  = HoroscopeEnum.convertEnumById(i);
                    int point = pointMap.get(horoscope);
                    pointMap.put(horoscope,point+Integer.valueOf(data[i]));
                }

            }

            //Entry(keyとvalueのセット)をlistに格納する
            List<Entry<HoroscopeEnum, Integer>> list = new ArrayList<>(pointMap.entrySet());
            // 逆順でソート
            list.sort(Collections.reverseOrder(Entry.comparingByValue()));
            return list;
            }
    }


    private Map createPointMap(){
        Map<HoroscopeEnum,Integer> pointMap = new HashMap<>();
        pointMap.put(HoroscopeEnum.RAM,0);
        pointMap.put(HoroscopeEnum.BULL,0);
        pointMap.put(HoroscopeEnum.TWINS,0);
        pointMap.put(HoroscopeEnum.CRAB,0);
        pointMap.put(HoroscopeEnum.LION,0);
        pointMap.put(HoroscopeEnum.MAIDEN,0);
        pointMap.put(HoroscopeEnum.SCALE,0);
        pointMap.put(HoroscopeEnum.SCORPION,0);
        pointMap.put(HoroscopeEnum.ARCHER,0);
        pointMap.put(HoroscopeEnum.GOAT_HORNED,0);
        pointMap.put(HoroscopeEnum.WATER_BEARER,0);
        pointMap.put(HoroscopeEnum.FISH,0);
        return pointMap;
    }

}
