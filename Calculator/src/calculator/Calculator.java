package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Calculator extends JFrame {

    public JTextArea display;

    public Calculator() {
        super("Логический калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 700, 400);
        setLayout(new BorderLayout());
        initMenu();
        initButtonsPanel();
        setVisible(true);

    }

    public void initMenu() {
        getContentPane().setLayout(new BorderLayout());
        JMenuBar menuBar = new JMenuBar();
        JMenu menuMain = new JMenu("Меню");
        menuBar.add(menuMain);

        JMenuItem myMenuItem = new JMenuItem("Составить таблицу истинности");
        myMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new TablizaIstinnosti(display);
            }
        });

        JMenuItem myMenuItem1 = new JMenuItem("Выход");
        myMenuItem1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuMain.add(myMenuItem);
        menuMain.add(myMenuItem1);
        setJMenuBar(menuBar);
    }

    public void initButtonsPanel() {
        display = new JTextArea();
        add(display, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel(new GridLayout(8, 5));
        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.add(new LogicalButton(display, "("));
        buttonPanel.add(new LogicalButton(display, ")"));
        buttonPanel.add(new LogicalButton(display, "\u02C5"));
        JButton button1 = new JButton("C");
        buttonPanel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp1 = display.getText();
                display.setText(temp1.substring(0, temp1.length() - 1));
            }
        });
        JButton button2 = new JButton("CE");
        buttonPanel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText(temp.substring(temp.length()));
            }
        });
        buttonPanel.add(new LogicalButton(display, "\u00AC"));
        buttonPanel.add(new LogicalButton(display, "\u007C"));
        buttonPanel.add(new LogicalButton(display, "\u2193"));
        buttonPanel.add(new LogicalButton(display, "\u02C4"));
        buttonPanel.add(new LogicalButton(display, "\u2295"));
        buttonPanel.add(new LogicalButton(display, "\u2192"));
        buttonPanel.add(new LogicalButton(display, "\u007E"));
        buttonPanel.add(new LogicalButton(display, "A"));
        buttonPanel.add(new LogicalButton(display, "B"));
        buttonPanel.add(new LogicalButton(display, "C"));
        buttonPanel.add(new LogicalButton(display, "D"));
        buttonPanel.add(new LogicalButton(display, "E"));
        buttonPanel.add(new LogicalButton(display, "F"));
        buttonPanel.add(new LogicalButton(display, "G"));
        buttonPanel.add(new LogicalButton(display, "H"));
        buttonPanel.add(new LogicalButton(display, "I"));
        buttonPanel.add(new LogicalButton(display, "J"));
        buttonPanel.add(new LogicalButton(display, "K"));
        buttonPanel.add(new LogicalButton(display, "L"));
        buttonPanel.add(new LogicalButton(display, "M"));
        buttonPanel.add(new LogicalButton(display, "N"));
        buttonPanel.add(new LogicalButton(display, "O"));
        buttonPanel.add(new LogicalButton(display, "P"));
        buttonPanel.add(new LogicalButton(display, "Q"));
        buttonPanel.add(new LogicalButton(display, "R"));
        buttonPanel.add(new LogicalButton(display, "S"));
        buttonPanel.add(new LogicalButton(display, "T"));
        buttonPanel.add(new LogicalButton(display, "U"));
        buttonPanel.add(new LogicalButton(display, "V"));
        buttonPanel.add(new LogicalButton(display, "W"));
        buttonPanel.add(new LogicalButton(display, ""));
        buttonPanel.add(new LogicalButton(display, "X"));
        buttonPanel.add(new LogicalButton(display, "Y"));
        buttonPanel.add(new LogicalButton(display, "Z"));
        buttonPanel.add(new LogicalButton(display, ""));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}