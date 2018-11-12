package game;

/*
    Лаврентьева Ирина ИКБО-13-17
    Вариант 1
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GUI extends JFrame {
    private JTextField input = new JTextField(10);
    private JButton button = new JButton("Угадать!");
    private int counter = 0;
    private static int number;
    private static Random random = new Random();
  //  private static JLabel label = new JLabel("Number");

    public GUI (){
        super("Game");
        setLayout(new FlowLayout());
        setSize(250,100);

        add(input);
        add(button);
        //add(label);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                        int x = Integer.parseInt(input.getText());
                        if (x == number) {
                            JOptionPane.showMessageDialog(null, "Вы угадали!", "Win!", JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                        } else {
                            counter++;
                            JOptionPane.showMessageDialog(null, "Вы не угадали! Попробуйте еще раз. Осталось попыток: "+(3-counter), "Внимание!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        if (counter == 3){
                            JOptionPane.showMessageDialog(null, "Извините, вы проиграли!","Сожалеем!" , JOptionPane.ERROR_MESSAGE);
                            dispose();
                        }
                }
                catch (Exception error){
                    JOptionPane.showMessageDialog(null, "Неверный ввод числа!","Внимание!" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }

    public static void main(String[] args){
        new GUI().setVisible(true);
        number = random.nextInt(21);
        // label.setText(String.valueOf(number)); - необходимо для проверки. Выводит нужное число на экран
    }
}
