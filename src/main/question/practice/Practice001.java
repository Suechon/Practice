package main.question.practice;

/**
 * int型の引数を受け取り、
 * 3の倍数なら"Fizz",5の倍数なら"Buzz",3の倍数かつ5の倍数なら"FizzBuzz",その他の数値ならその値を出力する
 * 関数を作成してください
 * 引数に与える数値Nは 0 <= N <= 2147483647 の範囲の整数とする
 * */
public class Practice001 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(0));

    }
    public static String fizzBuzz(int value) {
        if(value%3==0 && value%5==0) {
            return "FizzBuzz";
        }
        if(value%3==0) {
            return "Fizz";
        }
        if(value%5==0) {
            return "Buzz";
        }
        return String.valueOf(value);
    }
}
