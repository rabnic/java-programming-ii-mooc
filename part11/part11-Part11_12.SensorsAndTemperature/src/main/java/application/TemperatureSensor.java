/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Nicholas
 */
public class TemperatureSensor implements Sensor {
    
    private boolean isSensorOn;
    
    public TemperatureSensor() {
        this.isSensorOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isSensorOn;
    }

    @Override
    public void setOn() {
        this.isSensorOn = true;
    }

    @Override
    public void setOff() {
        this.isSensorOn = false;
    }

    @Override
    public int read() {
        if (!this.isSensorOn) {
            throw new IllegalStateException();
        }
        return  new Random().nextInt(61) - 30;
    }
    
}
