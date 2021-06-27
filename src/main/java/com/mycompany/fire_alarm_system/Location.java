/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;

/**
 *
 * @author rajen
 */
/**
 * Stvalue, Htvalue, Ctvalue, Scvalue, Hcvalue, Ccvalue, Sid, Hid, Cid,;
 */
public class Location {

    static float Stvalue, Htvalue, Ctvalue;
    static int Sdur, Hdur, Cdur, log, vol;
    float Scvalue, Hcvalue, Ccvalue;
    String Sid, Hid, Cid;

    Location() {
        Scvalue = 0;
        Hcvalue = 0;
        Ccvalue = 0;
        Sid = "";
        Hid = "";
        Cid = "";
    }

//    public void setLoc(Sensor s){
//        loc=s.location;
//    }
    public static void conSsensor(int duration, int value, int logt, float thres) {
        Sdur = duration;
        vol = value;
        log = logt;
        Stvalue = thres;
    }

    public static void conHsensor(int duration, int value, int logt, float thres) {
        Hdur = duration;
        vol = value;
        log = logt;
        Htvalue = thres;
    }

    public static void conCsensor(int duration, int value, int logt, float thres) {
        Cdur = duration;
        vol = value;
        log = logt;
        Ctvalue = thres;
    }

    public void setScvalue() {
        float min = Stvalue / 2;
        float max = (float) (Stvalue * 1.2);
        Scvalue = RandomGeneratorfunc.RandomGenerator(min, max);
    }

    public void setHcvalue() {
        float min = Htvalue / 2;
        float max = (float) (Htvalue * 1.2);
        Hcvalue = RandomGeneratorfunc.RandomGenerator(min, max);
    }

    public void setCcvalue() {
        float min = Ctvalue / 2;
        float max = (float) (Ctvalue * 1.2);
        Ccvalue = RandomGeneratorfunc.RandomGenerator(min, max);
    }
}
