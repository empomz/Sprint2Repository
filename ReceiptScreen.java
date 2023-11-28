import javax.swing.*;
import java.awt.*;

public class ReceiptScreen extends JFrame {
    private JPanel panel1;
    private JTextField thankYouTextField;
    private JPanel leftPanel;
    private JPanel imgPanel;
    private JLabel logo;
    private JPanel receiptPanel;
    private JTextField placingAnOrderTextField;
    private JTextPane momAndPopSTextPane;
    private JTextPane a830PolytechnicLaneSuiteTextPane;
    private JTextPane textPane1;

    /*
    StringBuilder text = new StringBuilder("<html>");
        double total = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        for(OrderItem item : orderItems){
            text.append(item.getName()).append(": $").append(decimalFormat.format(item.getPrice())).append("<br>");
            total += item.getPrice();
        }

        try {
            //sometimes this will run even if the list is empty, and it cant grab empty stuff so if it happens just, dont.
            totalLabel.setText("TOTAL: $" + decimalFormat.format(total));
            orderDisplayLabel.setText(text.toString());
        }
        //if it happens i dont care, move on
        catch(Exception ex){

        }
     */
    // ^^ miina's code for displaying the order on the right

    /*
    information needed for receipt:
        - items ordered + prices
        - whether card or cash/check was selected
    then include subtotal (just adding item prices), tax (6%), and total (subtotal + tax)
     */

    public ReceiptScreen() {
        setContentPane(panel1);
        getContentPane().setBackground(Color.decode("#F6F3EB"));
        setTitle("Checkout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ReceiptScreen();
    }
}
