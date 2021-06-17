package resource.java;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * 星占いランキングのcsvファイル出力するコード
 * */
public class Horoscope {
    final String  CSV_HEADER="\"年月日\",\"牡羊座\",\"牡牛座\",\"双子座\",\"蟹座\",\"獅子座\","+
        "\"乙女座\",\"天秤座\",\"蠍座\",\"射手座\",\"山羊座\",\"水瓶座\",\"魚座\"";
    final String LF="\n";

    protected void execute() throws IOException, ParseException {
        try(BufferedWriter  bw = new BufferedWriter(new FileWriter("src/resource/fortune.csv"))){
            String line =outputLine("20100101","20211231");
            bw.write(line);
        }

    }

    private String outputLine(String from,String to) throws ParseException {
        StringBuffer sb = new StringBuffer();
        sb.append(CSV_HEADER+LF);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date fromDate =sdf.parse(from);
        Date toDate =sdf.parse(to);
        long diffDay = getDiffDate(fromDate, toDate);

         for(int i=0; i <= diffDay; i++){
             Calendar fromCalendar = Calendar.getInstance();
             fromCalendar.setTime(fromDate);
             fromCalendar.add(Calendar.DAY_OF_MONTH,i);

             Date date = fromCalendar.getTime();
             String day=sdf.format(date);

             sb.append("\""+day+"\""+",");
             List<Integer> rank = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
             Collections.shuffle(rank);
             String rankLine="";
             for(int ranking  :rank){
                 rankLine += ("\""+ranking+"\""+",");
             }
             rankLine = rankLine.replaceFirst(".$",LF);
             sb.append(rankLine);
         }

        return sb.toString();
    }

    private long getDiffDate(Date from,Date to) throws ParseException {
        Calendar fromCalendar = Calendar.getInstance();
        fromCalendar.setTime(from);
        Calendar toCalendar = Calendar.getInstance();
        toCalendar.setTime(to);
        long diff = toCalendar.getTimeInMillis()-fromCalendar.getTimeInMillis();
        long diffDay = ( diff ) / (1000 * 60 * 60 * 24 );
        return diffDay;
    }


}
