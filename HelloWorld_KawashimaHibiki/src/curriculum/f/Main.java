package curriculum.f;

/*
 * [概要] クラスとオブジェクト
 * [詳細] 社員IDと名前の情報で社員情報を表示する
 */
public class Main {
	public static void main(String[] args) {
		
		// インスタンスを生成
		Employee emp = new Employee();

		// employeeIdに"E001"、nameに"佐藤太郎"を設定
		emp.employeeId = "E001";
		emp.name = "佐藤太郎";

		// メソッドを呼び出して出力
		emp.showInfo();
	}
}