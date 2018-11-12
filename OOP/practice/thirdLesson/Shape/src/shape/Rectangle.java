package shape;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle(){}

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return getLength()*getWidth();
    }

    @Override
    double getPerimetr() {
        return 2*(getLength()+getWidth());
    }

    @Override
    public String toString() {
        return "Length: "+getLength()+", width: "+getWidth()+", color: "+getColor()+", filled: "+isFilled()+", area: "+getArea()+", perimetr: "+getPerimetr();
    }
}
