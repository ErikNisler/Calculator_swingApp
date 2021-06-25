package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;


public class Frame implements ActionListener{

    //Frame declaration for calculator
    private JFrame jFrame = new JFrame();

    //Buttons (nums + operators)
    private JButton num0 = new JButton("0");
    private JButton num1 = new JButton("1");
    private JButton num2 = new JButton("2");
    private JButton num3 = new JButton("3");
    private JButton num4 = new JButton("4");
    private JButton num5 = new JButton("5");
    private JButton num6 = new JButton("6");
    private JButton num7 = new JButton("7");
    private JButton num8 = new JButton("8");
    private JButton num9 = new JButton("9");

    //operators
    private JButton add = new JButton("+");
    private JButton subtract = new JButton("-");
    private JButton division = new JButton("/");
    private JButton multiplication = new JButton("*");
    private JButton equals = new JButton("=");
    private JButton clear = new JButton("clr");
    private JButton sqr = new JButton("sqr");
    private JButton dec = new JButton(",");
    //textfield
    private JTextField textField = new JTextField();
    //label
    private JLabel label = new JLabel();
    //panel
    private JPanel panel = new JPanel();
    //calculating nums
    private Double cNum1, cNum2, result;
    //operator
    String operator;

    public void buildFrame() {

        jFrame.setSize(new Dimension(340, 350));
        jFrame.setMinimumSize(new Dimension(340, 350));
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("calc.png");
        jFrame.setIconImage(icon.getImage());

        addButtons();
        addTextField();
        addLabel();
        //addPanel();
    }

    public void addLabel(){
        jFrame.add(label);
        label.setBounds(20,15,160,30);
    }

    public void addPanel(){
        jFrame.add(panel);
        panel.setLayout(new GridLayout(2,2,2,2));
        panel.setSize(250,350);
        panel.setBackground(Color.LIGHT_GRAY);
    }

    public void addTextField(){
        jFrame.add(textField);
        textField.setBounds(20,40,200,30);
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setEditable(false);
    }

    public void addButtons(){
        jFrame.add(num0);
        setNum0();
        jFrame.add(num1);
            setNum1();
        jFrame.add(num2);
            setNum2();
        jFrame.add(num3);
            setNum3();
        jFrame.add(num4);
            setNum4();
        jFrame.add(num5);
            setNum5();
        jFrame.add(num6);
            setNum6();
        jFrame.add(num7);
            setNum7();
        jFrame.add(num8);
            setNum8();
        jFrame.add(num9);
            setNum9();
        jFrame.add(add);
            setAdd();
        jFrame.add(subtract);
            setSubtract();
        jFrame.add(division);
            setDivision();
        jFrame.add(multiplication);
            setMultiplication();
        jFrame.add(equals);
            setEquals();
        jFrame.add(clear);
            setClear();
        jFrame.add(sqr);
            setSqr();
        jFrame.add(dec);
            setDec();
    }

    public void setDec(){
        dec.setBounds(240,180,50,30);
        dec.setFont(new Font("Arial", Font.CENTER_BASELINE, 10));
        dec.addActionListener(this);
    }

    public void setSqr(){
        sqr.setBounds(240,220,50,30);
        sqr.setFont(new Font("Arial", Font.CENTER_BASELINE, 10));
        sqr.addActionListener(this);
    }

    public void setClear(){
            clear.setBounds(20,220,50,30);
            clear.setFont(new Font("Arial", Font.CENTER_BASELINE, 10));
            clear.addActionListener(this);
    }
    public void setAdd(){
        add.setBounds(190,220,40,30);
        add.setFont(new Font("Arial", Font.PLAIN, 10));
        add.addActionListener(this);
    }

    public void setSubtract() {
        subtract.setBounds(190, 180, 40, 30);
        subtract.setFont(new Font("Arial", Font.PLAIN, 10));
        subtract.addActionListener(this);
    }

    public void setDivision(){
        division.setBounds(190,140,40,30);
        division.setFont(new Font("Arial", Font.PLAIN, 10));
        division.addActionListener(this);
    }

    public void setMultiplication(){
        multiplication.setBounds(190,100,40,30);
        multiplication.setFont(new Font("Arial", Font.PLAIN, 10));
        multiplication.addActionListener(this);
    }

    public void setEquals(){
        equals.setBounds(130,220,50,30);
        equals.setFont(new Font("Arial", Font.PLAIN, 20));
        equals.addActionListener(this);
    }

    public void setNum0(){
        num0.setBounds(75,220,50,30);
        num0.setFont(new Font("Arial", Font.PLAIN, 20));
        num0.addActionListener(this);
    }

    public void setNum1(){
        num1.setBounds(20,180,50,30);
        num1.setFont(new Font("Arial", Font.PLAIN, 20));
        num1.addActionListener(this);

    }

