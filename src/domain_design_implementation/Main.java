package domain_design_implementation;

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
        SmartPhone iphone = new SmartPhone("Apple", "Iphone", 799.99, "0000", appstore,"57896769", "TMobile");
        SmartPhone android= new SmartPhone("Android", "Samsung", 899.99, "1111", playstore,"52343443", "Vodafone");
        Tablet ipad = new Tablet("Apple", "Ipad", 599.99, "2222", appstore);

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
        TextMessage text = new TextMessage("Hoii", "Hooi dit is "+ p1.getName() + "en ik stuur deze bericht." );
        iphone.send(android, "Hoii", "Hooi dit is "+ p1.getName() + "en ik stuur deze bericht.");

        // print log
        System.out.println(android.getLog());









    }

}
