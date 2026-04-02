package curriculum.g;

/*
 * [概要] カプセル化
 * [詳細] インスタンスを生成し、カプセル化されたデータを操作する
 */
public class Main {
	public static void main(String[] args) {
		
		// オブジェクトを生成
		Employee emp = new Employee();

		// setメソッドを使用して値を設定
		emp.setEmployeeId("E002");
		emp.setName("田中花子");

		// getメソッドを使用して値を取得し出力
		System.out.println("社員ID: " + emp.getEmployeeId() + ", 名前: " + emp.getName());
	}
}