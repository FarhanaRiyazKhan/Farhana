package week1.day1;

/*Created Program with normal methods by passing input Arguments
and called in main method to return the value
 */

public class Browser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Created objects to call methods
		Browser1 operatingSystem = new Browser1();
		String browserStatus = operatingSystem.launchBrowser("Chrome");
		System.out.println(browserStatus);

		operatingSystem.loadUrl();
	}

	// Normal Method
	public String launchBrowser(String browserName) {
		String browserStatus = "Browser launched successfully";
		return browserStatus;

	}

	//Normal Method
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

}

