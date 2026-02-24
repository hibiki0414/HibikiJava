package curriculum.b;
import java.util.Scanner;

/*
* [概要] Java基礎問題2の処理
* [詳細] 各型の変数の宣言、代入、および演算処理をする。
*/
public class Question2 {
	
	public static void main(String[] args) {
		// Scannerのインスタンスを作成
		Scanner scanner = new Scanner(System.in);
		/*
	     * [概要] Q1処理
	     * [詳細] 合格ラインを判定する。 
	     */
		// 変数scoreに75を代入する
		int score = 75;
		
		// scoreが60以上なら"合格です！"と表示
		if (score >= 60) {System.out.println("合格です！");
		}
		// 問題ごとに改行を挟む
		System.out.println();
		
		/*
	     * [概要] Q2処理
	     * [詳細] 特定の年齢を識別する。
	     */
		// 変数ageに25を代入する
		int age = 25;
		
		// ageが20以上30以下なら"適正年齢です"と表示
		if (age >= 20 && age <= 30) {System.out.println("適正年齢です");
		}
		
		// それ以外の場合は"対象外です"と表示
		else {System.out.println("対象外です");
		}
		// 問題ごとに改行を挟む
				System.out.println();
		
		/*
		 * [概要] Q3処理
		 * [詳細] 年齢によって表示を変更する。
		 */	
		// 変数age2に18を代入
		int age2 = 18;
		
		// age2が20以上なら"成人です"と表示
		if (age2 >= 20) {System.out.println("成人です");
		}
		
		// age2が13以上19以下なら"ティーンエイジャーです"と表示
		else if (age2 >= 13) {System.out.println("ティーンエイジャーです");
		}
		
		//age2が12以下なら"子供です"と表示
		else {System.out.println("子供です");
		}
		// 問題ごとに改行を挟む
		System.out.println();
		
		/*
		 * [概要] Q4処理
		 * [詳細] xyzの最大値を判定する。 
		 */	
		// 変数xに30、yに15、zに50を代入
		int x = 30;
		int y = 15;
		int z = 50;

		// 変数maxにxを代入しyと比較
		int max = x;
		if (y > max) {
		    max = y;
		}
		
		// 変数maxとzを比較
		if (z > max) {
		    max = z;
		}
		
		//一番大きい数値を判定して表示
		System.out.println("一番大きい数値は" + max + "です");
		// 問題ごとに改行を挟む
		System.out.println();
		
		/*
		 * [概要] Q5処理
		 * [詳細] 入力された数値が正の数か負の数かを判定する。
		 */	
		// 変数numにコンソール入力で数値を代入
		System.out.print("数値を入力してください：");
		int num = scanner.nextInt();
		
		// 0よりも大きければ"正の数です"と表示
		if (num > 0) {
		    System.out.println("正の数です");
		}
		
		// 0であれば"0です"と表示
		else if (num == 0) {
		    System.out.println("0です");
		}
		
		// それ以外なら"負の数です"と表示
		else {
		    System.out.println("負の数です");
		}
		// 問題ごとに改行を挟む
		System.out.println();
		
		/*
		 * [概要] Q6処理
		 * [詳細] 入力された数値が偶数か奇数かを判定する。
		 */	
		// 変数valueにコンソール入力で数値を代入
		System.out.print("数値を入力してください：");
        int value = scanner.nextInt();
        
        // 2で割った時の余りが0であれば"偶数です"と表示
        if (value % 2 == 0) {
            System.out.println("偶数です");
        }
        
        // それ以外なら"奇数です"と表示
        else {
            System.out.println("奇数です");
        }
        // 問題ごとに改行を挟む
        System.out.println();
        
        /*
         * [概要] Q7処理
         * [詳細] 入力された数値に応じて優・良・可・不可を表示する。
         */
        // 変数scoreInputにコンソール入力で数値を代入
        System.out.print("0から100の数値を入力してください：");
        int scoreInput = scanner.nextInt();
        
        // 90以上であれば"優"と表示
        if (scoreInput >= 90) {
            System.out.println("優");
        }
        
        // 上に当てはまらず70以上であれば"良"と表示
        else if (scoreInput >= 70) {
            System.out.println("良");
        }
        
        // 上に当てはまらず50以上であれば"可"と表示
        else if (scoreInput >= 50) {
            System.out.println("可");
        }
        
        // 50未満なら"不可"と表示
        else {
            System.out.println("不可");
        }
        // 問題ごとに改行を挟む
        System.out.println();
        
        /*
         * [概要] Q8処理
         * [詳細] 入力が無効な場合の判定。
         */
        // 変数inputにコンソール入力で文字を代入
        System.out.print("何か文字を入力してください：");
        // 前の入力の改行を読み飛ばすための処理
        scanner.nextLine(); 
        String input = scanner.nextLine();
        
        // nullまたは空文字であれば"入力が無効です"と表示
        if (input == null || input.isEmpty()) {
            System.out.println("入力が無効です");
        }
        
        // それ以外なら入力された文字を表示
        else {
            System.out.println("入力された文字：" + input);
        }
        // 問題ごとに改行を挟む
        System.out.println();
        
        /*
         * [概要] Q9処理
         * [詳細] switch文を使用し1〜7の数値に対応する曜日を表示する。
         */
        // 変数dayにコンソール入力で数値を代入
        System.out.print("1〜7の数値を入力してください：");
        int day = scanner.nextInt(); 
        
        // dayの値に応じて曜日を表示
        switch (day) {
            case 1:
                System.out.println("月曜日");
                break;
            case 2:
                System.out.println("火曜日");
                break;
            case 3:
                System.out.println("水曜日");
                break;
            case 4:
                System.out.println("木曜日");
                break;
            case 5:
                System.out.println("金曜日");
                break;
            case 6:
                System.out.println("土曜日");
                break;
            case 7:
                System.out.println("日曜日");
                break;
                
            // それ以外なら"無効な入力です"と表示
            default: 
                System.out.println("無効な入力です");
                break;
        }
        // 問題ごとに改行を挟む
        System.out.println();
        
        /*
         * [概要] Q10処理
         * [詳細] 複数の数値をまとめて月の季節を判定する。
         */
        // 変数monthにコンソール入力で数値を代入
        System.out.print("1〜12の月を入力してください：");
        int month = scanner.nextInt();
        
        // dayの値に応じて季節を表示
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬");
                break;
                
            // それ以外なら"無効な月です"と表示
            default:
                System.out.println("無効な月です");
                break;
        }
        // scanner.close();
	}
}