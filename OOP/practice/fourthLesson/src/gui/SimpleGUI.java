package gui;

/*
    Лаврентьева Ирина ИКБО-13-17
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton buttonMilan = new JButton("AC Milan");
    private JButton buttonMadrid = new JButton ("Real Madrid");
    private JLabel result = new JLabel("Result: 0 X 0");
    private JLabel scorer = new JLabel("Last Scorer: N/A");
    private JLabel winner = new JLabel("Winner: N/A");
    private int milanCounter = 0;
    private int madridCounter = 0;

    public SimpleGUI(){
        super("Simple GUI");
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,5,2,2));
        container.add(buttonMilan);
        container.add(buttonMadrid);
        container.add(result);
        container.add(scorer);
        container.add(winner);

        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanCounter++;
                String txt = "Result: "+milanCounter+" X "+madridCounter;
                result.setText(txt);
                scorer.setText("Last Scorer: Milan");
                if (milanCounter!=madridCounter){
                    if(milanCounter>madridCounter)
                        winner.setText("Winner: Milan");
                    else
                        winner.setText("Winner: Madrid");
                }
                else
                    winner.setText("Winner: N/A");
            }
        });

        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridCounter++;
                String txt = "Result: "+milanCounter+" X "+madridCounter;
                result.setText(txt);
                scorer.setText("Last Scorer: Madrid");
                if (milanCounter!=madridCounter){
                    if(milanCounter>madridCounter)
                        winner.setText("Winner: Milan");
                    else
                        winner.setText("Winner: Madrid");
                }
                else
                    winner.setText("Winner: N/A");
            }
        });
    }

    public static void main(String[] args){
        new SimpleGUI().setVisible(true);
    }
}
