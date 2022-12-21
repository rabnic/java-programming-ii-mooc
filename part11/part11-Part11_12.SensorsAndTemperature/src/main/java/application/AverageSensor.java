/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Nicholas
 */
public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    @Override
    public boolean isOn() {
        Predicate<Sensor> isAllOn = s -> s.isOn() == true;
        return this.sensors.stream().allMatch(isAllOn);
    }

    @Override
    public void setOn() {
        this.sensors.stream()
                .forEach(sensor -> {sensor.setOn();});
    }

    @Override
    public void setOff() {
        this.sensors.get(0).setOff();
    }

    @Override
    public int read() {
        
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        double sumReads = this.sensors.stream()
                .mapToInt(sensor -> sensor.read())
                .average()
                .getAsDouble();
        int avgTemp = (int) sumReads;
        this.readings.add(avgTemp);
        return avgTemp;
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
}
