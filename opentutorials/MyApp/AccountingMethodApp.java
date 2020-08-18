public class AccountingMethodApp {
    public static double ValueOfSupply;
    private static double vatRate;
    private static double expenseRate;
    private static  double[] Dividend;

    public static void main(String[] args) {

        ValueOfSupply = 10000.0;
        vatRate = 0.1;
        expenseRate = 0.3;
        Dividend = new double[] {0.5, 0.3, 0.2};

        double Vat = getVat();
        double Total = getTotal();
        double Expense = getExpense();
        double Income = getIncome();

        System.out.println("Value of supply : " + ValueOfSupply);
        System.out.println("VAT : " + Vat);
        System.out.println("Total : " + Total);
        System.out.println("Expense : " + Expense);
        System.out.println("Income : " + Income);
        for(int i = 0; i < Dividend.length; i++){
            System.out.println("Dividend "+ (i+1) + " : " + getDividend(Dividend[i]));
        }
    }
    private static double getDividend(double DividentRate){
        return getIncome() * DividentRate;
    }

    private static double getIncome() {
        return ValueOfSupply - getExpense();
    }

    private static double getExpense() {
        return ValueOfSupply * expenseRate;
    }

    private static double getTotal() {
        return ValueOfSupply + getVat();
    }

    private static double getVat() {
        return ValueOfSupply * vatRate;
    }
}
