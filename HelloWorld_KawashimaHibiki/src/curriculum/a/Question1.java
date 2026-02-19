package curriculum.a;

/*
* [概要] Java基礎問題1の処理
* [詳細] 各型の変数の宣言、代入、および演算処理をする。
*/
public class Question1 {
	
	/*
     * [概要] Q1,Q2処理
     * [詳細] 課題に沿って各変数を操作する。 
     */
	public static void main(String[] args) {
		// 変数byteNumの初期値を設定
		byte byteNum = 0;
		// 変数byteNumに10を代入
		byteNum = 10;
		
		// 変数shortNumの初期値を設定
		short shortNum = 0;
		// 変数shortNumに100を代入
		shortNum = 100;
		
		// 変数intNumの初期値を設定
		int intNum = 0;
		// 変数intNumに1000を代入
		intNum = 1000;
		
		// 変数longNumの初期値を設定
		long longNum = 0;
		// 変数longNumに10000を代入
		longNum = 10000;
		
		// 変数floatNumの初期値を設定
		float floatNum =0.0f;
		// 変数floatNumに9.5fを代入
		floatNum = 9.5f;
		
		// 変数doubleNumの初期値を設定
		double doubleNum = 0.0;
		// 変数doubleNumに10.5を代入
		doubleNum = 10.5;
		
		// 変数letterの初期値を設定
		char letter = ' ';
		// 変数letterに"a"を代入
		letter = 'a';
		
		// 変数lettersの初期値を設定
		String letters = " ";
		// 変数lettersに"ハロー"を代入
		letters = "ハロー";
		
		// 変数isBooleanの初期値を設定
		boolean isBoolean = false;
		// 変数isBooleanにtrueを代入
		isBoolean = true;
		
		/*
	     * [概要] Q3処理
	     * [詳細] 課題に沿ってコンソールに出力する。 
	     */
		// 11110を出力
		System.out.println(byteNum + shortNum + intNum + longNum);
		
		// 問題ごとに改行を挟む
		System.out.println();
		
		// 20を出力
		System.out.println((int)(floatNum + doubleNum));
		// 問題ごとに改行を挟む
		System.out.println();
		
		// aを出力
		System.out.println(letter);
		// 問題ごとに改行を挟む
		System.out.println();
		
		// ハローを出力
		System.out.println(letters);
		// 問題ごとに改行を挟む
		System.out.println();
		
		// trueを出力
		System.out.println(isBoolean);
		// 問題ごとに改行を挟む
		System.out.println();
		
		// 全ての数値を足して出力
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		// 問題ごとに改行を挟む
		System.out.println();
		
		// 小数点以外の数字を全てかけて出力
		System.out.println(byteNum * shortNum * intNum * longNum);
		// 問題ごとに改行を挟む
		System.out.println();
		
		// 10.5割る100をして出力
		System.out.println(doubleNum / shortNum);
		// 問題ごとに改行を挟む
		System.out.println();
		
		// 10引く100をして出力
		System.out.println(byteNum - shortNum);
		// 問題ごとに改行を挟む
		System.out.println();
		
		// 変数nameの初期値を設定
		String name = "";
		
		/*
	     * [概要] Q4処理
	     * [詳細] 課題に沿って変数を操作しコンソールに出力する。 
	     */
		// 変数nameに"山田太郎"を代入
		name = "山田太郎";
		
		// こんにちは、山田太郎さん！を出力
		System.out.println("こんにちは、" + name + "さん！");
		// 問題ごとに改行を挟む
		System.out.println();
		
		/*
	     * [概要] Q5処理
	     * [詳細] 課題に沿って変数を操作しコンソールに出力する。 
	     */
		// 変数ageの初期値を設定
		int age = 0;
		
		// 変数ageに25を代入
		age = 25;
		
		// 年齢25歳を出力
		System.out.println("年齢" + age + "歳");
		// 問題ごとに改行を挟む
		System.out.println();
		
		
		/*
	     * [概要] Q6処理
	     * [詳細] 課題に沿って変数を操作しコンソールに出力する。  
	     */
		// 変数num1の初期値を設定
		int num1 = 10;
		
		// 変数num2の初期値を設定
		int num2 = 5;
		
		// num1とnum2を足した結果をsumに代入
		int sum = num1 + num2;
		
		// num1とnum2を足した結果を出力
		System.out.println(sum);
		// 問題ごとに改行を挟む
		System.out.println();
		
		/*
	     * [概要] Q7処理
	     * [詳細] 課題に沿って変数を操作しコンソールに出力する。 
	     */
		// 変数scoreの初期値を設定
		int score = 80;
		
		// scoreに20を加えて更新
		score = score + 20;
		
		// 最終スコア: 100を出力
		System.out.println("最終スコア： " + score);
		// 問題ごとに改行を挟む
		System.out.println();
		
		/*
	     * [概要] Q8処理
	     * [詳細] 課題に沿って変数を操作しコンソールに出力する。 
	     */
		// 変数priceの初期値を設定
		double price = 0.0;
		
		// 変数priceに99.99を代入
		price = 99.99;
		
		// priceをintにし整数価格: 99を出力
		System.out.println("整数価格： " + (int) price);
		// 問題ごとに改行を挟む
		System.out.println();
		
		/*
	     * [概要] Q9処理
	     * [詳細] 課題に沿って変数を操作しコンソールに出力する。 
	     */
		// 変数numStringに"123"を代入
		String numString = "123";
		
		// numStringをintに変換
		int numInt = Integer.parseInt(numString);
		
		// numIntに10を足した結果を出力
		System.out.println(numInt + 10);
		// 問題ごとに改行を挟む
		System.out.println();
		
		/*
	     * [概要] Q10処理
	     * [詳細] 課題に沿って変数を操作しコンソールに出力する。 
	     */
		// 変数numに50を代入
		int num = 50;
		
		// numをStringに変換
		String point = String.valueOf(num);
		
		//得点: 50点を出力
		System.out.println("得点： " + point + "点");
		// 問題ごとに改行を挟む
		System.out.println();
		
		/*
	     * [概要] Q11処理
	     * [詳細] 課題に沿って変数を操作しコンソールに出力する。 
	     */
		// int型の変数aに10を代入
		int a = 10;
		
		// int型の変数bに20を代入
		int b = 20;
		
		// aがbより小さいかどうかをboolean変数resultに代入
		boolean result = a < b;
		
		// resultの値を出力
		System.out.println(result);
		// 問題ごとに改行を挟む
		System.out.println();
		
		/*
	     * [概要] Q12処理
	     * [詳細] 課題に沿って変数を操作しコンソールに出力する。 
	     */
		// int型の変数xに15を代入
		int x = 15;
		
		// 10以上なら"OK"、そうでなければ"NG"を設定
		String message = (x >= 10) ? "OK" : "NG";
		
		// messageの値を出力
		System.out.println(message);
		// 問題ごとに改行を挟む
		System.out.println();

		/*
	     * [概要] Q13処理
	     * [詳細] 課題に沿って変数を操作しコンソールに出力する。 
	     */
		// Q13. String型の変数textに指定の文章を代入
		String text = "私はJavaが好きです。Javaは楽しい！";
		
		// 「Java」を「Python」に置き換えて表示
		System.out.println(text.replace("Java", "Python"));
	}
}
