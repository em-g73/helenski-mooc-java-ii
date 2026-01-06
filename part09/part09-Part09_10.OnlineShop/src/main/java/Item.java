
public class Item {
    
    private String product;
    private int qty;
    private int price;
    
    public Item(String product, int qty, int price) {
        this.product = product;
        this.qty = qty;
        this.price = price;
    }
    
    public int price() {
        return price * qty;
    }
    
    public int quantity() {
        return qty;
    }
    
    public void increaseQuantity() {
        qty += 1;
    }
    
    public String toString() {
        return product + ": " + qty;
    }
}
