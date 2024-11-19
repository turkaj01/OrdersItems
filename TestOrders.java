import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("mocha", 3.7);
        Item item2 = new Item("late", 3.5);
        Item item3 = new Item("drip coffee", 3.0);
        Item item4 = new Item("cappuccino", 3.4);
        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        // Print the order1 variable
        System.out.println("Order 1 for " + order1.name);
        System.out.println("Total: " + order1.total);
        System.out.println("Ready: " + order1.ready);

        order2.addItem(item1);

        // Add cappuccino to Noah's order
        order3.addItem(item4);
        // Add latte to Sam's order
        order4.addItem(item2);

        // Chinduri's order is now ready
        order1.markAsReady();
        

        // Sam ordered another latte
        order4.addItem(item2);

        // Jimmy's order now is ready
        order2.markAsReady();



    }

    

}
