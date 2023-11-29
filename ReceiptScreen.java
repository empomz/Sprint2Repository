import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.lang.Math;

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
    private static JTextPane itemsList;
    private static JTextPane totalsList;
    private static JTextPane methodTextPane;

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

        // List<OrderItem> orderItems = setOrderItems();
        // setAndShowItems(orderItems);
    }

    public static void setOrderItems() {
        // no clue if smth like this will work to get the items + prices
    }

    // To display the list of items on the receipt + their prices. Code taken from miina's
    // i'm hoping this will just like. work when this is with all the other files
    public static void setAndShowItems(List<OrderItem> orderItems) {
        StringBuilder text = new StringBuilder("<html>");
        StringBuilder totals = new StringBuilder("<html>");
        double total = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        for(OrderItem item : orderItems){
            text.append(item.getName()).append(": $").append(decimalFormat.format(item.getPrice())).append("<br>");
            total += item.getPrice();
        }

        try {
            //totalLabel.setText("TOTAL: $" + decimalFormat.format(total));
            double tax = total * 0.06;
            tax = Math.round(tax);
            double realTotal = total + tax;
            totals.append("Subtotal: ").append(total).append("<br>Tax (6%): ").append(tax).append("<br>Total: ").append(realTotal);
            totalsList.setText(totals.toString());
            itemsList.setText(text.toString());
        }
        catch(Exception ex){

        }
    }

    // Set card details or cash at the bottom of receipt
    public static void setAndShowCard() {
        if(CheckoutScreen.isCard) {
            StringBuilder cardInfo = new StringBuilder("<html>");
            String lastFour = "" + CheckoutScreen.cardNum.charAt(12) + CheckoutScreen.cardNum.charAt(13) + CheckoutScreen.cardNum.charAt(14) + CheckoutScreen.cardNum.charAt(15);
            cardInfo.append("Payment Method: Card<br>ACCT: **** **** **** ").append(lastFour);
            methodTextPane.setText(cardInfo.toString());
        } else {
            methodTextPane.setText("Payment Method: Cash");
        }
    }

    public static void main(String[] args) {
        new ReceiptScreen();
    }

    public static void openGUI() {
        new ReceiptScreen();
    }
}
