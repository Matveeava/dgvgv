package taxes;

public class UsnIncomeinusExpenseTaxSystem extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit){
        int UsnIncomeMinusExpense = debit - credit;
        if(UsnIncomeMinusExpense < 0 ){
            return 0;
        }
        return(int)(UsnIncomeMinusExpense * 0.15);
    }
}
