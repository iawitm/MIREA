package book;

/*
    Лаврентьева Ирина ИКБО-13-17
    Упражнение 2
*/

import java.util.Scanner;

public class BookTest {
    static Scanner in = new Scanner(System.in);
    static Book book = new Book(156, "Толстой");

    public static void main(String[] args){
        operation();
    }

    public static void operation() {
        int op;
        System.out.println("Выберите, что вы хотите сделать.\n1 - отобразить информацию о книге\n2 - изменить количество страниц\n3 - изменить автора\n0 - заверншить программу");
        op = in.nextInt();
        switch (op) {
            case 1:
                book.displayInfo();
                System.out.println();
                operation();
                break;
            case 2:
                int newPagesAmount;
                System.out.println("Введите количество страниц");
                newPagesAmount = in.nextInt();
                book.setPagesAmount(newPagesAmount);
                System.out.println();
                operation();
                break;
            case 3:
                String newAuthor;
                System.out.println("Введите автора");
                in.nextLine();
                newAuthor = in.nextLine();
                book.setAuthor(newAuthor);
                System.out.println();
                operation();
                break;
            case 0:
                break;
            default:
                break;
        }
    }
}