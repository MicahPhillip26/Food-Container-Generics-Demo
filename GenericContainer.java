// Generic container class
import java.util.ArrayList;
import java.util.List;

public class GenericContainer<T extends Food> {
    private List<T> items;

    public GenericContainer() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
        System.out.println(item.getName() + " added to the container.");
    }

    public void displayItems() {
        System.out.println("Items in the container:");
        for (T item : items) {
            System.out.println("- " + item);
        }
    }
}
