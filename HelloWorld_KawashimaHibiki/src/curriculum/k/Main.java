package curriculum.k;

import java.util.ArrayList;
import java.util.List;

/*
 * [概要] オブジェクト指向の設計原則
 * [詳細] SOLID原則を用いてリファクタリングをする。
 */
public class Main {
	public static void main(String[] args) {
		// 異なる種類の社員をPayableでまとめる
		List<Payable> staff = new ArrayList<>();
		staff.add(new FullTimeEmployee("田中", 160));
		staff.add(new ContractEmployee("佐藤", 140));

		// 報告担当のオブジェクトを用意
		SalaryReporter reporter = new SalaryReporter();

		// ポリモーフィズムの活用
		for (Payable p : staff) {
			reporter.report(p);
		}
	}
}