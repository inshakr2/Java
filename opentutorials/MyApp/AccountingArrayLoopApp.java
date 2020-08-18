public class AccountingArrayLoopApp {
    public static void main(String[] args) {

        double ValueOfSupply = Double.parseDouble(args[0]);
        double VatRate = 0.1;
        double expenseRate = 0.3;
        double Vat = ValueOfSupply * VatRate;
        double Total = ValueOfSupply + Vat;
        double Expense = ValueOfSupply * expenseRate;
        double Income = ValueOfSupply - Expense;

        System.out.println("Value of supply : " + ValueOfSupply);
        System.out.println("VAT : " + Vat);
        System.out.println("Total : " + Total);
        System.out.println("Expense : " + Expense);
        System.out.println("Income : " + Income);

        double[] DividendRates = {0.5, 0.3, 0.2};

        int i = 0;
        while (i < DividendRates.length) {
            System.out.println("Dividend 1 : " + Income * DividendRates[i]);
            i ++ ;
        }
    }
}
