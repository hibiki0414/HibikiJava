package curriculum.b;

import java.util.Scanner;

/*
* [概要] Java基礎問題4の処理
* [詳細] 1次元から3次元までの配列操作を行う。
*/
public class Question4 {

	public static void main(String[] args) {
		// Scannerのインスタンスを作成
		Scanner scanner = new Scanner(System.in);
		/*
		 * [概要] Q1処理
		 * [詳細] 配列を使い要素を順番に表示する
		 */
		// int型の配列を宣言し{1,2,3,4,5}を格納
		int[] q1Array = { 1, 2, 3, 4, 5 };

		// 配列の全要素を正順に並べる
		for (int i = 0; i < q1Array.length; i++) {

			// 並び変えた要素を出力
			System.out.println(q1Array[i]);
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q2処理
		 * [詳細] 配列を使い要素を順番に表示する
		 */
		// int型の配列を宣言し{10,20,30,40,50}を格納
		int[] q2Array = { 10, 20, 30, 40, 50 };

		// 配列の要素を逆順に並べる
		for (int i = q2Array.length - 1; i >= 0; i--) {

			// 並び変えた要素を出力
			System.out.println(q2Array[i]);
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q3処理
		 * [詳細] 配列を使い要素の合計値を表示する
		 */
		// int型の配列を宣言し{3,5,7,9,11}を格納
		int[] q3Array = { 3, 5, 7, 9, 11 };

		// 合計値を保持する変数を宣言
		int sumQ3 = 0;

		// 配列の要素を加算
		for (int num : q3Array) {

			// 合計値に現在の要素を加える
			sumQ3 += num;
		}

		// 合計値を出力
		System.out.println("合計値: " + sumQ3);
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q4処理
		 * [詳細] 配列を使い要素の最大値と最小値を表示する
		 */
		// int型の配列を宣言し{12,7,9,21,5,18}を格納
		int[] q4Array = { 12, 7, 9, 21, 5, 18 };

		// 最大値の初期値を設定
		int maxQ4 = q4Array[0];

		// 最小値の初期値を設定
		int minQ4 = q4Array[0];

		// 最大値と最小値を求める
		for (int i = 1; i < q4Array.length; i++) {

			// 現在の値が保持している最大値より大きいか判定
			if (q4Array[i] > maxQ4) {

				// 最大値を設定
				maxQ4 = q4Array[i];
			}

			// 現在の値が保持している最小値より小さいか判定
			if (q4Array[i] < minQ4) {

				// 最小値を設定
				minQ4 = q4Array[i];
			}
		}

		// 最大値と最小値を出力
		System.out.println("最大値: " + maxQ4 + " 最小値: " + minQ4);
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q5処理
		 * [詳細] 配列を使い要素を2倍にし表示する
		 */
		// int型の配列を宣言し{1,2,3,4,5}を格納
		int[] q5Array = { 1, 2, 3, 4, 5 };

		// 配列の全要素を2倍にする
		for (int i = 0; i < q5Array.length; i++) {
			q5Array[i] = q5Array[i] * 2;
		}

		// 拡張for文を使用して結果を出力
		for (int num : q5Array) {
			System.out.println(num);
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q6処理
		 * [詳細] 入力した数値が配列内に存在するかを判定し表示する
		 */
		// int型の配列を宣言し{4,7,10,15,20}を用意
		int[] q6Array = { 4, 7, 10, 15, 20 };

		// 入力を促すメッセージを出力し値を取得
		System.out.print("数値を入力してください: ");
		int inputNum = scanner.nextInt();

		// 含まれているかどうかの判定を初期化
		boolean exists = false;

		// 配列内を探索し入力値と配列の要素が一致するか判定
		for (int num : q6Array) {
			if (num == inputNum) {

				// 一致した場合は正判定
				exists = true;
				break;
			}
		}

		// 結果を表示
		if (exists) {

			// 含まれている場合の結果出力
			System.out.println(inputNum + "は配列に含まれています");
		} else {

			// 含まれていない場合の結果出力
			System.out.println(inputNum + "は配列に含まれていません");
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q7処理
		 * [詳細] 2次元配列を使い要素を順番に表示する
		 */
		// int型の2次元配列を宣言し要素を格納
		int[][] q7Array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// 外側のループ（行）
		for (int i = 0; i < q7Array.length; i++) {

			// 内側のループ（列）
			for (int j = 0; j < q7Array[i].length; j++) {

				// 結果を出力
				System.out.println(q7Array[i][j]);
			}
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q8処理
		 * [詳細] 2次元配列を使い要素の合計値を表示する
		 */
		// int型の2次元配列を宣言し要素を格納
		int[][] q8Array = { { 10, 20, 30, 40, 50, 60 }, { 70, 80, 90 } };

		// 合計値を保持する変数を宣言
		int sumQ8 = 0;

		// 外側のループ（行）
		for (int[] row : q8Array) {

			// 内側のループ（列）
			for (int num : row) {

				// 要素を合計に加算
				sumQ8 += num;
			}
		}

		// 合計値を出力
		System.out.println("合計値: " + sumQ8);
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q9処理
		 * [詳細] 多次元配列を宣言し最大値と最小値を表示する
		 */
		// int型の2次元配列を宣言し要素を格納
		int[][] q9Array = { { 12, 15, 8, 6, 19, 25 }, { 30, 2, 10 } };

		// 最大値の初期値を設定
		int maxQ9 = q9Array[0][0];

		// 最小値の初期値を設定
		int minQ9 = q9Array[0][0];

		// 2次元配列の全要素を確認
		for (int[] row : q9Array) {

			// 列のループ
			for (int num : row) {

				// 最大値を判定し更新
				if (num > maxQ9) {
					maxQ9 = num;
				}

				// 最小値の判定し更新
				if (num < minQ9) {
					minQ9 = num;
				}
			}
		}

		// 最大値と最小値を出力
		System.out.println("最大値: " + maxQ9 + " 最小値: " + minQ9);
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q10処理
		 * [詳細] 3次元配列を使い全要素を表示する
		 */
		// int型の3次元配列を宣言し要素を格納
		int[][][] q10Array = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		// 1次元目のループ
		for (int[][] area : q10Array) {

			// 2次元目のループ
			for (int[] row : area) {

				// 3次元目のループ
				for (int num : row) {

					// 全要素を出力
					System.out.println(num);
				}
			}
		}
		// scanner.close();
	}
}