package priceable;

public class Juice implements Priceable {
    private String fruit;
    private double price;

    public Juice(String fruit, double price){
        this.fruit = fruit;
        this.price = price;
    };

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getFruit() {
        return fruit;
    }
}
