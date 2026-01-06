
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> contentsPrices;
    private Map<String, Integer> contentsStock;
    
    public Warehouse() {
        contentsPrices = new HashMap<>();
        contentsStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        contentsPrices.put(product, price);
        contentsStock.put(product, stock);
    }
    
    public boolean take(String product) {
        if (contentsStock.containsKey(product)) {
            if (contentsStock.get(product) > 0) {
                contentsStock.put(product, contentsStock.get(product) - 1);
                return true;
            }
        }
        
        return false;
    }
    
    public int price(String product) {
        if (contentsPrices.containsKey(product)) {
            return contentsPrices.get(product);
        }
        
        return -99;
    }
    
    public int stock(String product) {
        if (contentsStock.containsKey(product)) {
            return contentsStock.get(product);
        }
        
        return 0;
    }
    
    public Set<String> products() {
        return contentsPrices.keySet();
    }
}
