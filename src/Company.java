import accounting.Deal;
import taxes.TaxSystem;

public class Company {
    private final String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem){
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;
    }
    public void shiftMoney(int amount){
        if(amount > 0){
            debit += amount;
        }else if(amount < 0){
            credit += Math.abs(amount);
        }
    }
    public void TaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes(){
        int taxAmount = taxSystem.calcTaxFor(debit,credit);

        System.out.println("Компания" + title + " "+"Уплатила налог:"+ " " + taxAmount + " " + "руб");
        debit = 0;
        credit = 0;
    }




    public int applyDeals(Deal[] deals){
        int initialDebit = debit;
        int initialCredit = credit;

        for (Deal deal : deals){
            shiftMoney(deal.getDebitChange());
            shiftMoney(-deal.getCreditChange());
            System.out.println(deal.getComment());
        }

        return credit - debit - (initialDebit - initialCredit);
    }
}
