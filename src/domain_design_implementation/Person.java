package domain_design_implementation;

import java.util.ArrayList;
import java.util.Objects;

public class Person {
    private String name;
    private String adress;
    private String email;
    private ArrayList<MobileDevice> devices = new ArrayList<>();


    public Person(String n, String  a, String e){
        name  =   n;
        adress=   a;
        email =   e;
    }

    public void addDevice(MobileDevice device){
        devices.add(device);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getName().equals(person.getName());
    }


    @Override
    public String toString() {
        String dev = name + " has  " + devices.size() + " devices: "+ devices;
        return dev;
    }
}
