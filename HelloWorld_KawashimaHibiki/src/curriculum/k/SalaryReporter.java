package curriculum.k;

/*
 * [概要] オブジェクト指向の設計原則
 * [詳細] 給与レポートを出力する
 */
public class SalaryReporter {
    public void report(Payable p) {
        // pの種類を問わず、同じ命令で出力する
        System.out.println(p.getName() + " の給料は " + p.calculateSalary() + " 円");
    }
}