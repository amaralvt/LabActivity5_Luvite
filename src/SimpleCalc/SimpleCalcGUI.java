package SimpleCalc;

import javax.swing.*;
import java.util.Arrays;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel lblResult;
    private JTextField tfResult;

    public SimpleCalcGUI () {

        for (String s : Arrays.asList("+", "-", "*", "/")) {
            cbOperations.addItem(s);
        }

        btnCompute.addActionListener(e -> computeResult());
    }
    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();
        calc.setContentPane(calc.panel1);
        calc.setSize(600,600);
        calc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        calc.setVisible(true);

        new SimpleCalcGUI();
    }

    private void computeResult() {
        try {
            int number1 = Integer.parseInt(tfNumber1.getText());
            int number2 = Integer.parseInt(tfNumber2.getText());
            char operator = cbOperations.getSelectedItem().toString().charAt(0);

            /*if (number1 >= 'a' || number1 <= 'A'){
                if (number2 >= 'a' || number2 <= 'A') {
                    throw new Exception();
                }
            }*/
            int result = 0;
            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
            }

            tfResult.setText(String.valueOf((result)));
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(btnCompute, "Input should be a number.");
        }

    }

}
