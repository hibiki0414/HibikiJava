package curriculum.h;

/*
 * [概要] 継承
 * [詳細] 社員の情報を使用し日給を表示する
 */
public abstract class Employee {
	private String employeeId;
	private String name;

	// コンストラクタを生成
	public Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	abstract int calculateDailyWage(int hoursWorked);
}