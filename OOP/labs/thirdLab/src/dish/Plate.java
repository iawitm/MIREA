package dish;

public class Plate extends Dish {
    private char size;

    public Plate(int amount, String color, char size){
        super(amount, color);
        this.size = size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public void eat(){
        System.out.println("Из тарелки можно есть");
    }

    @Override
    public void displayInfo() {
        System.out.println("Тарелка. Количество: " + getAmount() + ", цвет: " + getColor() + ", размер: "+getSize());
    }
}
