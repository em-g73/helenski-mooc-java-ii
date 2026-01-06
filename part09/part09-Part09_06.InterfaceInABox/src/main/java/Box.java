
import java.util.ArrayList;

public class Box implements Packable {
    
    private double capacity;
    private ArrayList<Packable> contents;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.contents = new ArrayList<>();
    }
    
    public double weight() {
        double total = 0;
        
        for (Packable item: contents) {
            total += item.weight();
        }
        
        return total;
    }
    
    public void add(Packable item) {
        if (weight() + item.weight() <= capacity) {
            contents.add(item);
        }
    }
    
    public String toString() {
        return "Box: " + contents.size() + " items, total weight " + weight() + " kg";
    }
}
