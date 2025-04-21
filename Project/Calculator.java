import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Float;

public class Calculator implements ActionListener {

    boolean operatorStatus = false;
    String firstOperand;
    String secondOperand;

    int operation;
    float result;
    int intResult;

    JFrame jf;
    JLabel displayLabel;
    JButton  sevenButton, eightButton, nineButton;
    JButton fourButton, fiveButton, sixButton;
    JButton oneButton, twoButton, threeButton;
    JButton zeroButton, pointButton, equalButton;
    JButton divisionButton, multiplicationButton, subtractionButton, additionButton;
    JButton clearButton;

    public Calculator() {

        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(325, 515);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocation(528, 100);

        // Display area for result and calculation.
        displayLabel = new JLabel();
        displayLabel.setBounds(5, 5, 315, 75);
        displayLabel.setBackground(new Color(193, 220, 213));
        displayLabel.setOpaque(true);
        displayLabel.setFont(new Font("Arial", Font.BOLD, 37));
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayLabel);

        // Button 7 to access number 7.
        sevenButton = new JButton("7");
        sevenButton.setHorizontalAlignment(SwingConstants.CENTER);
        sevenButton.setVerticalAlignment(SwingConstants.CENTER);
        sevenButton.setBounds(5, 90, 75, 75);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 18));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        // Button 8 to access number 8.
        eightButton= new JButton("8");
        eightButton.setHorizontalAlignment(SwingConstants.CENTER);
        eightButton.setVerticalAlignment(SwingConstants.CENTER);
        eightButton.setBounds(85, 90, 75, 75);
        eightButton.setFont(new Font("Arial", Font.BOLD, 18));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        // Button 9 to access number 9.
        nineButton = new JButton("9");
        nineButton.setHorizontalAlignment(SwingConstants.CENTER);
        nineButton.setVerticalAlignment(SwingConstants.CENTER);
        nineButton.setBounds(165, 90, 75, 75);
        nineButton.setFont(new Font("Arial", Font.BOLD, 18));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        // Button 4 to access number 4.
        fourButton = new JButton("4");
        fourButton.setHorizontalAlignment(SwingConstants.CENTER);
        fourButton.setVerticalAlignment(SwingConstants.CENTER);
        fourButton.setBounds(5, 170, 75, 75);
        fourButton.setFont(new Font("Arial", Font.BOLD, 18));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        // Button 5 to access number 5.
        fiveButton = new JButton("5");
        fiveButton.setHorizontalAlignment(SwingConstants.CENTER);
        fiveButton.setVerticalAlignment(SwingConstants.CENTER);
        fiveButton.setBounds(85, 170, 75, 75);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 18));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        // Button 6 to access number 6.
        sixButton = new JButton("6");
        sixButton.setHorizontalAlignment(SwingConstants.CENTER);
        sixButton.setVerticalAlignment(SwingConstants.CENTER);
        sixButton.setBounds(165, 170, 75, 75);
        sixButton.setFont(new Font("Arial", Font.BOLD, 18));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        // Button 1 to access number 1.
        oneButton = new JButton("1");
        oneButton.setHorizontalAlignment(SwingConstants.CENTER);
        oneButton.setVerticalAlignment(SwingConstants.CENTER);
        oneButton.setBounds(5, 250, 75, 75);
        oneButton.setFont(new Font("Arial", Font.BOLD, 18));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        // Button 2 to access number 2.
        twoButton = new JButton("2");
        twoButton.setHorizontalAlignment(SwingConstants.CENTER);
        twoButton.setVerticalAlignment(SwingConstants.CENTER);
        twoButton.setBounds(85, 250, 75, 75);
        twoButton.setFont(new Font("Arial", Font.BOLD, 18));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        // Button 3 to access number 3.
        threeButton = new JButton("3");
        threeButton.setHorizontalAlignment(SwingConstants.CENTER);
        threeButton.setVerticalAlignment(SwingConstants.CENTER);
        threeButton.setBounds(165, 250, 75, 75);
        threeButton.setFont(new Font("Arial", Font.BOLD, 18));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        // Button 0 to access number 0.
        zeroButton = new JButton("0");
        zeroButton.setHorizontalAlignment(SwingConstants.CENTER);
        zeroButton.setVerticalAlignment(SwingConstants.CENTER);
        zeroButton.setBounds(5, 330, 75, 75);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 18));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        // Button '.' to access  point/period.
        pointButton = new JButton(".");
        pointButton.setHorizontalAlignment(SwingConstants.CENTER);
        pointButton.setVerticalAlignment(SwingConstants.CENTER);
        pointButton.setBounds(85, 330, 75, 75);
        pointButton.setFont(new Font("Arial", Font.BOLD, 20));
        pointButton.addActionListener(this);
        jf.add(pointButton);

        // Button '=' to access assignment operator.
        equalButton = new JButton("=");
        equalButton.setHorizontalAlignment(SwingConstants.CENTER);
        equalButton.setVerticalAlignment(SwingConstants.CENTER);
        equalButton.setBounds(165, 330, 75, 75);
        equalButton.setFont(new Font("Arial", Font.BOLD, 20));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        // Button '/' to access perform division.
        divisionButton = new JButton("÷");
        divisionButton.setHorizontalAlignment(SwingConstants.CENTER);
        divisionButton.setVerticalAlignment(SwingConstants.CENTER);
        divisionButton.setBounds(245, 90, 75, 75);
        divisionButton.setFont(new Font("Arial", Font.BOLD, 20));
        divisionButton.addActionListener(this);
        jf.add(divisionButton);

        // Button 'X' to access perform multiplication.
        multiplicationButton = new JButton("x");
        multiplicationButton.setHorizontalAlignment(SwingConstants.CENTER);
        multiplicationButton.setVerticalAlignment(SwingConstants.CENTER);
        multiplicationButton.setBounds(245, 170, 75, 75);
        multiplicationButton.setFont(new Font("Arial", Font.BOLD, 17));
        multiplicationButton.addActionListener(this);
        jf.add(multiplicationButton);

        // Button '-' to access perform subtraction.
        subtractionButton = new JButton("-");
        subtractionButton.setHorizontalAlignment(SwingConstants.CENTER);
        subtractionButton.setVerticalAlignment(SwingConstants.CENTER);
        subtractionButton.setBounds(245, 250, 75, 75);
        subtractionButton.setFont(new Font("Arial", Font.BOLD, 20));
        subtractionButton.addActionListener(this);
        jf.add(subtractionButton);

        // Button '+' to access perform addition.
        additionButton = new JButton("+");
        additionButton.setHorizontalAlignment(SwingConstants.CENTER);
        additionButton.setVerticalAlignment(SwingConstants.CENTER);
        additionButton.setBounds(245, 330, 75, 155);
        additionButton.setFont(new Font("Arial", Font.BOLD, 20));
        additionButton.addActionListener(this);
        jf.add(additionButton);

        // Button to clear content int text field.
        clearButton = new JButton("AC");
        clearButton.setHorizontalAlignment(SwingConstants.CENTER);
        clearButton.setVerticalAlignment(SwingConstants.CENTER);
        clearButton.setBounds(5, 410, 235, 75);
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));
        clearButton.addActionListener(this);
        jf.add(clearButton);

    }

    public static void main(String[] args){
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sevenButton) {
            if(operatorStatus){
                displayLabel.setText("7");
                operatorStatus = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"7");
            }
        } else if(e.getSource() == eightButton) {
            if(operatorStatus){
                displayLabel.setText("8");
                operatorStatus = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"8");
            }
        }else if(e.getSource() == nineButton) {
            if(operatorStatus){
                displayLabel.setText("9");
                operatorStatus = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "9");
            }
        }else if(e.getSource() == fourButton) {
            if(operatorStatus){
                displayLabel.setText("4");
                operatorStatus = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
        }else if(e.getSource() == fiveButton) {
            if(operatorStatus){
                displayLabel.setText("5");
                operatorStatus = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "5");
            }
        }else if(e.getSource() == sixButton) {
            if(operatorStatus){
                displayLabel.setText("6");
                operatorStatus = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
        }else if(e.getSource() == oneButton) {
            if(operatorStatus){
                displayLabel.setText("1");
                operatorStatus = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
        }else if(e.getSource() == twoButton) {
            if(operatorStatus){
                displayLabel.setText("2");
                operatorStatus = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "2");
            }
        }else if(e.getSource() == threeButton) {
            if(operatorStatus){
                displayLabel.setText("3");
                operatorStatus = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"3");
            }
        } else if (e.getSource() == zeroButton) {
            if(operatorStatus){
                displayLabel.setText("0");
                operatorStatus = false;
            } else {
            displayLabel.setText(displayLabel.getText()+"0");
            }
        } else if (e.getSource() == pointButton) {
            if(operatorStatus){
                displayLabel.setText(".");
                operatorStatus = false;
            } else {
                displayLabel.setText(displayLabel.getText() + ".");
            }
        }else if(e.getSource() == equalButton) {
            secondOperand=displayLabel.getText();
            float firstOperandF = Float.parseFloat(firstOperand);
            float secondOperandF = Float.parseFloat(secondOperand);
            if(operation == 1){
                result = firstOperandF / secondOperandF;
                if(result % 1 == 0){
                    intResult = (int) result;
                    displayLabel.setText(intResult+"");
                }else{
                    displayLabel.setText(result+"");
                }
            } else if (operation == 2) {
                result = firstOperandF * secondOperandF;
                if(result % 1 == 0){
                    intResult = (int) result;
                    displayLabel.setText(intResult+"");
                }else{
                    displayLabel.setText(result+"");
                }
            } else if (operation == 3) {
                result = firstOperandF - secondOperandF;
                if(result % 1 == 0){
                    intResult = (int) result;
                    displayLabel.setText(intResult+"");
                }else{
                    displayLabel.setText(result+"");
                }
            } else if (operation == 4) {
                result = firstOperandF + secondOperandF;
                if(result % 1 == 0){
                    intResult = (int) result;
                    displayLabel.setText(intResult+"");
                }else{
                    displayLabel.setText(result+"");
                }
            }
            //displayLabel.setText(result+"");
        }else if(e.getSource() == divisionButton) {
            operatorStatus = true;
            operation = 1;
            firstOperand=displayLabel.getText();
        }else if(e.getSource() == multiplicationButton) {
            operatorStatus = true;
            operation = 2;
            firstOperand=displayLabel.getText();
        }else if(e.getSource() == subtractionButton) {
            operatorStatus = true;
            operation = 3;
            firstOperand=displayLabel.getText();
        }else if(e.getSource() == additionButton) {
            operatorStatus = true;
            operation = 4;
            firstOperand=displayLabel.getText();
        } else if (e.getSource() == clearButton) {
            displayLabel.setText("");

        }
    }
}
