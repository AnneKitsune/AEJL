/**
* Main class of the library.
*
* @author  Anthony Holstein
* @version 1.0
* @since   2018-08-3
*/
package austel.client;

import java.util.Date;

import austel.client.platform.Platform;
import austel.client.product.Product;

public class AustelEngine {
	
    private String access_token = "";
    private String project_name = "";
    private Platform platform;
    private Product product;
    private int size_x;
    private int size_y;
    public boolean isFullscreen = false;
    public boolean isSized = false;
    private static String OS = System.getProperty("os.name").toLowerCase();
    
    public AustelEngine(String access_token, String project_name, Platform platform, Product product) {
        this.access_token = access_token;
        this.project_name = project_name;
        this.platform = platform;
        this.product = product;
        
        System.out.println("	Made with AustelEngine 1.0 Alpha Release and AEJL(AustelEngineJavaLibrary) 1.0 beta	");
        System.out.println("		AustelEngine, a product of Nietsloh Inc. © All rights reserved. | 2016-2018");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("-> Launching: " + project_name);
        try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("-> Platform deployment: " + platform);
        try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("        -------------------------------------------------------------------------------------");
        try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        //TODO TOKEN DETECTION AND NAME DETECTION IN PHP  
        
        //TODO System for launching AustelEngine Preview on the software
        if(platform == Platform.Windows) {
        	//Running AustelEngine Preview for Windows compatible computer
        	System.out.println("Running AustelEngine Preview for Windows");
        } else if(platform == Platform.MacOS) {
        	//Running AustelEngine Preview for MacOS compatible computer
        	System.out.println("Running AustelEngine Preview for MacOS");
        } else if(platform == Platform.Universal) {
        	//Running AustelEngine Preview for Windows and MacOS
        	System.out.println("Running AustelEngine Preview for Windows and MacOS");
        } else if(platform == Platform.iOS) {
        	//Running AustelEngine Preview for iOS compatible phones
        	if(!product.toString().startsWith("iP")) {
        		System.err.println("Error: please choose an iOS devices.");
        		System.exit(0);
        		exit();
        	} else {
        		System.out.println("Running AustelEngine Preview for " + product + " on Xcode");
        		if(!isMac()) {
        			System.err.println("Error: You need MacOS for run Xcode.");
        			System.exit(0);
        			exit();
        		} else if(isSolaris() || isUnix()) {
        			System.err.println("Error: You need to have Windows or MacOS for run your project.");
        		} else {
        		/*	if() {
        				
        			}*/
        		}
        	}
        } else if(platform == Platform.Android) {
        	//Running AustelEngine Preview for Android compatible phones
        	if(product.toString().startsWith("iP")) {
        		System.err.println("Error: please choose an Android devices.");
        		System.exit(0);
        		exit();
        	} else {
        		System.out.println("Running AustelEngine Preview for Android compatible phones");
        	}
        } else if(platform == Platform.PS4) {
        	//Running AustelEngine Preview for PS4
        	if(!product.toString().startsWith("PS4")) {
        		System.err.println("Error: please choose a PS4 device.");
        		System.exit(0);
        		exit();
        	} else {
        		System.out.println("Running AustelEngine Preview for PS4");
        	}
        } else if(platform == Platform.Xbox) {
        	//Running AustelEngine Preview for Xbox
        	if(!product.toString().startsWith("Xbox")) {
        		System.err.println("Error: please choose a Xbox device.");
        		System.exit(0);
        		exit();
        	} else {
        		System.out.println("Running AustelEngine Preview for Xbox");
        	}
        } 
    } 
    
	public void setSize(int size_x, int size_y) {
		//TODO SYSTEM FOR THE SIZE OF WINDOW IN THE PREVIEW ON AUSTELENGINE
		
		this.size_x = size_x;
		this.size_y = size_y;
		isSized = true;
		
    	if(getSize_x() == 0 && getSize_y() == 0) {
    		System.err.println("Error: please set a size.");
    		System.exit(0);
    		exit();
    	} else if (getSize_x() < 100 || getSize_y() < 100) {
    		System.err.println("Error: please set a size heighter than 100 pixels.");
    		System.exit(0);
    		exit();
    	} 
	}
	
	public int getSize_x() {
		return size_x;
	}
	
	public int getSize_y() {
		return size_y;
	}
		
	public String getAccess_token() {
		return access_token;
	}
	
	public String getProject_name() { 
		return project_name;
	}
	
	public Platform getPlatform() {
		return platform;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public boolean isFullscreen() {
		return this.isFullscreen;
	}
	
	public boolean isSized() {
		return isSized;
	}
	
	public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}

	public static boolean isMac() {
		return (OS.indexOf("mac") >= 0);
	}

	public static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
	}

	public static boolean isSolaris() {
		return (OS.indexOf("sunos") >= 0);
	}

	public void setFullscreen(boolean isFullscreen) {
		this.isFullscreen = isFullscreen;
		
        if(isFullscreen() == true) {
        	if (getSize_x() > 100 && getSize_y() > 100) {
        		Date date = new Date();
        		System.out.println("/!\\ Warning: Size are disables beacause Fullscreen mode is actived. /!\\");
        		isSized = false;
        	}
        }  
	}
	
	public void exit() {
		//TODO SYSTEM FOR EXIT AUSTELENGINE IF IT RUN
		
		//URL url = new URL("http://austelclient.net/project/" + getAccess_token() + ".php");
		//URLConnection con = url.openConnection();
	}
	
	public static void main(String[] args) {
		AustelEngine austel = new AustelEngine("4957w95_23592qwdau3u", "3D Java Game with AustelEngine", Platform.PS4, Product.PS4);
		austel.setSize(1280, 720);
		austel.setFullscreen(true);
	}
}