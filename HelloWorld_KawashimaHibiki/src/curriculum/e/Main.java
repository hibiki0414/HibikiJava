package curriculum.e;
/*
 * [概要] 基本概念の実行
 * [詳細] インスタンスを生成し、操作を実行する
 */
public class Main {
	public static void main(String[] args) {
		
		// インスタンスを生成
		Employee emp = new Employee();

		// nameに"山田太郎"を設定
		emp.name = "山田太郎";

		// メソッドを呼び出して出力
		emp.work();
	}
}