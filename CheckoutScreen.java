import javax.swing.*;
import java.awt.Color;

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
    private JTextField payAtTheShopTextField1;
    private JButton button1;
    private JButton button2;

    public CheckoutScreen() {
        setContentPane(checkoutPanel);
        getContentPane().setBackground(Color.decode("#F6F3EB"));
        setTitle("Checkout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CheckoutScreen();
    }
}
