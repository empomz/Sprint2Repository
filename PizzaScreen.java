import javax.swing.*;


public class PizzaScreen extends JFrame {
    private JPanel PizzaPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel itemTab;
    private JPanel checkoutTab;
    private JPanel pizzaTab;
    private JLabel pizzaLabel;
    private JButton orderButton;
    private JPanel orderTab;
    private JPanel crustTab;
    private JLabel crustLabel;
    private JRadioButton thinCrustRadioButton;
    private JRadioButton regularRadioButton;
    private JRadioButton panRadioButton;
    private JLabel toppingsLabel;
    private JButton cheeseButton;
    private JButton pepperoniButton;
    private JButton sausageButton;
    private JButton hamButton;
    private JButton greenPepperButton;
    private JButton onionButton;
    private JButton pineappleButton;
    private JButton mushroomButton;
    private JButton tomatoButton;
    private JButton checkoutButton;
    private JLabel totalTable;
    private JLabel orderContents;
    private JPanel toppingsTab;
    private JPanel toppingsLabelTab;

    ButtonGroup crustGroup = new ButtonGroup();


    public PizzaScreen(){
        setContentPane(PizzaPanel);
        setTitle("Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        setLocationRelativeTo(null);
        setVisible(true);

        crustGroup.add(thinCrustRadioButton);
        crustGroup.add(regularRadioButton);
        crustGroup.add(panRadioButton);
    }

    public static void main(String[] args) {
        new PizzaScreen();
    }
}
