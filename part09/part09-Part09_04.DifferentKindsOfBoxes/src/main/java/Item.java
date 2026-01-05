
import java.util.Objects;


public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public boolean equals(Item compare) {
        if (name.equals(compare.getName())) {
            return true;
        }
        
        return false;
    }
}
