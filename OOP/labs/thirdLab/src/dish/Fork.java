package dish;

public class Fork extends Dish {

    private String material;

    public Fork(int amount, String color, String material) {
        super(amount, color);
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() { return material;
    }

    public void pierce(int count) {
        for (int i = 0; i < count; i++)
            System.out.print("тык ");
        System.out.println();
    }

    @Override
    public void displayInfo() {
        System.out.println("Вилка. Количество: " + getAmount() + ", цвет: " + getColor() + ", материал: "+getMaterial());
    }
}
