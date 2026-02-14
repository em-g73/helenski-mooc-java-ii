/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageSensor implements Sensor {
    
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }
    
    @Override
    public boolean isOn() {
        boolean isOn = true;
        
        for (Sensor sensor: sensors) {
            if (!sensor.isOn()) {
                isOn = false;
                break;
            }
        }
        
        return isOn;
    }

    @Override
    public void setOn() {
        sensors.stream()
                .forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        sensors.get(new Random().nextInt(sensors.size())).setOff();
    }

    @Override
    public int read() {
        int reading = sensors.stream()
                .map(s -> s.read())
                .reduce(0, (a, b) -> a + b) / sensors.size();
        
        readings.add(reading);
        
        return reading;
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return readings;
    }
    
}
