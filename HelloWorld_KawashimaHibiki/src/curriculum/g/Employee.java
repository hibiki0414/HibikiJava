package curriculum.g;

/*
 * [概要] カプセル化
 * [詳細] インスタンスを生成し、カプセル化されたデータを操作する
 */
public class Employee {
	// プライベートフィールドを設定
	private String employeeId;
	private String name;

	// employeeId のセッター
	public void setEmployeeId(String id) {
		this.employeeId = id;
	}

	// employeeId のゲッター
	public String getEmployeeId() {
		return employeeId;
	}

	// name のセッター
	public void setName(String name) {
		this.name = name;
	}

	// name のゲッター
	public String getName() {
		return name;
	}
}