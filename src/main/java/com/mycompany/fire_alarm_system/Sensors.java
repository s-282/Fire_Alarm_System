/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;
/**
 *
 * @author AADHARSH
 */
import java.io.Serializable;

public class Sensors implements Serializable {
    public String SensorID, location, SensorType;
    public int floorno;
    public static float thresholdCO;
    public static float thresholdSmoke;
    public static float thresholdHeat;
    public static int duration;
    public static int volume;
    public static int logint;
    
    
    @Override
    public String toString() {
        return new StringBuffer(" Sensor ID : ").append(this.SensorID)
                .append(" Location : ").append(this.location).append("SensorType : ").append(this.SensorType).append(" Floorno : ").append(this.floorno).toString();
    }
    
}
