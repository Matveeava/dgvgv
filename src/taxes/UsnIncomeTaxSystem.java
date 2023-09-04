package taxes;

public class UsnIncomeTaxSystem extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit){
        int UsnIncomeTaxSystem  = debit - credit;
        if(UsnIncomeTaxSystem < 0){
            return 0;
        }
        return(int)(UsnIncomeTaxSystem * 0.06);
    }

}
