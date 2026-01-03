
import java.util.HashMap;


public class IOU {
    
    private HashMap<String,Double> moneyOwed;
    
    public IOU() {
        moneyOwed = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        moneyOwed.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if (moneyOwed.containsKey(toWhom)) {
            return moneyOwed.get(toWhom);
        }
        
        return 0;
    }
}
