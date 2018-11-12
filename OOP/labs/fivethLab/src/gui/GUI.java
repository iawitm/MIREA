package gui;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;



public class GUI extends JFrame{

    static Scanner in = new Scanner(System.in);
    //static Panel panel;

    public GUI(String path){
        super("GUI");
        setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new Panel(path);
        add(panel);
    }

    public static void main(String[] args){

        String path;
        System.out.println("Введите путь");
        path = in.nextLine();
        new GUI(path).setVisible(true);
    }
}
