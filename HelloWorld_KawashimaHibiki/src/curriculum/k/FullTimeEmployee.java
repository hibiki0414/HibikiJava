package curriculum.k;

/* [概要] オブジェクト指向の設計原則
 * [詳細] 正社員（時給1200円）の給与形態を保存する
 */
class FullTimeEmployee implements Payable {
    private String name;
    private int hours;

    public FullTimeEmployee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public int calculateSalary() { return hours * 1200; }

    @Override
    public String getName() { return name; }
}