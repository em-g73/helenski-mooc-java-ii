
import java.util.ArrayList;


public class MisplacingBox extends Box {
    
    private ArrayList<Item> containedItems;
    
    public MisplacingBox() {
        containedItems = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        containedItems.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
    
}
