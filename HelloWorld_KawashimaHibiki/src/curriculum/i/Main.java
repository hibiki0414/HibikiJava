package curriculum.i;

import java.util.ArrayList;
import java.util.List;

/*
 * [概要] ポリモーフィズムの実装
 * [詳細] Employee型（親）のリストで異なる形態の社員を管理し、
 * 同じメソッド呼び出しでそれぞれの給与計算結果を出力する。
 */
public class Main {
	public static void main(String[] args) {

		/*
		 * [概要] 社員リストの作成と追加
		 * [詳細] 共通の Employee 型でリストを宣言し、
		 * 異なるサブクラスのインスタンスを複数追加する。
		 */
		List<Employee> employeeList = new ArrayList<>();

		// １：社員リストに正社員と契約社員を追加
		employeeList.add(new FullTimeEmployee("F001", "正社員A"));
		employeeList.add(new ContractEmployee("C001", "契約社員B"));
		employeeList.add(new FullTimeEmployee("F002", "正社員C"));

		int hoursWorked = 9; // 全員9時間勤務とする

		/*
		 * [概要] 給料の出力処理
		 * [詳細] for-eachループを使い、Employee型としてメソッドを呼び出す。
		 */
		// ２：for-each ループで給料を出力
		// ３：サブクラスを明示せず、共通の Employee 型で扱う
		for (Employee emp : employeeList) {
			int wage = emp.calculateDailyWage(hoursWorked);

			// getID()やgetName()は親で定義されているのでそのまま使える
			// calculateDailyWageは各子クラスで上書き(オーバーライド)されたものが自動で動く
			System.out.println(emp.name + "の給料: " + wage + " 円");
		}
	}
}