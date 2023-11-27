import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.font.*;
import java.util.List;
import java.text.DecimalFormat;


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
        SwingUtilities.invokeLater(PizzaOrderApp::createAndShowGUI);
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
class PizzaOrderApp {
    private static final int screenWidth = 1920;
    private static final int screenHeight = 1080;
    private static final Color backgroundColor = new Color(246, 243, 235);
    //private static final Color backgroundColor = new Color(255,0,0);
    private static final int buttonWidth = 480;
    private static final int buttonHeight = 150;
    private static final int labelWidth = 1140 - 490;
    private static final int labelHeight = 200;
    private static final int labelXPosition = 100;
    private static final int labelYPosition = 250;
    private static final int labelOffset = 275;
    private static final double breadsticksPrice = 4.00;
    private static final double breadsticksBitesPrice = 2.00;
    private static final double bigChocolateChipCookiePrice = 4.00;
    private static List<OrderItem> orderItems = new ArrayList<>();
    private static List<JButton> cancelButtons = new ArrayList<>();
    private static JLabel orderDisplayLabel;
    private static JLabel totalLabel;


    //public static void main(String[] args) {
        //SwingUtilities.invokeLater(PizzaOrderApp::createAndShowGUI);
    //}

    static void createAndShowGUI() {
        JFrame frame = new JFrame("Pizza Order App");
        frame.setSize(screenWidth, screenHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //background color
                g.setColor(backgroundColor);
                g.fillRect(0, buttonHeight + 4, buttonWidth * 3, getHeight() - buttonHeight + 4);
                //vertical line splitting order area and item selection
                g.setColor(Color.BLACK);
                g.fillRect(buttonWidth * 3 - 2, 0, 3, 1080);
                //horizontal line above checkout button
                g.fillRect(buttonWidth * 3 - 2, 889, buttonWidth + 5, 4);
                //horizontal line below order button
                g.fillRect(0, buttonHeight, getWidth(), 4);
                //vertical line bordering the right side
                g.fillRect(buttonWidth * 4 - 19, 0, 3, 1080);
                g.fillRect(buttonWidth * 3 + 18, buttonHeight + 60, buttonWidth - 50, 4);
            }
        };
        contentPane.setLayout(null);

        //buttons
        JButton pizzaButton = createImageButton("pizzabutton.jpg", 0, 0);
        JButton sidesButton = createImageButton("sidesbutton.jpg", buttonWidth, 0);
        JButton drinksButton = createImageButton("drinksbutton.jpg", 2 * buttonWidth, 0);
        JButton checkoutButton = createImageButton("checkoutbutton.jpg", 3 * buttonWidth, 892);
        JButton addToOrderButton1 = createAddToOrderImageButton("addtoorderbutton.jpg", labelXPosition + labelWidth, labelYPosition);
        JButton addToOrderButton2 = createAddToOrderImageButton("addtoorderbutton.jpg", labelXPosition + labelWidth, labelYPosition + labelOffset);
        JButton addToOrderButton3 = createAddToOrderImageButton("addtoorderbutton.jpg", labelXPosition + labelWidth, labelYPosition + labelOffset + labelOffset);

        //listeners for add to order buttons
        addToOrderButton1.addActionListener(new AddToOrderActionListener("Breadsticks", breadsticksPrice));
        addToOrderButton2.addActionListener(new AddToOrderActionListener("Breadstick Bites", breadsticksBitesPrice));
        addToOrderButton3.addActionListener(new AddToOrderActionListener("Big Chocolate Chip Cookie", bigChocolateChipCookiePrice));

        //static text:
        Font heavitasFont = new Font("Heavitas", Font.PLAIN, 50);
        Font montFont = new Font("Mont", Font.PLAIN, 40);
        Font orderDisplayLabelMontFont = new Font("Mont", Font.PLAIN, 25);
        JLabel itemsLabel = new JLabel("Items");
        itemsLabel.setBounds(3 * buttonWidth + 15, buttonHeight + 20, buttonWidth / 3, 40);
        itemsLabel.setForeground(Color.BLACK);
        itemsLabel.setFont(montFont);
        JLabel costLabel = new JLabel("Cost");
        costLabel.setBounds(4 * buttonWidth - 120, buttonHeight + 20, buttonWidth / 3, 40);
        costLabel.setForeground(Color.BLACK);
        costLabel.setFont(montFont);
        totalLabel = new JLabel("TOTAL: ");
        totalLabel.setBounds(3 * buttonWidth + 15, 819, buttonWidth, 70);
        totalLabel.setForeground(Color.BLACK);
        totalLabel.setFont(heavitasFont);

