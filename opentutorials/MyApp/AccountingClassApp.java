class Accounting{
    public static double ValueOfSupply;
    public static double vatRate;
    public static double expenseRate;
    public static double[] Dividend;

    public static double getDividend(double DividentRate){
        return getIncome() * DividentRate;
    }

    public static double getIncome() {
        return ValueOfSupply - getExpense();
    }

    public static double getExpense() {
        return ValueOfSupply * expenseRate;
    }

    public static double getTotal() {
        return ValueOfSupply + getVat();
    }

    public static double getVat() {
        return ValueOfSupply * vatRate;
    }

    public static void print() {
        System.out.println("Value of supply : " + ValueOfSupply);
        System.out.println("VAT : " + getVat());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        for(int i = 0; i < Dividend.length; i++){
            System.out.println("Dividend "+ (i+1) + " : " + getDividend(Dividend[i]));
        }
    }
}

public class AccountingClassApp {
    public static void main(String[] args) {

        Accounting.ValueOfSupply = 10000.0;
        Accounting.vatRate = 0.1;
        Accounting.expenseRate = 0.3;
        Accounting.Dividend = new double[] {0.5, 0.3, 0.2};
        Accounting.print();
    }
}
