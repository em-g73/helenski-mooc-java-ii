/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;

public class Flight {
    
    private Airplane plane;
    private String departureId;
    private String targetId;
    
    public Flight(Airplane plane, String departureId, String targetId) {
        this.plane = plane;
        this.departureId = departureId;
        this.targetId = targetId;
    }
    
    public String getId() {
        return plane.getId();
    }
    
    public int getCapacity() {
        return plane.getCapacity();
    }
    
    public String getDepartureId() {
        return departureId;
    }
    
    public String getTargetId() {
        return targetId;
    }
    
    @Override
    public String toString() {
        return getId() + " (" + getCapacity() + " capacity) (" + departureId + "-" + targetId + ")";
    }
}
