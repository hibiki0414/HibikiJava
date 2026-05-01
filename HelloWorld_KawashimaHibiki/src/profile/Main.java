package profile;

/* [概要] 自己紹介プログラムを作成
 * [詳細] オブジェクト指向の基本概念を利用して自己紹介を表示する
 */
class Main {
  public static void main(String[] args) {
    Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);
   
    // printメソッドを呼び出して情報を出力
    person1.print();

    // 合計人数の出力
    System.out.println("合計" + Person.count + "人です");
  }
}