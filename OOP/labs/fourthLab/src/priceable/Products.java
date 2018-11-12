package priceable;

/*
    Лаврентьева Ирина ИКБО-13-17
    Вариант 2
*/
import java.util.Scanner;

public class Products {
    static Milk milk = new Milk(1, 56.47);
    static Cheese cheese = new Cheese("гауда", 231.55);
    static Juice juice = new Juice("яблоко", 57.23);
    static Scanner in;

    public static void main(String[] args){
        in = new Scanner(System.in);
        operation();

    }

    public static void operation(){
        int op;
        System.out.println("Что вы хотите сделать?\n1 - узнать цену продуктов и их спецификации\n2 - изменить данные о продуктах\n0 - завершить программу");
        op = in.nextInt();
        switch(op){
            case 1:
                displayInfo();
                break;
            case 2:
                changeInfo();
                break;
            case 0:
                break;
            default: break;

        }
    }

    public static void displayInfo(){
        int op;
        System.out.println("1 - узнать цену\n2 - спецификации продуктов\n0 - выйти в меню");
        op = in.nextInt();
        switch (op){
            case 1:
                System.out.println("Цена молока: "+milk.getPrice()+"р, цена сыра: "+cheese.getPrice()+"р, цена сока: "+juice.getPrice()+"р");
                System.out.println();
                displayInfo();
                break;
            case 2:
                System.out.println("Объем молока = "+milk.getVolume()+"л; сорт сыра: "+cheese.getSort()+"; фрукт, из которого сделан сок: "+juice.getFruit());
                System.out.println();
                displayInfo();
                break;
            case 0:
                operation();
                break;
            default: break;

        }

    }

    public static void changeInfo(){
        int op;
        System.out.println("Что вы хотите сделать?\n1 - изменить цены продуктов\n2 - изменить данные о продуктах\n0 - выйти в меню");
        op = in.nextInt();
        switch(op){
            case 1:
                double price;
                System.out.println("Введите цену молока");
                price = in.nextDouble();
                milk.setPrice(price);
                System.out.println("Введите цену сыра");
                price = in.nextDouble();
                cheese.setPrice(price);
                System.out.println("Введите цену сока");
                price = in.nextDouble();
                juice.setPrice(price);
                System.out.println();
                changeInfo();
                break;
            case 2:
                double volume;
                String parametr, fruit;
                System.out.println("Введите объем молока");
                volume = in.nextDouble();
                milk.setVolume(volume);
                System.out.println("Введите сорт сыра");
                in.nextLine();
                parametr = in.nextLine();
                cheese.setSort(parametr);
                System.out.println("Введите фрукт для сока");
                //in.nextLine();
                fruit = in.nextLine();
                juice.setFruit(fruit);
                changeInfo();
                break;
            case 0:
                operation();
                break;
            default: break;

        }
    }
}
