package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            int year = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane mes = new JOptionPane();
                //mes.setSize(200,200);

                year = Integer.parseInt(tfYear.getText());
                int lyear = isLeapYear(year);

                if (lyear == 1) {
                    // Show a JOptionPane with the message "Leap year"
                    JOptionPane.showMessageDialog(btnCheckYear, "Leap year");
                } else {
                    // Show a JOptionPane with the message "Not a leap year"
                    JOptionPane.showMessageDialog(btnCheckYear, "Not a leap year");
                }



            }
        });
    }
    public static void main(String[] args) {
        LeapYearGUI ly = new LeapYearGUI();
        ly.setTitle("Leap Year Checker");
        ly.setContentPane(ly.panel1);
        ly.setSize(300, 300);
        ly.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ly.setVisible(true);
    }

    public static int isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return 1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

}
