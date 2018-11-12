package movable;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    @Override
    public String toString() {
        return "x top left= " + getTopLeft().x + ", y = " + getTopLeft().y + "; x bottom right = " + getBottomRight().x + ", y bottom right = " + getBottomRight().y;
    }


    @Override
    public void moveUp() {
        getTopLeft().y+=getTopLeft().ySpeed;
        getBottomRight().y+=getBottomRight().ySpeed;
    }

    @Override
    public void moveDown() {
        getTopLeft().y-=getTopLeft().ySpeed;
        getBottomRight().y-=getBottomRight().ySpeed;
    }

    @Override
    public void moveLeft() {
        getTopLeft().x-=getTopLeft().xSpeed;
        getBottomRight().x-=getBottomRight().xSpeed;
    }

    @Override
    public void moveRight() {
        getTopLeft().x+=getTopLeft().xSpeed;
        getBottomRight().x+=getBottomRight().xSpeed;
    }
}
