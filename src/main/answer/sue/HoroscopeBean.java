package main.answer.sue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Pattern;

/**
 *
 * 星座ランキングのBean
 * */
public class HoroscopeBean {
    private HoroscopeEnum sign;
    private int totalPoint;
    private double deviation;


    public HoroscopeEnum getSign() {
        return sign;
    }

    public void setSign(HoroscopeEnum sign) {
        this.sign = sign;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public double getDeviation() {
        return deviation;
    }

    public void setDeviation(double deviation) {
        this.deviation = deviation;
    }



}
