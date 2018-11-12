package priceable;

public class Milk implements Priceable {
    private double volume;
    private double price;

    public Milk(double volume, double price){
        this.volume = volume;
        this.price = price;
    };

    public double getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
