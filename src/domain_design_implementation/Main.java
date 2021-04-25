package domain_design_implementation;

import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args) {

        /*
         The main will consist an example of the classes. The implemenation will show the realisation of the classes en methods of the UML class diagram for mobile Devices.
         */

        // First of all, let's define some apps for our appstore
        Apps app1 = new Apps("Forest", 0.99, 2.0);
        Apps app2 = new Apps("Notability", 9.99, 2.1);

        // Now lets define an 2 appstores for our devices
        AppStore appstore = new AppStore("Appstore", 0.0,  2.9, "username1", "12345", 10.00); //define app store for our devices
        AppStore playstore = new AppStore("us2", 0.0, 2.0, "username2", "password", 0.0);

        // Add apps to appstore and playstore, available apps to download
        appstore.addApps(app1);
        appstore.addApps(app2);

        playstore.addApps(app1);
        playstore.addApps(app2);

        // Define the devices.
        SmartPhone iphone = new SmartPhone("Apple", "Iphone", 799.99, "0000","KtVFhWQp", appstore,"57896769", "TMobile");
        SmartPhone android= new SmartPhone("Android", "Samsung", 899.99, "1111","L5sanriR", playstore,"52343443", "Vodafone");
        Tablet ipad = new Tablet("Apple", "Ipad", 599.99, "2222", "5FBbniJf", appstore);

        // Define Bob en Jaap ( Person objects)
        Person p1 = new Person("Bob", "Utrecht", "bob@hotmail.com");
        Person p2 = new Person("Jaap", "Amsterdam", "jaap@hotmail.com");

        // assign iphone and ipad to bob (p1)
        p1.addDevice(iphone);
        p1.addDevice(ipad);

        // assign android to jaap (p2)
        p2.addDevice(android);;

        System.out.println(p1);
        System.out.println(p2);

        // Bob (p1) want to dowload app1 and Jaap want to download app2

        // Downloading app
        System.out.println(iphone.downloadApp(app1));
        System.out.println(android.downloadApp(app2));

        //new line
        System.out.println("\n");

        // test interface
        // bob is getting a call
        System.out.println(p1.getName() + " is getting a call"); // print p1- toString of Person
        System.out.println(iphone.ring());// print interface

        // Testing Textmessage
        // Bob (p1) sends a text message from his iphone to Jaap's android
        iphone.send(android, "Hoii", "Hooi dit is "+ p1.getName() + "en ik stuur deze bericht.");

        // print log
        System.out.println(android.getLog());

        System.out.println("\n");
        // Testing equals method

        // Mobile devices
        System.out.println("Testing equals method" + "\n");
        System.out.println(iphone.equals(android)); // should return false
        SmartPhone iphone2 = new SmartPhone("Apple", "Iphone", 799.99, "0000","SnZhS2oe", appstore,"5095803", "TMobile");
        System.out.println(iphone.equals(iphone2)); // should also return false
        System.out.println(android.equals(android));// should return true

        // Apps : compare apps based on name and version
        Apps app1_new= new Apps("Forest", 0.99, 2.1); // compare app1 to this "newer verion of app, should return false
        System.out.println(app1.equals(app1_new));

        System.out.println("\n");

        // TextMessage
        TextMessage spam = new TextMessage("SPAM", "SPAM message" ); // create TextMessage to compare

        // Sendd a spam message to android
        iphone.send(android, "SPAM", "SPAM message");
        // ccompare every textMessage from phone 1 to spam, check if log of phone 1 contains spam
        for (String i : android.getLog().keySet()){
            if(android.getLog().get(i).equals(spam)){
                System.out.println("Message from "+ i + " is a spam");
            }
        }

        // Person
        if (p1.equals(p2)) {
            System.out.println("They're the same person");
        }else{
            System.out.println(p1.getName() +" is not "+ p2.getName());
        }









    }

}
