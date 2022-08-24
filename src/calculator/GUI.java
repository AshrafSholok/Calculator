package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ashraf Sholok
 */
public class GUI extends JFrame implements ActionListener {

    double num1, num2;
    char operator;
    double opera;

    double Result;

    JLabel oof = new JLabel("off");
    JLabel onn = new JLabel("on");
    JRadioButton off = new JRadioButton();
    JRadioButton on = new JRadioButton();

    ButtonGroup g = new ButtonGroup();
    
    JButton de = new JButton("<--");
    JButton c = new JButton("c");
    JButton p = new JButton("+");
    JButton m = new JButton("-");
    JButton d = new JButton("/");
    JButton ma = new JButton("*");
    JButton E = new JButton("=");
    JButton b = new JButton(".");
    JButton b0 = new JButton("0");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");

    JPanel n = new JPanel();

    JTextField displayLabel = new JTextField();

    public GUI() {
        Calculation();
    }

    public void Calculation() {
        this.setSize(350, 500);
        this.setVisible(true);
        this.setTitle("calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        n.setBackground(Color.GRAY);
        this.add(n);

        this.setLayout(null);
        b0.setBounds(25, 400, 50, 50);
        this.add(b0);

        b.setBounds(100, 400, 50, 50);
        this.add(b);

        E.setBounds(175, 400, 125, 50);
        this.add(E);

        b1.setBounds(25, 325, 50, 50);
        this.add(b1);

        b2.setBounds(100, 325, 50, 50);
        this.add(b2);

        b3.setBounds(175, 325, 50, 50);
        this.add(b3);

        d.setBounds(250, 325, 50, 50);
        this.add(d);

        b4.setBounds(25, 250, 50, 50);
        this.add(b4);

        b5.setBounds(100, 250, 50, 50);
        this.add(b5);

        b6.setBounds(175, 250, 50, 50);
        this.add(b6);

        ma.setBounds(250, 250, 50, 50);
        this.add(ma);

        b7.setBounds(25, 175, 50, 50);
        this.add(b7);

        b8.setBounds(100, 175, 50, 50);
        this.add(b8);

        b9.setBounds(175, 175, 50, 50);
        this.add(b9);

        m.setBounds(250, 175, 50, 50);
        this.add(m);

        on.setBounds(25, 103, 20, 20);
        this.add(on);
        onn.setBounds(46, 99, 25, 25);
        this.add(onn);

        off.setBounds(25, 129, 20, 20);
        this.add(off);
        oof.setBounds(46, 125, 25, 25);
        this.add(oof);

        g.add(on);
        g.add(off);

        de.setBounds(100, 100, 50, 50);
        this.add(de);

        c.setBounds(175, 100, 50, 50);
        this.add(c);

        p.setBounds(250, 100, 50, 50);
        this.add(p);

        displayLabel.setBounds(25, 25, 275, 50);
        this.add(displayLabel);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        p.addActionListener(this);
        de.addActionListener(this);
        c.addActionListener(this);
        m.addActionListener(this);
        d.addActionListener(this);
        ma.addActionListener(this);
        E.addActionListener(this);
        b.addActionListener(this);
        on.addActionListener(this);
        off.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == on) {
            displayLabel.setEnabled(true);
            b0.setEnabled(true);
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);

            de.setEnabled(true);
            c.setEnabled(true);
            p.setEnabled(true);
            m.setEnabled(true);
            d.setEnabled(true);
            ma.setEnabled(true);
            E.setEnabled(true);
            b.setEnabled(true);
        }
        if (e.getSource() == off) {
            displayLabel.setEnabled(false);
            b0.setEnabled(false);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

            de.setEnabled(false);
            c.setEnabled(false);
            p.setEnabled(false);
            m.setEnabled(false);
            d.setEnabled(false);
            ma.setEnabled(false);
            E.setEnabled(false);
            b.setEnabled(false);
            on.setEnabled(true);
        }

        if (e.getSource() == de) {
            StringBuffer r = new StringBuffer(displayLabel.getText());
            r.reverse();
            r.deleteCharAt(0);
            r.reverse();
            String s = new String(r);
            displayLabel.setText(s);
        }

        if (e.getSource() == b0) {
            displayLabel.setText(displayLabel.getText() + "0");
        }

        if (e.getSource() == b1) {
            displayLabel.setText(displayLabel.getText() + "1");
        }

        if (e.getSource() == b2) {
            displayLabel.setText(displayLabel.getText() + "2");
        }

        if (e.getSource() == b3) {

            displayLabel.setText(displayLabel.getText() + "3");
        }

        if (e.getSource() == b4) {
            displayLabel.setText(displayLabel.getText() + "4");
        }

        if (e.getSource() == b5) {
            displayLabel.setText(displayLabel.getText() + "5");
        }

        if (e.getSource() == b6) {
            displayLabel.setText(displayLabel.getText() + "6");
        }

        if (e.getSource() == b7) {
            displayLabel.setText(displayLabel.getText() + "7");
        }

        if (e.getSource() == b8) {
            displayLabel.setText(displayLabel.getText() + "8");
        }

        if (e.getSource() == b9) {
            displayLabel.setText(displayLabel.getText() + "9");
        }

        if (e.getSource() == b) {
            displayLabel.setText(displayLabel.getText() + ".");
        }

        if (e.getSource() == ma) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '*';
            displayLabel.setText("");
        }

        if (e.getSource() == p) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '+';
            displayLabel.setText("");
        }

        if (e.getSource() == d) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '/';
            displayLabel.setText("");
        }

        if (e.getSource() == m) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '-';
            displayLabel.setText("");
        }

        if (e.getSource() == c) {
            displayLabel.setText("");
        }

        if (e.getSource() == E) {

            switch (operator) {
                case '+':
                    num2 = Double.parseDouble(displayLabel.getText());
                    Result = num1 + num2;
                    break;

                case '-':
                    num2 = Double.parseDouble(displayLabel.getText());
                    Result = num1 - num2;
                    break;

                case '*':
                    num2 = Double.parseDouble(displayLabel.getText());
                    Result = num1 * num2;
                    break;

                case '/':
                    num2 = Double.parseDouble(displayLabel.getText());
                    Result = num1 / num2;
                    break;
            }
            displayLabel.setText("" + Result);

        }
    }

}
