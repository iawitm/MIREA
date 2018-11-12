package circle;

/*
    Лаврентьева Ирина ИКБО-13-17
    Вариант 1
 */

import java.util.Locale;
import java.util.Scanner;

public class CircleTest {
    static Scanner in;
    static Circle circle = new Circle(0, 0, 0);
    static double x, y, radius;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        in.useLocale(Locale.US); // Подключено для ввода дробных чисел через точку
        operation();
    }

    public static void operation() {
        int op;
        // double x, y, radius;
        System.out.println("Что вы хотите сделать?\n1 - установить значения центра окружности\n2 - установить значение радиуса\n3 - отобразить координаты центра\n4 - отобразить радиус\n0 - завершить программу");
        op = in.nextInt();
        switch (op) {
            case 0:
                break;
            case 1:
                System.out.println("Введите координату х");
                x = in.nextDouble();
                circle.setX(x);
                System.out.println("Введите координату у");
                y = in.nextDouble();
                circle.setY(y);
                operation();
                break;
            case 2:
                System.out.println("Введите радиус");
                radius = in.nextDouble();
                circle.setRadius(radius);
                operation();
                break;
            case 3:
                System.out.println("x = " + circle.getX() + ", y = " + circle.getY());
                operation();
                break;
            case 4:
                System.out.println("Ражиус = " + circle.getRadius());
                operation();
                break;
            default:
                break;
        }
    }
}
