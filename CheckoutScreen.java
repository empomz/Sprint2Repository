import javax.swing.*;

public class CheckoutScreen extends JFrame {
    private JTextField total$TextField;
    private JRadioButton cardRadioButton;
    private JRadioButton cashCheckRadioButton;
    private JPanel checkoutPanel;

    public CheckoutScreen() {
        setContentPane(checkoutPanel);
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
