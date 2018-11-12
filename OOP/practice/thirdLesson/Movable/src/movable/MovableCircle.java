package movable;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "x = "+getCenter().x+", y = "+getCenter().y;
    }

    @Override
    public void moveUp() {
        getCenter().y+=getCenter().ySpeed;
    }

    @Override
    public void moveDown() {
        getCenter().y-=getCenter().ySpeed;
    }

    @Override
    public void moveLeft() {
        getCenter().x-=getCenter().xSpeed;
    }

    @Override
    public void moveRight() {
        getCenter().x+=getCenter().xSpeed;
    }
}
