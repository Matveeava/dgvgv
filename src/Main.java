import accounting.Deal;
import accounting.Expenditure;
import accounting.Sale;
import taxes.UsnIncomeTaxSystem;
import taxes.UsnIncomeinusExpenseTaxSystem;

public class Main{

    public static void main(String[] args){
       Company company = new Company(" ", new UsnIncomeTaxSystem());

       company.shiftMoney(1000);
       company.shiftMoney(-500);
       company.payTaxes();

       company.TaxSystem(new UsnIncomeinusExpenseTaxSystem());
       company.shiftMoney(1500);
       company.shiftMoney(-300);
       company.payTaxes();

       Deal[] deals = new Deal[]{
               new Sale(" ", 500),
               new Sale(" ", 1000),
               new Expenditure(" ",5000),
               new Sale(" ",4000),
               new Expenditure(" ",3000),
               new Sale(" ",2000),
               new Expenditure(" ", 8000),
       };


       int profit = company.applyDeals(deals);
       System.out.println("Компания заработала:" + profit + "руб");
    }


}