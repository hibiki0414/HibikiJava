package curriculum.b;

/*
 * [概要] Java基礎問題5の処理
 * [詳細] メソッドの作成、呼び出し、およびクラス間の連携を処理する。
 */
public class Question5 {

	public static void main(String[] args) {

		/*
		 * [概要] Q1処理
		 * [詳細] helloWorldメソッドを呼び出し、文字列を表示する
		 */
		// helloWorldメソッドの実行
		helloWorld();

		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q2処理
		 * [詳細] doubleValueメソッドを呼び出し、戻り値をもとに結果を表示する
		 */
		int num2 = 10;
		// メソッドを呼び出して引数10の2倍を取得
		int result2 = doubleValue(num2);
		System.out.println(num2 + "を2倍すると" + result2 + "です。");

		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q3処理
		 * [詳細] isEvenメソッドを呼び出し、偶数か奇数かを判定して表示する
		 */
		int n1 = 7;
		int n2 = 10;
		// 10の判定
		System.out.println(n2 + "は" + (isEven(n2) ? "偶数" : "奇数") + "です。");
		// 7の判定
		System.out.println(n1 + "は" + (isEven(n1) ? "偶数" : "奇数") + "です。");

		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q4処理
		 * [詳細] 外部クラス Greeting のインスタンスを生成しメソッドを呼び出す
		 */
		
		// Greetingクラスをインスタンス化
		Greeting greeting = new Greeting();
		// sayHelloメソッドを実行
		greeting.sayHello();

		// 問題ごとに改行を挟む
		System.out.println();

		/*
		 * [概要] Q5処理
		 * [詳細] Animalクラスのインスタンスを生成し、setterで値を設定、getterで出力する
		 */
		// Animalクラスをインスタンス化
		Animal lion = new Animal();

		// setterを使用してフィールドに値を設定
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);

		// getterを使用して値を取得し、指定の形式で出力
		System.out.println("動物名:" + lion.getName());
		System.out.println("体長:" + lion.getLength() + "m");
		System.out.println("速度:" + lion.getSpeed() + "km/h");

	}

	/**
	 * Q1: Hello, World!を表示するメソッド
	 */
	public static void helloWorld() {
		System.out.println("Hello, World!");
	}

	/**
	 * Q2: 引数の2倍の値を返すメソッド
	 * @param num 整数
	 * @return 引数の2倍の値
	 */
	public static int doubleValue(int num) {
		return num * 2;
	}

	/**
	 * Q3: 偶数かどうかを判定するメソッド
	 * @param num 整数
	 * @return 偶数ならtrue、奇数ならfalse
	 */
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}