package curriculum.h;

/*
 * [概要] 継承
 * [詳細] 社員の情報を使用し日給を表示する
 */
public class FullTimeEmployee extends Employee {
	// 時給1200円の指定
	private static final int HOURLY_RATE = 1200;

	public FullTimeEmployee(String id, String name) {
		super(id, name); // コンストラクタを呼び出す
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			return hoursWorked * HOURLY_RATE;
		} else {
			// 8時間を超過分は25%割増
			int regularWage = 8 * HOURLY_RATE;
			int overtimeHours = hoursWorked - 8;
			int overtimeWage = (int) (overtimeHours * HOURLY_RATE * 1.25);
			return regularWage + overtimeWage;
		}
	}
}