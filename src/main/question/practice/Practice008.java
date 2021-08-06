package main.question.practice;

/**
 * 引数に与えられた文字列に含まれる{{3桁の数値}}の値出力してください。
 * 正規表現を使用してください。
 * */
public class Practice008 {

	public static void main(String[] args) {
		String str = "";
		printValue(str);
		// 何も出力しない

		str = "test{{001}}";
		printValue(str);
		// 001

		str = "test{{003}}あ{{}}ああ{{001}}";
		printValue(str);
		// 003
		// 001
		return;
	}

	public static void printValue(String str) {
		return;
	}
}
