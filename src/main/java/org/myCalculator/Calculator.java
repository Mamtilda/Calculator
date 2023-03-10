package org.myCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {
    private JPanel Calculator;
    private JButton ACButton;
    private JButton a4Button;
    private JButton a1Button1;
    private JButton a00Button;
    private JButton button6;
    private JButton a8Button;
    private JButton a0Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a7Button;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton a1Button;
    private JTextField txtDisplay;

    double a, b, result;
    String op;

    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
                ACButton.setFocusPainted(false);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
                a7Button.setFocusPainted(false);


            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
                a8Button.setFocusPainted(false);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
                a9Button.setFocusPainted(false);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
                a4Button.setFocusPainted(false);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
                a5Button.setFocusPainted(false);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
                a6Button.setFocusPainted(false);
            }
        });
        a1Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button1.getText());
                a1Button.setFocusPainted(false);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
                a2Button.setFocusPainted(false);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
                a3Button.setFocusPainted(false);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
                a0Button.setFocusPainted(false);
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a00Button.getText());
                a00Button.setFocusPainted(false);
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button16.setFocusPainted(false);

                if(txtDisplay.getText().contains(".")) {
                    double pm = Double.parseDouble(txtDisplay.getText());
                    pm = pm +-1;
                    txtDisplay.setText(String.valueOf(pm));

                }else {
                    long PM = Long.parseLong(txtDisplay.getText());
                    PM = PM *-1;
                    txtDisplay.setText(String.valueOf(PM));
                }
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a1Button.setFocusPainted(false);

                if(txtDisplay.getText().contains(".")) {
                    txtDisplay.setText(txtDisplay.getText() + a1Button.getText());


                } if (e.getSource() == a1Button) {
                    txtDisplay.setText(txtDisplay.getText() + ".");

                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "+";
                txtDisplay.setText("");
                button11.setFocusPainted(false);

            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "-";
                txtDisplay.setText("");
                button12.setFocusPainted(false);
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "*";
                txtDisplay.setText("");
                button13.setFocusPainted(false);
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "/";
                txtDisplay.setText("");
                button14.setFocusPainted(false);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                button6.setFocusPainted(false);

                if(txtDisplay.getText().length() > 0) {
                    StringBuilder StrB = new StringBuilder(txtDisplay.getText());
                    StrB.deleteCharAt(txtDisplay.getText().length() -1);
                    backspace = String.valueOf(StrB);
                    txtDisplay.setText(backspace);
                }
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtDisplay.getText());
                button15.setFocusPainted(false);

                if(op == "+") {

                    result = a + b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op == "-") {
                    result = a - b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op == "*") {
                    result = a * b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op == "/") {
                    result = a / b;
                    txtDisplay.setText(String.valueOf(result));
                }


            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(380, 180);





    }
}
