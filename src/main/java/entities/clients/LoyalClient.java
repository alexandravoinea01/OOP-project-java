package entities.clients;

public class LoyalClient extends Client {
    private int noYears;
    private int discount;

    public LoyalClient() {
        super();
        this.noYears = 0;
        this.discount = 0;
    }

    public LoyalClient(String name, int age, String sex, String mail, int noYears, int discount) {
        super(name, age, sex, mail);
        this.noYears = noYears;
        this.discount = discount;
    }

    public int getNoYears() {
        return this.noYears;
    }

    public void setNoYears(int noYears) {
        this.noYears = noYears;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
