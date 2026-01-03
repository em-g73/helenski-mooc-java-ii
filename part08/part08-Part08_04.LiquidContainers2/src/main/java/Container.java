
public class Container {
    
    private int amount;
    
    public Container() {
        amount = 0;
    }
    
    public int contains() {
        return amount;
    }
    
    public void add(int added) {
        if (added > 0) {
            if (amount + added > 100) {
                amount = 100;
            } else {
                amount += added;
            }
        }
    }
    
    public int move(int moved) {
        if (amount - moved < 0) {
            int move = amount;
            amount = 0;
            return move;
        }
        
        amount -= moved;
        return moved;
    }
    
    public void remove(int removed) {
        if (removed > 0) {
            if (amount - removed < 0) {
                amount = 0;
            } else {
                amount -= removed;
            }
        }
    }
    
    public String toString() {
        return amount + "/100";
    }
    
}
