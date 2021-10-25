package main.answer.sue;

/**例
 *
 * String型の引数を受け取り、受け取った引数をそのまま返却する関数を作成してください。
 * */
public class Example {
    public static void main(String args[]){
        //メソッド(関数)がちゃんと動いているか確認するための文字列を定義する
        String value = "テスト";
        //メソッド呼ぶ
        String result = returnValue(value);
        // メソッドに引き渡した値と同じ値が返却されているか確認する
        System.out.println(result);
    }
    public static String returnValue(String value){

        return value;
    }
}
