package file;

/*
    Лаврентьева Ирина ИКБО-13-17
    Вариант 1
*/

import java.util.Scanner;
import java.io.*;

public class FileApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        addText(1);
    }

    public static void addText(int answer) {
        boolean flag = true;
        String text;
        String tmp = "\n";
        switch (answer) {
            case 1:
            System.out.println("Введите текст, который вы хотите добавить в файл. Внимание, каждый добавленный текст будет с новой строки!");
            text = in.nextLine();
            try (FileWriter writer = new FileWriter("testFile.txt", true)) {
                writer.write(text);
                writer.write("\r\n");

                    writer.flush(); }
            catch (Exception ex) {
                System.out.println("Error");
            }
            System.out.println("Хотите продолжить? 1 - да, 0 - нет");
            answer = in.nextInt();
            in.nextLine();
            addText(answer);
            break;
            case 0:
                break;
            default: break;


        }
    }
}

