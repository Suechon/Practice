package main.answer.sue;

/**
 *　自分が生まれた年から今年までのうるう年を判定し、出力してください
 * 【うるう年の条件】
 * 条件 1:西暦年が400の倍数である場合、閏年
 * 条件 2:条件 1. を満たさず（西暦年が400の倍数ではなく）、かつ西暦年が100の倍数である場合、平年
 * 条件 3:条件 1. と 2. を両方とも満たさず（西暦年が100の倍数ではなく）、かつ西暦年が4の倍数である場合、閏年
 * 条件 4:条件 1. 〜 3. を全て満たさない場合、平年
 * */
public class Practice003 {

    public static void main(String[] args) {
        for(int i = 1993; i<=2021; i++){
            if(isLeapYear(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isLeapYear(int year){

        if(year%400==0){
            return true;
        }
        if(year%100==0){
            return false;
        }
        if(year%4==0){
            return true;
        }


        return false;
    }

}