    public void setNum2(){
        num2.setBounds(75,180,50,30);
        num2.setFont(new Font("Arial", Font.PLAIN, 20));
        num2.addActionListener(this);

    }

    public void setNum3(){
        num3.setBounds(130,180,50,30);
        num3.setFont(new Font("Arial", Font.PLAIN, 20));
        num3.addActionListener(this);

    }

    public void setNum4(){
        num4.setBounds(20,140,50,30);
        num4.setFont(new Font("Arial", Font.PLAIN, 20));
        num4.addActionListener(this);

    }

    public void setNum5(){
        num5.setBounds(75,140,50,30);
        num5.setFont(new Font("Arial", Font.PLAIN, 20));
        num5.addActionListener(this);

    }

    public void setNum6(){
        num6.setBounds(130,140,50,30);
        num6.setFont(new Font("Arial", Font.PLAIN, 20));
        num6.addActionListener(this);

    }

    public void setNum7(){
        num7.setBounds(20,100,50,30);
        num7.setFont(new Font("Arial", Font.PLAIN, 20));
        num7.addActionListener(this);

    }

    public void setNum8(){
        num8.setBounds(75,100,50,30);
        num8.setFont(new Font("Arial", Font.PLAIN, 20));
        num8.addActionListener(this);

    }

    public void setNum9(){
        num9.setBounds(130,100,50,30);
        num9.setFont(new Font("Arial", Font.PLAIN, 20));
        num9.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == num0){
            textField.setText(textField.getText() + num0.getText());
            label.setText(label.getText() + num0.getText());
        } else if (e.getSource() == num1){
            textField.setText(textField.getText() + num1.getText());
            label.setText(label.getText() + num1.getText());
        } else if (e.getSource() == num2){
            textField.setText(textField.getText() + num2.getText());
            label.setText(label.getText() + num2.getText());
        } else if (e.getSource() == num3){
            textField.setText(textField.getText() + num3.getText());
            label.setText(label.getText() + num3.getText());
        } else if (e.getSource() == num4){
            textField.setText(textField.getText() + num4.getText());
            label.setText(label.getText() + num4.getText());
        } else if (e.getSource() == num5){
            textField.setText(textField.getText() + num5.getText());
            label.setText(label.getText() + num5.getText());
        } else if (e.getSource() == num6){
            textField.setText(textField.getText() + num6.getText());
            label.setText(label.getText() + num6.getText());
        } else if (e.getSource() == num7){
            textField.setText(textField.getText() + num7.getText());
            label.setText(label.getText() + num7.getText());
        } else if (e.getSource() == num8){
            textField.setText(textField.getText() + num8.getText());
            label.setText(label.getText() + num8.getText());
        } else if (e.getSource() == num9){
            textField.setText(textField.getText() + num9.getText());
            label.setText(label.getText() + num9.getText());
        }

        if (e.getSource() == add){
            cNum1 = Double.parseDouble(textField.getText());
            operator = add.getText();
            textField.setText("");
            label.setText(label.getText() + operator);
        }
        if (e.getSource() == subtract){
            cNum1 = Double.parseDouble(textField.getText());
            operator = subtract.getText();
            textField.setText("");
            label.setText(label.getText() + operator);
        }
        if (e.getSource() == division) {
            cNum1 = Double.parseDouble(textField.getText());
            operator = division.getText();
            textField.setText("");
            label.setText(label.getText() + operator);
        }
        if (e.getSource() == multiplication){
            cNum1 = Double.parseDouble(textField.getText());
            operator = multiplication.getText();
            textField.setText("");
            label.setText(label.getText() + operator);
        }
        if (e.getSource() == dec){
            cNum1 = Double.parseDouble(textField.getText());
            operator = ".";
            textField.setText(textField.getText() + operator);
            label.setText(label.getText() + operator);

        }
        if (e.getSource() == clear){
            textField.setText("");
            label.setText("");
        }
        if (e.getSource() == sqr){
            cNum1 = Double.parseDouble(textField.getText());
            double result = Math.pow(cNum1,2);
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == equals) {
            cNum2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case "+":
                    result = cNum1 + cNum2;
                    cNum1 = Double.valueOf(0);
                    break;
                case "-":
                    result = cNum1 - cNum2;
                    cNum1 = Double.valueOf(0);
                    break;
                case "/":
                    result = cNum1 / cNum2;
                    //nefunguje
                    cNum1 = Double.valueOf(1);
                    break;
                case "*":
                    result = cNum1 * cNum2;
                    cNum1 = Double.valueOf(1);
                    break;
            }
            textField.setText(String.valueOf(result));
            cNum1 = result;

        }

    }
}
