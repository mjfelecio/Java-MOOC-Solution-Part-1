import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    private int totalWeight = 0;


    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight() {
        return totalWeight;
    }

    public void addItem(Item item) {

        // if the sum of the total weight and the new item does not exceed 
        // or is equal the maximum weight
        // add the item to the Suitcase
        if (totalWeight + item.getWeight() <= maximumWeight) {
            items.add(item);
            totalWeight += item.getWeight();
        }
    }

    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviestItem = items.get(0);

        for (Item item: items) {

            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }


    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";

        } else if (items.size() == 1) {
            return items.size() + " item (" + totalWeight + " kg)";

        }


        return items.size() + " items (" + totalWeight + " kg)";
    }
}