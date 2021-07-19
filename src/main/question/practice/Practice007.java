package main.question.practice;

/**
 * 引数に与えられた文字列に含まれる{{3桁の数値}}の位置を出力してください。
 * 正規表現を使用してください。
 * */
public class Practice007 {

	public static void main(String[] args) {
		String str = "";
		printPlace(str);
		// 何も出力しない

		str = "test{{001}}";
		printPlace(str);
		// 4

		str = "test{{003}}あ{{}}ああ{{001}}";
		printPlace(str);
		// 4
		// 18
		return;
	}

	public static void printPlace(String str) {
		return;
	}
}
