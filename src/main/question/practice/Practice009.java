package main.question.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * 引数に与えられた文字列に含まれる{{3桁の数値}}の文字列をMapで与えられた文字列に置き換えてください。
 * 正規表現を使用してください。
 * */
public class Practice009 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "1番です");
		map.put("002", "2番です");

		String str = "";
		replaceString(str, map);
		// 何も出力しない

		str = "test{{001}}";
		replaceString(str, map);
		// test1番です

		// 対応するキーがmapに存在しない場合は空文字列で置き換えてください
		str = "test{{003}}あ{{}}ああ{{001}}ほげほげ";
		replaceString(str, map);
		// testあ{{}}ああ1番ですほげほげ
		return;
	}

	public static void replaceString(String str, Map<String, String> map) {
		return;
	}

}
