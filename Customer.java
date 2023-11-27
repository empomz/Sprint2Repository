import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Customer extends  JFrame {
    public double price=0;
    public String size;
    public ArrayList<String> listForL1=new ArrayList<>();
    public JButton pepsiButton;
    private JButton dietPepsiButton;
    private JButton crushButton;
    private JPanel CustomerForm;
    private JButton drinksButton;
    private JButton orderButton;
    private JButton sidesButton;
    private JButton pizzaButton;
    private JButton dietCrushButton;
    private JButton mugButton;
    private JButton dietMugButton;
    private JButton starryButton;
    private JButton tropicanaLemonadeButton;
    private JLabel Items;
    public JList list1;
    private JButton Checkout;

    private JCheckBox Small;
    private JComboBox comboBox1;
    private JLabel Total;
    private JButton xButton;

    public DefaultListModel list2 = new DefaultListModel();

    public double total=0;

    private Customer(){

        pepsiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int comboSelected = comboBox1.getSelectedIndex();
                if (comboSelected != 0) {
                    list2.addElement(size + " Pepsi " + "$" + price);
                    list1.setModel(list2);
                    total+=price;
                    Total.setText("Total: " + total);
                    System.out.println();
                }
            }
        });
        dietPepsiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int comboSelected = comboBox1.getSelectedIndex();
                if (comboSelected != 0) {
                    list2.addElement(size + " Pepsi " + "$" + price);
                    list1.setModel(list2);
                    total += price;
                    Total.setText("Total: " + total);
                    System.out.println();
                }
            }
        });

        crushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int comboSelected = comboBox1.getSelectedIndex();
                if (comboSelected != 0) {
                    list2.addElement(size + " Pepsi " + "$" + price);
                    list1.setModel(list2);
                    total+=price;
                    Total.setText("Total: " + total);
                    System.out.println();
                }
            }
        });

        dietCrushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int comboSelected = comboBox1.getSelectedIndex();
                if (comboSelected != 0) {
                    list2.addElement(size + " Pepsi " + "$" + price);
                    list1.setModel(list2);
                    total+=price;
                    Total.setText("Total: " + total);
                    System.out.println();
                }
            }
        });

        mugButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int comboSelected = comboBox1.getSelectedIndex();
                if (comboSelected != 0) {
                    list2.addElement(size + " Pepsi " + "$" + price);
                    list1.setModel(list2);
                    total+=price;
                    Total.setText("Total: " + total);
                    System.out.println();
                }
            }
        });

        dietMugButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int comboSelected = comboBox1.getSelectedIndex();
                if (comboSelected != 0) {
                    list2.addElement(size + " Pepsi " + "$" + price);
                    list1.setModel(list2);
                    total+=price;
                    Total.setText("Total: " + total);
                    System.out.println();
                }
            }
        });

        starryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int comboSelected = comboBox1.getSelectedIndex();
                if (comboSelected != 0) {
                    list2.addElement(size + " Pepsi " + "$" + price);
                    list1.setModel(list2);
                    total+=price;
                    Total.setText("Total: " + total);
                    System.out.println();
                }
            }
        });

        tropicanaLemonadeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int comboSelected = comboBox1.getSelectedIndex();
                if (comboSelected != 0) {
                    list2.addElement(size + " Pepsi " + "$" + price);
                    list1.setModel(list2);
                    total+=price;
                    Total.setText("Total: " + total);
                    System.out.println();
                }
            }
        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox1.actionPerformed(e);
                int comboSelected = comboBox1.getSelectedIndex();
                if(comboSelected==1) {
                    price = 1;
                    size = "Small";
                }
                if(comboSelected==2) {
                    price = 2;
                    size = "Medium";
                }
                if(comboSelected==3) {
                    price = 3;
                    size = "Large";
                }
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    list2.remove(list2.size()-1);
                    double currentPrice =price;
                    total-=price;
                    Total.setText("Total: "+total);

            }
        });
    }

    public static void main(String[] args) {
        Customer C = new Customer();
        C.setContentPane(C.CustomerForm);
        C.setTitle("Drinks");
        C.setSize(10000,5000);
        C.setVisible(true);
        C.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  }
