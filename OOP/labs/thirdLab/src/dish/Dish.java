package dish;

public abstract class Dish {
    private int amount;
    private String color;

    public Dish(int amount, String color) {
        this.amount = amount;
        this.color = color;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void displayInfo();
}
