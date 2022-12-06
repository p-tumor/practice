public class BankApp {
    private BagelShop bagelShop;
    private CreditCard card1;
    private CreditCard card2;
    private Bank bank;
    private String menu = "Type in a option.\n" +
            "1. Make a credit card payment.\n" +
            "2. Make a purchase or return "+bagelShop.getName()+".\n"+
            "3. Open a second credit card.\n" +
            "4. Compare credit card balances.\n" +
            "5. Manage "+bagelShop.getName();

    public BankApp(BagelShop bagelShop, Bank bank, CreditCard card, CreditCard card2){
        this.bagelShop = bagelShop;
        this.bank = bank;
        this.card1 = card;
        this.card2 = card2;
        menu = "Type in a option.\n" +
                "1. Make a credit card payment.\n" +
                "2. Make a purchase or return "+bagelShop.getName()+".\n"+
                "3. Open a second credit card.\n" +
                "4. Compare credit card balances.\n" +
                "5. Manage "+bagelShop.getName();
    }
    public String getMenu(){return menu;}

}
