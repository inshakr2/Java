public class AccountingIFUnder10000App {
    public static void main(String[] args) {

        double ValueOfSupply = Double.parseDouble(args[0]);
        double VatRate = 0.1;
        double expenseRate = 0.3;
        double Vat = ValueOfSupply * VatRate;
        double Total = ValueOfSupply + Vat;
        double Expense = ValueOfSupply * expenseRate;
        double Income = ValueOfSupply - Expense;
        double Dividend1 = Income * 0.5;
        double Dividend2 = Income * 0.2;
        double Dividend3 = Income * 0.3;

        System.out.println("Value of supply : " + ValueOfSupply);
        System.out.println("VAT : " + Vat);
        System.out.println("Total : " + Total);
        System.out.println("Expense : " + Expense);
        System.out.println("Income : " + Income);

        System.out.println("Dividend 1 : " + Dividend1);
        System.out.println("Dividend 2 : " + Dividend2);
        System.out.println("Dividend 3 : " + Dividend3);
    }
}
