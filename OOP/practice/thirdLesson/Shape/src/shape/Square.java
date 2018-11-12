package shape;

public class Square extends Rectangle {

    public Square(){}

    public Square(double side){
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled){
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return length;
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Side: "+getSide()+", color: "+getColor()+", filled: "+isFilled()+", area: "+getArea()+", perimetr: "+getPerimetr();
    }
}
