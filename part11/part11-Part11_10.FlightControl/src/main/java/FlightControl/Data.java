/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;

import java.util.HashMap;

public class Data {
    
    private HashMap<String, Airplane> planes;
    private HashMap<String, Flight> flights;
    
    public Data() {
        planes = new HashMap<>();
        flights = new HashMap<>();
    }
    
    public Airplane getPlane(String id) {
        return planes.get(id);
    }
    
    public HashMap<String, Airplane> getPlanes() {
        return planes;
    }
    
    public HashMap<String, Flight> getFlights() {
        return flights;
    }
    
    public void addPlane(String id, int capacity) {
        planes.put(id, new Airplane(id, capacity));
    }
    
    public void addFlight(String planeId, String departureId, String targetId) {   
        flights.put(departureId + "-" + targetId, new Flight(planes.get(planeId), departureId, targetId));
    }
}
