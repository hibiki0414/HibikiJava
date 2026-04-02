package curriculum.h;

/*
 * [概要] 継承
 * [詳細] 社員の情報を使用し日給を表示する
 */
public class Main {
	public static void main(String[] args) {
		
		// オブジェクトを生成
		FullTimeEmployee ft = new FullTimeEmployee("F001", "正社員A");
		PartTimeEmployee pt = new PartTimeEmployee("P001", "パートA");

		// 9時間の指定
		int hours = 9;

		// 給与を出力
		System.out.println("正社員の給与: " + ft.calculateDailyWage(hours) + " 円");
		System.out.println("パート社員の給与: " + pt.calculateDailyWage(hours) + " 円");
	}
}