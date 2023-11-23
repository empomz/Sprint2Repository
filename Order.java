import java.awt.*;
import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items;

    public Order(){
        items = new ArrayList<>();
    };

    public void add(MenuItem item){
        items.add(item);
    }

    public void remove(int i){

        if(items.size() > i){
            items.remove(items.get(i));
        }

    }

    public int getSize(){
        return items.size();
    }

    public MenuItem getAt(int i){
        if(items.size() > i){
            return items.get(i);
        }

        else return null;
    }
}
