package entities.organization;

public class Service {
    private String name;
    private float price;

    public Service() {
        this.name = "";
        this.price = 0;
    }

    public Service(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
