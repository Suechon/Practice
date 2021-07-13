package main.question.practice;

import java.util.Arrays;
import java.util.List;

/**
 * 引数に二つのリストが与えられるので、リストAからリストBに含まれる内容を除外した新しいリストを生成して返却してください。
 * */
public class Practice006 {

	// 実行例
	public static void sample() {
		List<String> listA, listB, result;

		listA = Arrays.asList("a", "b", "c");
		listB = Arrays.asList("b");
		result = practice006(listA, listB);
		// result = ["a", "c"]

		listA = Arrays.asList("a", "b", "c");
		listB = Arrays.asList("a", "b", "c");
		result = practice006(listA, listB);
		// result = []

		listA = Arrays.asList("a", "c", "b", "c", "a");
		listB = Arrays.asList("c");
		result = practice006(listA, listB);
		// result = ["a", "c", "a"]
		return;
	}

	public static List<String> practice006(List<String> listA, List<String> listB) {
		return null;
	}
}
