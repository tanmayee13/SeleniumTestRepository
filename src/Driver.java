import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Driver {

	public static WebDriver driver;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
	
		String dt_path = "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/TestSuite.xlsx";
		String[][] recData = ReUsableMethods.readXlSheet(dt_path, "Sheet1");
		
		/*Java Reflection*/
		
		for(int i=1;i<recData.length;i++){
			
			String execute = recData[i][0];
			if(execute.equalsIgnoreCase("Y")){
				
				try{
					
					String chrome = recData[i][2];
					String firefox = recData[i][3];
					String ie = recData[i][4];
					if(chrome.equalsIgnoreCase("Y")){
					
				    System.setProperty("webdriver.gecko.driver", "C:/Users/tanmayee13/Desktop/Java/geckodriver-v0.18.0-win64/geckodriver.exe");
				    
					/*Launch the browser*/
					driver = new FirefoxDriver();
					}
					else if(firefox.equalsIgnoreCase("Y")){
					
					System.setProperty("webdriver.chrome.driver", "C:/Users/tanmayee13/Desktop/Java/chromedriver.exe");
				    
					/*Launch the browser*/
					driver = new ChromeDriver();
					}
					else{
						ie.equalsIgnoreCase("Y");
						System.setProperty("webdriver.ie.driver", "C:/Users/tanmayee13/Desktop/Java/IEDriverServer.exe");
					    
						/*Launch the browser*/
						driver = new InternetExplorerDriver();
						
					}
					
					String testcase =recData[i][1];
					
					ReUsableMethods.startReport(testcase, "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/Report/", "Chrome");
					
					Method tc = AmazonAutoScripts.class.getMethod(testcase);
					tc.invoke(tc);
					
					ReUsableMethods.bw.close();
					
				}catch(Exception e){
					System.out.println(e);
				}
				
			
			}
			
		}
		
		
	  AmazonAutoScripts.searchIphone6();
	  AmazonAutoScripts.listMainTab();
	  AmazonAutoScripts.validateDeptDD();
	  AmazonAutoScripts.validateHelloDD();
      AmazonAutoScripts.searchMenuDD();
	

	}

}
