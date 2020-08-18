class InstanceAccounting{
    public double ValueOfSupply;
    public double vatRate;
    public double expenseRate;
    public double[] Dividend;

    public double getDividend(double DividentRate){
        return getIncome() * DividentRate;
    }

    public double getIncome() {
        return ValueOfSupply - getExpense();
    }

    public double getExpense() {
        return ValueOfSupply * expenseRate;
    }

    public double getTotal() {
        return ValueOfSupply + getVat();
    }

    public double getVat() {
        return ValueOfSupply * vatRate;
    }

    public void print() {
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

public class AccountingInstanceApp {


    public static void main(String[] args) {

        InstanceAccounting A1 = new InstanceAccounting();
        InstanceAccounting A2 = new InstanceAccounting();

        System.out.println("Case 1");
        A1.ValueOfSupply = 10000.0;
        A1.vatRate = 0.1;
        A1.expenseRate = 0.3;
        A1.Dividend = new double[] {0.5, 0.3, 0.2};
        A1.print();

        System.out.println("\nCase 2");
        A2.ValueOfSupply = 85000.0;
        A2.vatRate = 0.1;
        A2.expenseRate = 0.3;
        A2.Dividend = new double[] {0.5, 0.3, 0.2};
        A2.print();
    }
}
