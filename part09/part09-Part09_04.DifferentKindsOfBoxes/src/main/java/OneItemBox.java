
import java.util.ArrayList;

public class OneItemBox extends Box {
    
    private final int capacity;
    private ArrayList<Item> containedItems;
    
    public OneItemBox() {
        super();
        containedItems = new ArrayList<>();
        capacity = 1;
    }

    @Override
    public void add(Item item) {
        if (containedItems.size() < capacity) {
            this.containedItems.add(item);
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
