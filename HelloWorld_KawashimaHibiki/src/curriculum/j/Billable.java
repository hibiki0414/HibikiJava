package curriculum.j;

/*
 * [概要] インターフェイスと抽象クラス
 * [詳細] Billable型のリストで社員を管理し「計算可能」という共通の能力だけでループ処理をする
 */
public interface Billable {
	int costForDay(int hoursWorked);
}