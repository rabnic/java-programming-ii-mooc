/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Nicholas
 */
public class StandardSensor implements Sensor {
    
    private final boolean isSensorOn = true;
    private int num;
    
    public StandardSensor(int number) {
        this.num = number;
    }

    @Override
    public boolean isOn() {
        return this.isSensorOn;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        return this.num;
    }
    
}
