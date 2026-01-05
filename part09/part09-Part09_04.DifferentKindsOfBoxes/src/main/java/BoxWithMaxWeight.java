
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    
    private ArrayList<Item> containedItems;
    private final int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.containedItems = new ArrayList<>();
    }
    
    public int getWeight() {
        int weight = 0;
        
        for (Item item: containedItems) {
            weight += item.getWeight();
        }
        
        return weight;
    }
    
    @Override
    public void add(Item item) {
        if (item.getWeight() + this.getWeight() <= capacity) {
            this.containedItems.add(item);
        }
    }
    
    @Override
    public void add(ArrayList<Item> items) {
        int sum = 0;
        
        for (Item item : items) {
            if (item.getWeight() + sum + this.getWeight() <= capacity) {
                this.containedItems.add(item);
            }
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item value: containedItems) {
            if (value.equals(item)) {
                return true;
            }
        }
        
        return false;
    }
}