        //images for non-clickable stuff
        JLabel breadsticks = new JLabel();
        JLabel breadstickBites = new JLabel();
        JLabel chocolateChipCookie = new JLabel();
        JLabel order = new JLabel();
        //setting up position
        breadsticks.setBounds(labelXPosition, labelYPosition, labelWidth, labelHeight);
        breadstickBites.setBounds(labelXPosition, labelYPosition + labelOffset, labelWidth, labelHeight);
        chocolateChipCookie.setBounds(labelXPosition, labelYPosition + labelOffset + labelOffset, labelWidth, labelHeight);
        order.setBounds(3 * buttonWidth, 0, buttonWidth, buttonHeight);
        //ignoring everything behind, set up images to be used
        ImageIcon breadsticksImageIcon = new ImageIcon("breadsticksButton.jpg");
        ImageIcon breadstickBitesImageIcon = new ImageIcon("breadstickbitesbutton.jpg");
        ImageIcon chocolateChipCookieImageIcon = new ImageIcon("chocolatechipcookiebutton.jpg");
        ImageIcon orderImageIcon = new ImageIcon("orderbutton.jpg");
        breadsticks.setIcon(breadsticksImageIcon);
        breadstickBites.setIcon(breadstickBitesImageIcon);
        chocolateChipCookie.setIcon(chocolateChipCookieImageIcon);
        order.setIcon(orderImageIcon);

        //create order display stuff
        orderDisplayLabel = new JLabel("<html>");
        orderDisplayLabel.setBounds(buttonWidth * 3 + 10, 225, buttonWidth, 1080 - buttonHeight * 2);
        orderDisplayLabel.setForeground(Color.BLACK);
        orderDisplayLabel.setVerticalAlignment(SwingConstants.TOP);
        orderDisplayLabel.setFont(orderDisplayLabelMontFont);

        //cancel buttons
        cancelButtons.clear();
        for(int i = 0; i < 10; i++){
            JButton cancelButton = createCancelButton("cancelbutton.jpg", buttonWidth * 4 - 75, 225 + i * 34);
            cancelButtons.add(cancelButton);
            contentPane.add(cancelButton);
        }

        //add everything
        contentPane.add(pizzaButton);
        contentPane.add(sidesButton);
        contentPane.add(drinksButton);
        contentPane.add(checkoutButton);
        contentPane.add(itemsLabel);
        contentPane.add(costLabel);
        contentPane.add(totalLabel);
        contentPane.add(breadsticks);
        contentPane.add(breadstickBites);
        contentPane.add(chocolateChipCookie);
        contentPane.add(order);
        contentPane.add(addToOrderButton1);
        contentPane.add(addToOrderButton2);
        contentPane.add(addToOrderButton3);
        contentPane.add(orderDisplayLabel);

        frame.setContentPane(contentPane);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JButton createImageButton(String imagePath, int x, int y) {
        JButton button = new JButton();
        button.setBounds(x, y, buttonWidth, buttonHeight);

        //load the image from the specified path
        ImageIcon icon = new ImageIcon(imagePath);
        Image image = icon.getImage().getScaledInstance(buttonWidth, buttonHeight, Image.SCALE_SMOOTH);
        button.setIcon(new ImageIcon(image));

        button.setLayout(null);
        button.setHorizontalAlignment(SwingConstants.CENTER);

        return button;
    }
    private static JButton createAddToOrderImageButton(String imagePath, int x, int y) {
        JButton button = new JButton();
        button.setBounds(x, y, 480, 200);

        //load the image from the specified path
        ImageIcon icon = new ImageIcon(imagePath);
        Image image = icon.getImage().getScaledInstance(480, 200, Image.SCALE_SMOOTH);
        button.setIcon(new ImageIcon(image));

        button.setLayout(null);
        button.setHorizontalAlignment(SwingConstants.CENTER);

        return button;
    }

    private static JButton createCancelButton(String imagePath, int x, int y){
        JButton button = new JButton();
        button.setBounds(x, y, 28, 28);
        ImageIcon icon = new ImageIcon(imagePath);
        Image image = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        button.setIcon(new ImageIcon(image));

        button.setLayout(null);
        button.setHorizontalAlignment(SwingConstants.CENTER);

        button.addActionListener(new CancelButtonActionListener());

        return button;
    }

    private static class CancelButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JButton sourceButton = (JButton) e.getSource();
            int index = cancelButtons.indexOf(sourceButton);
            if(index >= 0 && index < orderItems.size()){
                orderItems.remove(index);
                updateOrderDisplayLabel();
            }
        }
    }

    private static class AddToOrderActionListener implements ActionListener{
        private final String itemName;
        private final double itemPrice;

        public AddToOrderActionListener(String itemName, double itemPrice){
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }

        @Override
        public void actionPerformed(ActionEvent e){
            orderItems.add(new OrderItem(itemName, itemPrice));
            updateOrderDisplayLabel();
        }
    }
    private static void updateOrderDisplayLabel(){
        StringBuilder text = new StringBuilder("<html>");
        double total = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        for(OrderItem item : orderItems){
            text.append(item.getName()).append(": $").append(decimalFormat.format(item.getPrice())).append("<br>");
            total += item.getPrice();
        }

        totalLabel.setText("TOTAL: $" + decimalFormat.format(total));
        orderDisplayLabel.setText(text.toString());
    }
    private static class OrderItem {
        private final String name;
        private final double price;

        public OrderItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}