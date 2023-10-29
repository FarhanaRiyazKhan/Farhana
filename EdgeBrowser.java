package week1.day1;

/*This Program passes the value by creating objects and passes input arguments to different class 'Browser1'
and called in main method to return the value by passing input arguments
 */

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calling methods from another class called 'Browser1'
		Browser1 browserStatus = new Browser1();
		browserStatus.loadUrl();

		String applicationStatus = browserStatus.launchBrowser("Chrome1");
		System.out.println(applicationStatus);

	}

}
