package curriculum.j;

/*
 * [概要] インターフェイスと抽象クラス
 * [詳細] Billable型のリストで社員を管理し「計算可能」という共通の能力だけでループ処理をする
 */
public abstract class Employee implements Billable {
	protected String id;
	protected String name;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
}