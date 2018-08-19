/**
* List of products for emulators.
*
* @author  Anthony Holstein
* @version 1.0
* @since   2018-08-3
*/
package austel.client.product;

public enum Product {
	
	//iOS Devices
	iPhone_SE("iPhone SE"), 
	iPhone_7("iPhone 7"), 
	iPhone_7_Plus("iPhone 7+"), 
	iPhone_8("iPhone 8"), 
	iPhone_8_Plus("iPhone 8+"), 
	iPhone_X("iPhone X"), 
	iPad_Pro_2ndGen("iPad Pro 2nd Gen"), 
	iPad_5thGen("iPad 5th Gen"),
	iPad_6thGen("iPad 6th Gen"),
	
	//Android Devices
	Nexus_5P("Nexus 5P"), 
	Nexus_6P("Nexus 6P"), 
	Pixel("Pixel"), 
	Pixel_XL("Pixel XL"),
	Pixel_2("Pixel 2"),
	Pixel_2_XL("Pixel 2 XL"),
	Honor_10("Honor 10"),
	Nokia_8("Nokia 8"),
	Galaxy_S7("Galaxy S7"),
	Galaxy_S7_Plus("Galaxy S7+"),
	Galaxy_S8("Galaxy S8"),
	Galaxy_S8_Plus("Galaxy S8+"),
	Galaxy_S9("Galaxy S9"),
	Galaxy_S9_Plus("Galaxy S9+"),
	
	//Xbox Device
	Xbox("Xbox"),
	
	//PS4 Device
	PS4("PS4"),
	
	//MacOS compatible devices
	MacOS("MacOS"),
	
	//Windows compatible devices
	Windows("Windows");

	private String name = "";

	Product(String name){
	    this.name = name;
	}

	 public String toString(){
	     return name;
	 }

}
