/**
* List of platforms and os.
*
* @author  Anthony Holstein
* @version 1.0
* @since   2018-08-3
*/
package austel.client.platform;

public enum Platform {
	
	Windows ("Windows"),
	MacOS ("MacOS"),
	Universal ("Universal"),
	iOS ("iOS"),
	Android ("Android"),
	Xbox ("Xbox"),
	PS4 ("PS4");

	private String name = "";

	Platform(String name){
	    this.name = name;
	}

	 public String toString(){
	     return name;
	 }
}
