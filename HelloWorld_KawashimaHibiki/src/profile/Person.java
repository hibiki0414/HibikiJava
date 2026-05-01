package profile;

/* [概要] 自己紹介プログラムを作成
 * [詳細] オブジェクト指向の基本概念を利用して自己紹介を表示する
 */
class Person {
  // インスタンスフィールドを定義
  public String name;
  public int age;
  public double height;
  public double weight;

  // 出力のためのクラスフィールド
  public static int count = 0;

  // コンストラクタを定義し、各フィールドに値をセット
  Person(String name, int age, double height, double weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    
    // インスタンスが作られるたびにカウントを増やす
    Person.count++;
  }

  // BMIを計算して返すメソッド
  public double bmi() {
    return this.weight / (this.height * this.height);
  }

  // 情報を出力するメソッド
  public void print() {
    System.out.println("名前は" + this.name + "です");
    System.out.println("年は" + this.age + "です");
    System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
  }
}