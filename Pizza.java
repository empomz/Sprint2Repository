import java.util.ArrayList;

public class Pizza extends MenuItem{
    private double price;
    private String size;
    private String crust;
    private ArrayList<String> toppings;


    public Pizza(String size, String crust, ArrayList<String> toppings){
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
    }

    @Override
    public String toString(){

        String toppingsText = "";

        for(int i = 0; i < toppings.size(); i++){
            toppingsText = toppingsText + String.format("   -%s%n", toppings.get(i));
        }

        String orderText = String.format("%s Pizza, %s%n%s", size, crust, toppingsText);

        return orderText;
    }
}
