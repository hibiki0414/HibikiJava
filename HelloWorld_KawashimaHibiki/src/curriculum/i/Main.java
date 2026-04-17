package curriculum.i;

import java.util.ArrayList;
import java.util.List;

/*
 * [概要] ポリモーフィズム
 * [詳細] Employee型のリストで異なる形態の社員を管理し給与計算結果を表示する
 */
public class Main {
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		// 社員リストに正社員と契約社員を追加
		employeeList.add(new FullTimeEmployee("F001", "正社員A"));
		employeeList.add(new ContractEmployee("C001", "契約社員B"));
		employeeList.add(new FullTimeEmployee("F002", "正社員C"));

		// 勤務時間を9時間に設定
		int hoursWorked = 9;

		// ループを使いEmployee型としてメソッドを呼び出す
		for (Employee emp : employeeList) {
			int wage = emp.calculateDailyWage(hoursWorked);

			// 計算結果を出力
			System.out.println(emp.name + "の給料: " + wage + " 円");
		}
	}
}