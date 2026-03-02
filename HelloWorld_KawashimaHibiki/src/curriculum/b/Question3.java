package curriculum.b;

import java.util.Scanner;

/*
* [概要] Java基礎問題3の処理
* [詳細] for文やwhile文を使用し繰り返しの処理をする。
*/
public class Question3 {

	public static void main(String[] args) {
		// Scannerのインスタンスを作成
		Scanner scanner = new Scanner(System.in);
		/*
		 * [概要] Q1処理
		 * [詳細] for文を使い1から10までの数字を1ずつ表示する
		 */
		// 変数aが1から10になるまで1ずつ増やして出力
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q2処理
		 * [詳細] for文を使い2から20までの偶数を1ずつ表示する
		 */
		// 変数bが2から20になるまで2ずつ増やして出力
		for (int b = 2; b <= 20; b += 2) {
			System.out.println(b);
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q3処理
		 * [詳細] for文を使い10から1まで1ずつ減らして表示する
		 */
		// 変数cが10から1になるまで1ずつ減らして出力
		for (int c = 10; c >= 1; c--) {
			System.out.println(c);
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q4処理
		 * [詳細] for文を使い1から100までの合計を表示する
		 */
		// 合計を保存する変数sumの初期値を設定
		int sum = 0;

		// 1から100まで繰り返し、dの値をsumに足していく
		for (int d = 1; d <= 100; d++) {
			sum += d;
		}

		// 合計を出力
		System.out.println(sum);
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q5処理
		 * [詳細] for文を使い三角形を表示する
		 */
		// 変数eが1から5になるまで行を設定
		for (int e = 1; e <= 5; e++) {

			// 変数fがeと同じ数だけ横に"*"を出力
			for (int f = 1; f <= e; f++) {
				System.out.print("*");
			}

			// 1行出力したら改行する
			System.out.println();
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q6処理
		 * [詳細] while文を使い1から10までの数字を1ずつ表示する
		 */
		// 変数gに初期値を設定
		int g = 1;

		// 変数gが10になるまで1ずつ増やして出力
		while (g <= 10) {
			System.out.println(g);
			g++;
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q7処理
		 * [詳細] while文を使い2から20までの偶数を1ずつ表示する
		 */
		// 変数hに初期値を設定
		int h = 2;

		// 変数hが2から20になるまで2ずつ増やして出力
		while (h <= 20) {
			System.out.println(h);
			h += 2;
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q8処理
		 * [詳細] while文を使い10から1まで1ずつ減らして表示する
		 */
		// 変数iに初期値を設定
		int i = 10;

		// 変数iが10から1になるまで1ずつ減らして出力
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		// 問題ごとに改行を含む
		System.out.println();

		/*
		 * [概要] Q9処理
		 * [詳細] while文を使い1から100までの合計を表示する
		 */
		// カウント用の変数jの初期値を設定
		int j = 1;

		// 合計を保存する変数sum2の初期値を設定
		int sum2 = 0;

		// 1から100まで繰り返し、jの値をsum2に足していく
		while (j <= 100) {
			sum2 += j;
			j++;
		}

		// 合計を出力
		System.out.println(sum2);
		// 問題ごとに改行を含む
		System.out.println();

		/*
		 * [概要] Q10処理
		 * [詳細] Scannerとwhile文を使い0が入力されるまで数値を入力する
		 */

		// 0が入力されるまで処理を繰り返す
		while (true) {
			System.out.print("数値を入力してください（0で終了）：");

			// コンソールから数値を読み込む
			int input = scanner.nextInt();

			// 入力された値が0か判定し0なら「終了しました」と出力
			if (input == 0) {
				System.out.println("終了しました");

				// breakでループを終了させる
				break;
			}
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q11処理
		 * [詳細] for文を使い九九の表を表示する
		 */
		// 変数kが1から9になるまで行を設定
		for (int k = 1; k <= 9; k++) {

			// 変数lが1から9になるまで列を設定
			for (int l = 1; l <= 9; l++) {

				// 行となる被乗数を出力
				if (k < 10)
					System.out.print("0");
				System.out.print(k);

				// 掛け算記号" * "を出力
				System.out.print(" * ");

				// 列となる乗数を出力
				if (l < 10)
					System.out.print("0");
				System.out.print(l);

				// イコール記号" = "を出力
				System.out.print(" = ");

				// 積を出力
				int result = k * l;
				if (result < 10)
					System.out.print("0");

				// 仕切り" ││ "を出力
				System.out.print(result + " |│ ");
			}
			// 1行出力したら改行する
			System.out.println();
		}
		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q12処理
		 * [詳細] 拡張for文switch文条件演算子を使い商品の在庫数を表示する
		 */
		// 入力例の文字列を"、"で分割し配列に格納する
		String inputStr = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
		String[] items = inputStr.split("、");

		// ランダムな数値を生成する設定
		java.util.Random random = new java.util.Random();

		// 先にテレビ台数をランダム(0～11)に決定
		int tvStock = random.nextInt(12);

		// ディスプレイは11からテレビ在庫数を引いた台数にする
		int displayStock = 11 - tvStock;

		// 拡張for文を使用して配列の中身を一つずつ処理 
		for (String item : items) {
			// 各商品のランダム在庫(0～11)
			int stock = random.nextInt(12);

			// switch文を使用して商品ごとの処理を分岐 
			switch (item) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":

				// 通常商品はランダムな在庫を出力
				System.out.println(item + "の残り台数は" + stock + "台です");
				break;

			case "テレビ":
			case "ディスプレイ":
				// 条件演算子を使いitemがテレビならtvStock、そうでなければdisplayStockを出力
				int targetStock = item.equals("テレビ") ? tvStock : displayStock;
				System.out.println(item + "の残り台数は" + targetStock + "台です");
				break;

			default:
				// 指定の商品以外の場合"『""』は指定の商品ではありません"と出力
				System.out.println("『" + item + "』は指定の商品ではありません");
				break;
			}
		}
		// scanner.close();
	}
}