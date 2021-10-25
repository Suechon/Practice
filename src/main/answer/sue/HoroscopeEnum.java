package main.answer.sue;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.IOException;

/**
 *
 * 星座のenum
 * */
public enum HoroscopeEnum {
    RAM("おひつじ座",1),
    BULL("おうし座",2),
    TWINS("ふたご座",3),
    CRAB("かに座",4),
    LION("しし座",5),
    MAIDEN("おとめ座",6),
    SCALE("てんびん座",7),
    SCORPION("さそり座",8),
    ARCHER("いて座",9),
    GOAT_HORNED("やぎ座",10),
    WATER_BEARER("みずがめ座",11),
    FISH("うお座",12) ;


    private  String name;
    private  int id;

    private HoroscopeEnum(String name ,int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public static  HoroscopeEnum convertEnum(String name) {
        if(name==null){
            return null;
        }
        for (HoroscopeEnum enumValue : HoroscopeEnum.values()) {
            if (enumValue.getName().equals(name)) {
                return enumValue;
            }
        }
        return null;
    }
    public  static HoroscopeEnum convertEnumById(int id) {

        for (HoroscopeEnum enumValue : HoroscopeEnum.values()) {
            if (enumValue.getId()==id) {
                return enumValue;
            }
        }
        return null;
    }

}
