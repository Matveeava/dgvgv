package accounting;

import accounting.Deal;

public class Expenditure extends Deal {
    public Expenditure(String productName, int price){
        super("Покупка" + productName + "на" + price + "руб",0,price);
    }
}
