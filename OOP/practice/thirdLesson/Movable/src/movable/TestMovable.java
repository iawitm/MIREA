package movable;

import java.util.Scanner;

public class TestMovable {
    static Scanner in = new Scanner(System.in);
    static MovableCircle circle = new MovableCircle(0, 0, 5, 6, 10);
    static MovableRectangle rectangle = new MovableRectangle(0, 5, 7, 0, 5, 3);
    public static void main(String[] args){
        System.out.println("Начальные координаты окружности "+circle);
        System.out.println("Начальные координаты прямоугольника"+rectangle);
        move();
    }

    public static void move(){
        int move;
        System.out.println("1 - circle, 2 - rectangle, 0 - exit");
        move = in.nextInt();
        switch(move){
            case 1:
                moveCircle();
                break;
            case 2:
                moveRectangle();
                break;
            case 0:
                break;
            default:
                break;

        }
    }

    public static void moveCircle(){
        int move;
        System.out.println("1 - up\n2 - down\n3 - left\n4 - right\n5 - print\n6 - menun\0 - exit");
        move = in.nextInt();
        switch(move){
            case 1:
                circle.moveUp();
                moveCircle();
                break;
            case 2:
                circle.moveDown();
                moveCircle();
                break;
            case 3:
                circle.moveLeft();
                moveCircle();
                break;
            case 4:
                circle.moveRight();
                moveCircle();
                break;
            case 5:
                System.out.println(circle);
                moveCircle();
            case 6:
                move();
            case 0:
                break;
            default: break;
        }

    }

    public static void moveRectangle(){
        int move;
        System.out.println("1 - up\n2 - down\n3 - left\n4 - right\n5 - print\n0 - exit");
        move = in.nextInt();
        switch(move){
            case 1:
                rectangle.moveUp();
                moveRectangle();
                break;
            case 2:
                rectangle.moveDown();
                moveRectangle();
                break;
            case 3:
                rectangle.moveLeft();
                moveRectangle();
                break;
            case 4:
                rectangle.moveRight();
                moveRectangle();
                break;
            case 5:
                System.out.println(rectangle);
                moveRectangle();
            case 0:
                break;
            default: break;
        }

    }
}
