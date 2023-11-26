import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginScreen extends JFrame{

    private JPanel windowPanel;
    private JLabel Mom_N_Pops;
    private JLabel address;
    private JButton login;
    private JTabbedPane infoSection;
    private JPanel loginButtons;
    private JPanel storeInfo;
    private JTextField username;
    private JPasswordField passwordPasswordField;
    private JLabel logo;
    private JButton createAccount;
    private JButton orderAsGuest;
    private JLabel pickupDisclaimer;
    private JLabel forgotPassword;
    private JLabel phoneNumber;
    private JLabel sunThurHours;
    private JLabel satSunHours;

    private String myusername;
    private String mypassword;

    public LoginScreen() {

        Customer myCustomer = new Customer();
        PizzaScreen pizzaScreen;
        setState(JFrame.MAXIMIZED_BOTH);
        setContentPane(windowPanel);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(550, 330);
        setLocationRelativeTo(null);
        setVisible(true);

        double width = windowPanel.getWidth();
        double height = windowPanel.getHeight();

        Font font = new Font("Plain", Font.PLAIN, (int) width / 25);

        setMinimumSize(new Dimension(1920, 1080));

        username.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                myusername = username.getText();
            }
        });
        passwordPasswordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mypassword = passwordPasswordField.getText();
            }
        });

        createAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        orderAsGuest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource()==orderAsGuest) {
                    dispose();
                    PizzaScreen myPizzaScreen = new PizzaScreen();
                }
            }
        });

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==login) {
                    dispose();
                    PizzaScreen myPizzaScreen = new PizzaScreen();
                }
            }
        });

    }
    public static void main(String[] args){

        new LoginScreen();

    }

}
