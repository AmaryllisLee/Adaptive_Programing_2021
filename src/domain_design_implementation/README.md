# Domain 
The application must be able to download and delete apps from an app store for a Mobile device of a person. A mobile device can consist of a smartphone and a tablet.
For a smartphone, the application must be able to send messages to another smartphone. In addition, a smartphone can receive phone calls.


## Domain class :
* MobileDevice
    * Tablet 
    * Smartphone
* Apps 
    *AppStore
* Person
* TextMessage
* PhoneCall - interface

## Functionalities 
The major methods in our domain design 
*downloadApp*: download app from AppStore
*deleteApp* : delete app from device
*checkBalance*: check if there is enough money in orde to purchase an app
*send*: send a textMessage to another Smartphone
*ring* (from interface): a smartphone is getting a phone call.

You can find the UML class diagram for this domain under *class_diagram_mobile_devices.pdf* 



