import javax.swing.*;
import javax.swing.text.Style;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class PizzaScreen extends JFrame {
    String size = "Small";
    String crust = "Thin Crust";
    public ArrayList<String> toppings = new ArrayList<>();
    private JPanel windowPanel;
    private JPanel itemTab;
    private JPanel checkoutTab;
    private JPanel pizzaTab;
    private JLabel buildAPizzaLabel;
    private JButton orderButton;
    private JPanel orderTab;
    private JPanel crustTab;
    private JLabel crustLabel;
    private JRadioButton thinCrustRadioButton;
    private JRadioButton regularRadioButton;
    private JRadioButton panRadioButton;
    private JLabel toppingsLabel;
    private JButton checkoutButton;
    private JLabel totalTable;
    private JPanel toppingsTab;
    private JPanel toppingsLabelTab;
    private JRadioButton cheeseRadioButton;
    private JRadioButton pepperoniRadioButton;
    private JRadioButton sausageRadioButton;
    private JRadioButton hamRadioButton;
    private JRadioButton greenPepperRadioButton;
    private JRadioButton onionRadioButton;
    private JRadioButton tomatoRadioButton;
    private JRadioButton mushroomRadioButton;
    private JRadioButton pineappleRadioButton;
    private JPanel sizePanel;
    private JLabel sizeLabel;
    private JRadioButton smallRadioButton;
    private JRadioButton mediumRadioButton;
    private JRadioButton largeRadioButton;
    private JRadioButton extraLargeRadioButton;
    private JTabbedPane orderPanel;
    private JPanel orderContents;
    private JTextArea order1Text;
    private JTextArea order2Text;
    private JTextArea order3Text;
    private JTextArea order4Text;
    private JTextArea order5Text;
    private JButton x1;
    private JButton x2;
    private JButton x3;
    private JButton x4;
    private JButton x5;
    private JScrollPane itemPanel;

    ButtonGroup crustGroup = new ButtonGroup();


    public PizzaScreen(){
        setState(JFrame.MAXIMIZED_BOTH);
        setContentPane(windowPanel);
        setTitle("Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(550,300);
        setLocationRelativeTo(null);
        setVisible(true);

        double width = windowPanel.getWidth();
        double height = windowPanel.getHeight();

        Font font = new Font("Plain", Font.PLAIN, (int)width/25);

        setMinimumSize(new Dimension(1920, 1080));

        crustGroup.add(thinCrustRadioButton);
        crustGroup.add(regularRadioButton);
        crustGroup.add(panRadioButton);
        thinCrustRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crust = "Thin Crust";
            }
        });

        regularRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crust = "Regular Crust";
            }
        });

        panRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crust = "Pan Crust";
            }
        });

        smallRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                size = "Small";
            }
        });

        mediumRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                size = "Medium";
            }
        });

        largeRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                size = "Large";
            }
        });

        extraLargeRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                size = "Extra Large";
            }
        });


        cheeseRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toppingProcess(cheeseRadioButton, "Cheese");
            }
        });

        pepperoniRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toppingProcess(pepperoniRadioButton, "Pepperoni");
            }
        });

        sausageRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toppingProcess(sausageRadioButton, "Sausage");
            }
        });

        hamRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toppingProcess(hamRadioButton, "Ham");
            }
        });

        greenPepperRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toppingProcess(greenPepperRadioButton, "Green Pepper");
            }
        });

        onionRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toppingProcess(onionRadioButton, "Onion");
            }
        });

        tomatoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toppingProcess(tomatoRadioButton, "Tomato");
            }
        });

        mushroomRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toppingProcess(mushroomRadioButton, "Mushroom");
            }
        });

        pineappleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toppingProcess(pineappleRadioButton, "Pineapple");
            }
        });


        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderControl.order.add(new Pizza(size, crust, toppings));

                orderRefactor();
            }
        });


        x1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderControl.order.remove(0);
                orderRefactor();
            }
        });

        x2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderControl.order.remove(1);
                orderRefactor();
            }
        });

        x3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderControl.order.remove(2);
                orderRefactor();
            }
        });

        x4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderControl.order.remove(3);
                orderRefactor();
            }
        });

        x5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderControl.order.remove(4);
                orderRefactor();
            }
        });
    }

    public static void main(String[] args) {
        new PizzaScreen();
    }

    public void toppingProcess(JRadioButton button, String topping){
        if(button.isSelected() && (toppings.size()) < 5 ){
            toppings.add(topping);
        } else {
            toppings.remove(topping);
            button.setSelected(false);
        }
    }

    public void orderRefactor(){
        order1Text.setText(orderName(0));
        order2Text.setText(orderName(1));
        order3Text.setText(orderName(2));
        order4Text.setText(orderName(3));
        order5Text.setText(orderName(4));
    }



    public String orderName(int i){
        String name = "";
        if(OrderControl.order.getAt(i) != null){
            name = OrderControl.order.getAt(i).toString();
        }
        return name;
    }
}
