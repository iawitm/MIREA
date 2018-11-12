package shape;

public class Circle extends Shape {

    protected double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this. radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    double getPerimetr() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return "Radius: "+getRadius()+", color: "+getColor()+", filled: "+isFilled()+", area: "+getArea()+", perimetr: "+getPerimetr();
    }
}
