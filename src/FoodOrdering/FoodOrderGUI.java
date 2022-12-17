package FoodOrdering;

import javax.swing.*;


public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae;
    private JRadioButton rb5, rb10, rb15, rbNone;
    private JButton btnOrder;

    public FoodOrderGUI() {

        ButtonGroup group = new ButtonGroup();
        group.add(rb5);
        group.add(rb10);
        group.add(rb15);
        group.add(rbNone);
        btnOrder.addActionListener(e -> {

            try {
                double totalPrice = 0;
                double discount = 0;


                if (cPizza.isSelected()) {
                    totalPrice += 100;
                }
                if (cBurger.isSelected()) {
                    totalPrice += 80;
                }
                if (cFries.isSelected()) {
                    totalPrice += 65;
                }
                if (cSoftDrinks.isSelected()) {
                    totalPrice += 55;
                }
                if (cTea.isSelected()) {
                    totalPrice += 50;
                }
                if (cSundae.isSelected()) {
                    totalPrice += 40;
                }

                if (rb5.isSelected()) {
                    discount = 0.05;
                } else if (rb10.isSelected()) {
                    discount = 0.10;
                } else if (rb15.isSelected()) {
                    discount = 0.15;
                }

                if (totalPrice == 0) {
                    throw new Exception("You must select an order to proceed.");
                } else if (!rbNone.isSelected()) {
                    throw new Exception("You must select a discount to proceed.");
                }

                totalPrice -= (totalPrice * discount);

                JOptionPane.showMessageDialog(btnOrder, "The total price is Php " + String.format("%.2f", totalPrice));

            } catch (Exception exc) {
                JOptionPane.showMessageDialog(btnOrder, exc.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI order = new FoodOrderGUI();
        order.setTitle("Food Ordering System");
        order.setContentPane(order.panel1);
        order.setSize(600, 600);
        order.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        order.setVisible(true);
    }


}
