package dish;
import java.util.Scanner;

/*
    Лаврентьева Ирина ИКБО-13-17
    Вариант 1
*/

public class Service {
    static Scanner in;
    static Fork fork = new Fork(4, "серый", "серебро");
    static Plate plate = new Plate(6, "белый", 'm');
    public static void main(String[] args) {
        in = new Scanner(System.in);
       operation();
    }

    public static void operation(){
        int op;
        System.out.println("Что вы хотите сделать?\n1 - узнать информацию о посуде в сервизе\n2 - заменить вилки\n3 - заменить тарелки\n4 - посмотреть действия с посудой\n0 - завершить программу");
        op = in.nextInt();
        System.out.println();
        switch(op){
            case 1:
                fork.displayInfo();
                plate.displayInfo();
                System.out.println();
                operation();
                break;
            case 2:
                changeInformationFork();
                break;
            case 3:
                changeInformationPlate();
                break;
            case 4:
                int count;
                System.out.println("Вилкой можно тыкать. Введите, сколько раз нужно тыкнуть вилкой");
                count = in.nextInt();
                fork.pierce(count);
                plate.eat();
                System.out.println();
                operation();
                break;
            case 0:
                break;
            default: break;


        }

    }

    public static void changeInformationFork(){
        int op;
        System.out.println("Что вы хотите изменить?\n1 - количество\n2 - цвет\n3 - материал\n0 - выйти в меню");
        op = in.nextInt();
        switch(op){
            case 1:
                int amount;
                System.out.println("Введите новое количество");
                amount = in.nextInt();
                fork.setAmount(amount);
                changeInformationFork();
                break;
            case 2:
                String color;
                System.out.println("Введите новый цвет");
                in.nextLine();
                color = in.nextLine();
                fork.setColor(color);
                changeInformationFork();
                break;
            case 3:
                String material;
                System.out.println("Введите новый материал");
                in.nextLine();
                material = in.nextLine();
                fork.setMaterial(material);
                changeInformationFork();
                break;
            case 0:
                operation();
                break;
            default: break;
        }

    }

    public static void changeInformationPlate(){
        int op;
        System.out.println("Что вы хотите изменить?\n1 - количество\n2 - цвет\n3 - размер(s, m, l)\n0 - выйти в меню");
        op = in.nextInt();
        switch(op){
            case 1:
                int amount;
                System.out.println("Введите новое количество");
                amount = in.nextInt();
                plate.setAmount(amount);
                changeInformationPlate();
                break;
            case 2:
                String color;
                System.out.println("Введите новый цвет");
                in.nextLine();
                color = in.nextLine();
                plate.setColor(color);
                changeInformationPlate();
                break;
            case 3:
                char size;
                System.out.println("Введите новый размер (s, m, l)");
                size = in.next().charAt(0);
                plate.setSize(size);
                changeInformationPlate();
                break;
            case 0:
                operation();
                break;
            default: break;
        }
    }
}

