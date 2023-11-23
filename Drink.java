public class Drink extends MenuItem{

    private String name;
    private String size;
    private double price;

    public Drink(){

    }

    public Drink(String name, String size, double price){
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
