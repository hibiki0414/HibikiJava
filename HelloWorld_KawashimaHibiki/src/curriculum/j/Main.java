package curriculum.j;

import java.util.ArrayList;
import java.util.List;

/*
 * [概要] インターフェイスと抽象クラス
 * [詳細] Billable型のリストで社員を管理し「計算可能」という共通の能力だけでループ処理をする
 */
public class Main {
	public static void main(String[] args) {

		// 社員を請求可能なものとしてリストに入れる
		List<Billable> billableList = new ArrayList<>();

		billableList.add(new FullTimeEmployee("F101", "正社員A"));
		billableList.add(new ContractEmployee("C101", "契約社員B"));

		// 勤務時間を9時間に設定
		int hoursWorked = 9;

		// ループを使いBillable型としてメソッドを呼び出す
		for (Billable target : billableList) {
			int cost = target.costForDay(hoursWorked);

			// 計算結果を出力
			System.out.println("日給: " + cost + " 円");
		}
	}
}