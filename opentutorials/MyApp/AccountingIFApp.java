public class AccountingIFApp {
    public static void main(String[] args) {

        double ValueOfSupply = Double.parseDouble(args[0]);
        double VatRate = 0.1;
        double expenseRate = 0.3;
        double Vat = ValueOfSupply * VatRate;
        double Total = ValueOfSupply + Vat;
        double Expense = ValueOfSupply * expenseRate;
        double Income = ValueOfSupply - Expense;

        double Dividend1;
        double Dividend2;
        double Dividend3;

        if(Income > 10000.0) {
            Dividend1 = Income * 0.5;
            Dividend2 = Income * 0.2;
            Dividend3 = Income * 0.3;
        } else {
            Dividend1 = Income * 1.0;
            Dividend2 = Income * 0;
            Dividend3 = Income * 0;
        }

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
