package lib;

public class TaxData {
    public int monthlySalary;
    public int otherMonthlyIncome;
    public int monthWorkingInYear;
    public int annualDeductible;
    public boolean isSingle;
    public int numberOfChildren;

    public TaxData(int monthlySalary, int otherMonthlyIncome, int monthWorkingInYear,
                   int annualDeductible, boolean isSingle, int numberOfChildren) {
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.monthWorkingInYear = monthWorkingInYear;
        this.annualDeductible = annualDeductible;
        this.isSingle = isSingle;
        this.numberOfChildren = numberOfChildren;
    }
}
