package curriculum.h;

/*
 * [概要] 継承
 * [詳細] 社員の情報を使用し日給を表示する
 */
public class PartTimeEmployee extends Employee {
	// 時給1000円の指定
	private static final int HOURLY_RATE = 1000;

	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		// 割増なしの単純計算
		return hoursWorked * HOURLY_RATE;
	}
}