package curriculum.k;

/*
 * [概要] オブジェクト指向の設計原則
 * [詳細] 給与計算と名前の取得を定義する
 */
public interface Payable {
    int calculateSalary();
    String getName();
}