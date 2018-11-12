package priceable;

public class Cheese implements Priceable {
    private String sort;
    private double price;

    public Cheese(String sort, double price){
        this.sort = sort;
        this.price = price;
    };

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
