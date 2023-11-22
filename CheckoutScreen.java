import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckoutScreen extends JFrame {
    private JTextField total$TextField;
    private JRadioButton cardRadioButton;
    private JRadioButton cashCheckRadioButton;
    private JPanel checkoutPanel;
    private JRadioButton cardDelivery;
    private JRadioButton cardPickup;
    private JTextField cardAddress1;
    private JTextField cardAddress2;
    private JTextField payAtTheShopTextField;
    private JRadioButton cashDelivery;
    private JRadioButton cashPickup;
    private JTextField cashAddress1;
    private JTextField cashAddress2;
    private JTextField payAtTheShopTextField2;
    private JButton button1;
    private JButton button2;
    private ButtonGroup cashOrCard;
    private ButtonGroup cardMethod;
    private ButtonGroup cashMethod;


    public CheckoutScreen() {
        setContentPane(checkoutPanel);
        getContentPane().setBackground(Color.decode("#F6F3EB"));
        setTitle("Checkout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setVisible(true);


        cardRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cardRadioButton.isSelected()) {
                    cardDelivery.setEnabled(true);
                    cardAddress1.setEnabled(true);
                    cardAddress2.setEnabled(true);
                    cardPickup.setEnabled(true);
                    payAtTheShopTextField.setEnabled(true);
                    cashDelivery.setEnabled(false);
                    cashAddress1.setEnabled(false);
                    cashAddress2.setEnabled(false);
                    cashPickup.setEnabled(false);
                    payAtTheShopTextField2.setEnabled(false);
                }
            }
        });
        cashCheckRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cashCheckRadioButton.isSelected()) {
                    cashDelivery.setEnabled(true);
                    cashAddress1.setEnabled(true);
                    cashAddress2.setEnabled(true);
                    cashPickup.setEnabled(true);
                    payAtTheShopTextField2.setEnabled(true);
                    cardDelivery.setEnabled(false);
                    cardAddress1.setEnabled(false);
                    cardAddress2.setEnabled(false);
                    cardPickup.setEnabled(false);
                    payAtTheShopTextField.setEnabled(false);
                }
            }
        });
    }
    public static void main(String[] args) {
        new CheckoutScreen();
    }
}
