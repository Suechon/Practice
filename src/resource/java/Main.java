package resource.java;

import java.io.IOException;
import java.text.ParseException;

/**
 * csvファイル出力するコード
 * */
public class Main {
    public static void main(String args[]) throws IOException, ParseException {
        Horoscope whoIsTheLucky = new Horoscope();
        whoIsTheLucky.execute();

       }

}
