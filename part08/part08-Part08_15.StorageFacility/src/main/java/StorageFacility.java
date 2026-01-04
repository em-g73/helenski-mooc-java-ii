
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        
        storage.get(unit).add(item);
    }
    
    public void remove(String unit, String item) {
        if (storage.containsKey(unit)) {
            storage.get(unit).remove(item);
        }
        
        if (storage.get(unit).isEmpty()) {
            storage.remove(unit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        
        for (String unit: storage.keySet()) {
            units.add(unit);
        }
        
        return units;
    }
    
    public ArrayList<String> contents(String unit) {
        if (storage.containsKey(unit)) {
            return storage.get(unit);
        }
        
        return new ArrayList<>();
    }
    
}
