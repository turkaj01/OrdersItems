import java.util.ArrayList;

public class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item>items;

    public Order(String name) {
        this.name = name;
        this.total=0.0;
        this.ready=false;
        this.items= new ArrayList<>();
    }
    
    
    public void markAsReady() {
        this.ready = true;
        System.out.println("your order is ready");
    }


    public void addItem(Item item1) {
        items.add(item1);       
        total += item1.price;
 }

}
