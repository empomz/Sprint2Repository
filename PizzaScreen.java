import javax.swing.*;


public class PizzaScreen extends JFrame {
    private JPanel PizzaPanel;

    public PizzaScreen(){
        setContentPane(PizzaPanel);
        setTitle("Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PizzaScreen();
    }
}
