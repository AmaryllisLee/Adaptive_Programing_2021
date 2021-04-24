package domain_design_implementation;

import java.util.ArrayList;

public class Person {
    private String name;
    private String adress;
    private String email;
    private ArrayList<MobileDevice> devices;


    public Person(String n, String  a, String e){
        name  =   n;
        adress=   a;
        email =   e;
    }

    public ArrayList<MobileDevice> getDevices() {
        return devices;
    }

    public void addDevice(MobileDevice device){
        devices.add(device);
    }

    @Override
    public String toString() {
        return name;
    }
}
