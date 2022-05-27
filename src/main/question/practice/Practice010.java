package main.question.practice;

/*
* 問1.以下の内容で3種類のRetryableLogicの実装クラスを作成する。
*  共通事項-1.Integer型を引数と戻り値に取り、execute1timeの開始時に引数を標準出力する。
*  共通事項-2.1～100のランダムな整数を生成し、標準出力する。
*  共通事項-3.引数は1～10000以外の数字は考慮不要。
*  クラス-1.引数と共通事項-2の数字の和を戻り値とする。ただし、50%の確率でRetryableExceptionをスローする。(Stringを引数にとるコンストラクタを用いて例外を生成し、共通事項-2の数字を(Stringに変換して、)引数にすること)
*  クラス-2.引数と共通事項-2の数字の差(引数-共通事項-2の値)を戻り値とする。ただし、70%の確率でRetryableExceptionをスローする。(Stringを引数にとるコンストラクタを用いて例外を生成し、共通事項-2の数字を(Stringに変換して、)引数にすること)
*  クラス-3.引数と共通事項-2の数字の積を戻り値とする。ただし、90%の確率でRetryableExceptionをスローする。(Stringを引数にとるコンストラクタを用いて例外を生成し、共通事項-2の数字を(Stringに変換して、)引数にすること)
* 問2.RetryUtil#_try(RetryableLogic, P, int)を実装する。
* 問3.mainメソッドを作成し、問2で作成したメソッドで問1のクラスを動かしてみる。
* 問4.問3で作成したメソッドを動かすJUnitテストケースと以下の内容のモックRetryableLogicクラスを作成する。(テストの際に作成したモッククラスを利用する。)
*   モッククラス-1.Char型を引数にとり、インスタンス生成以降3回目まではRetryableExceptionをスローし、4回目以降は引数の文字を3つ結合したStringを返却する。
*   モッククラス-2.String型を引数にとり、インスタンス生成以降2回目まではRetryableExceptionをスローし、3回目以降は(RetryableExceptionでない)Exceptionをスローする。
* 問5.以下のリファクタリングを行う。
*    5-1.問1で作ったクラスから共通部分を抜き出した抽象クラスを作る。
*    5-2.問1で作ったクラスを5-1で作った抽象クラスを継承する形に修正する。
*/

/**
 * 失敗するかもしれない処理にやり直し機能を持たせる
 *
 * @author 
 *
 */
public class RetryUtil {

	/**
	 * 第1引数の処理を最大第3引数回実施する。<br>
   * 例外が発生しなかった場合、その時の戻り値をこのメソッドの戻り値として返却する。<br>
	 * 第3引数回実施してもRetryableExceptionが発生した場合は最後に発生した例外を再スローする。<br>
	 * RetryableExceptionでないものが第1引数からスローされた場合はそれを再スローする。
	 *
	 * @param logic
	 *            このロジックを
	 * @param parameter
	 *            この引数で
	 * @param count
	 *            この回数まで例外が発生しなくなるまで実施して
	 * @return 戻り値を返す
	 *
	 * @throws IllegalArgumentException
	 *             第1引数が0以下
	 * @throws Exception
	 *             第1引数でRetryableExceptionでない例外が発生したか、第3引数回目のRetryableException
	 */
	public static <R, P> R _try(RetryableLogic<P, R> logic, P parameter, int count) throws Exception {
		// TODO これを実装
		return null;
	}

	/**
	 * 失敗するかもしれないけれど、何回かやれば成功するかもしれない処理
	 *
	 * @author 郡司陽介
	 *
	 * @param <P>
	 *            引数の型
	 * @param <R>
	 *            戻り値の型
	 */
	@FunctionalInterface
	public interface RetryableLogic<P, R> {

		/**
		 * とりあえず1回やってみる
		 *
		 * @param parameter
		 *            引数
		 * @return 結果
		 * @throws RetryableException
		 *             やり直したら成功するかもしれない例外
		 * @throws Exception
		 *             それ以外の例外
		 */
		public R execute1time(P parameter) throws RetryableException, Exception;

	}

	/**
	 * もう一回やれば成功するかもしれないけど今回はだめだった
	 *
	 * @author 郡司陽介
	 *
	 */
	public static class RetryableException extends Exception {

		/**
		 * @see Exception#Exception()
		 */
		public RetryableException() {
			super();
		}

		/**
		 * @see Exception#Exception(String)
		 */
		public RetryableException(String message) {
			super(message);
		}

		/**
		 * @see Exception#Exception(String,Throwable)
		 */
		public RetryableException(String message, Throwable cause) {
			super(message, cause);
		}

		/**
		 * @see Exception#Exception(Throwable)
		 */
		public RetryableException(Throwable cause) {
			super(cause);
		}

	}
}

