package curriculum.j;

/*
 * [概要] インターフェイスと抽象クラス
 * [詳細] Billable型のリストで社員を管理し「計算可能」という共通の能力だけでループ処理をする
 */
public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1250;
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
	}
}