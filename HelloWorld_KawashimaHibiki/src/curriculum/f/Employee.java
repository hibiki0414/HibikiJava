package curriculum.f;

/*
 * [概要] クラスとオブジェクト
 * [詳細] 社員IDと名前の情報で社員情報を表示する
 */
public class Employee {
	// フィールドを設定
	public String employeeId; // 社員ID
	public String name; // 名前

	public void showInfo() {
		// 指定された形式に応じた処理を出力する設定
		System.out.println("社員ID: " + employeeId + ", 名前: " + name);
	}
}