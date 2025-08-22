public class GenericsDemo {
    public static void main(String[] args) {
        // Creating instances of various food items
        Fruit grape = new Fruit("Grape");
        Fruit orange = new Fruit("Orange");
        Vegetable onion = new Vegetable("Onion");
        Vegetable spinach = new Vegetable("Spinach");
        Bread wholegrain = new Bread("wholegrain");
        Bread sourdough = new Bread("Sourdough");

        // Using the generic container to hold food items
        GenericContainer<Food> foodContainer = new GenericContainer<>();
        foodContainer.addItem(grape);
        foodContainer.addItem(orange);
        foodContainer.addItem(onion);
        foodContainer.addItem(spinach);
        foodContainer.addItem(wholegrain);
        foodContainer.addItem(sourdough);

        // Displaying all items in the container
        foodContainer.displayItems();
    }
}

