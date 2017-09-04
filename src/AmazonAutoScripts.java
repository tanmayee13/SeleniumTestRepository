import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class AmazonAutoScripts extends ReUsableMethods{

	/* Name Of the method: searchIphone6
	 * Brief Description: Enter text in th etextbox, search the product and add it to the cart.
	 * Arguments:
	 * Created by: Tanmayee Tankasali
	 * Creation Date: Sep 2 2017
	 * Last Modified: Sep 3 2017
	 * */
	
	public static void searchIphone6() throws Exception {
		try{

			/*path for textdata*/
			String dt_path = "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/amazonUrl.xlsx";
			String[][] recData = readXlSheet(dt_path, "Sheet1");

			String URL = recData[1][1];
			String searchTxt = recData[2][1];

			/*path for object repository*/
			String or_path = "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/objectRepository.xlsx";
			String[][] recDataOr = readXlSheet(or_path, "Sheet1");

			String objsrchTxt = recDataOr[1][0];
			String objsrchBtn = recDataOr[2][0];
			String objIphone6 = recDataOr[3][0];
			String objAddCart = recDataOr[4][0];
			String searchTxtXpath = recDataOr[1][2];
			String searchBtnXpath = recDataOr[2][2];
			String iphone6Xpath = recDataOr[3][2];
			String addCartXpath = recDataOr[4][2];

			/*Get the URL*/
			driver.get(URL);
			driver.manage().window().maximize();

			/*Enter text*/
			WebElement searchText = driver.findElement(By.xpath(searchTxtXpath));
			enterText(searchText, searchTxt, objsrchTxt);

			/*Click on search button*/
			WebElement searchBtn = driver.findElement(By.xpath(searchBtnXpath));
			clickButton(searchBtn, objsrchBtn);
			Thread.sleep(4000);

			/*Click on product*/
			WebElement product = driver.findElement(By.xpath(iphone6Xpath));
			clickButton(product, objIphone6);
			Thread.sleep(4000);

			/*Click on add cart*/
			WebElement addCart = driver.findElement(By.xpath(addCartXpath));
			clickButton(addCart, objAddCart);
			Thread.sleep(4000);

			driver.close();
			bw.close(); 
		}
		catch(Exception e){

		}
	}
	
	
	/* Name Of the method: listMainTab
	 * Brief Description: Check for all the links on the main page with dropdowns.
	 * Arguments:
	 * Created by: Tanmayee Tankasali
	 * Creation Date: Sep 2 2017
	 * Last Modified: Sep 3 2017
	 * */
			
	public static void listMainTab() throws Exception {
		try{

			/*path for textdata*/
			String dt_path = "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/amazonUrl.xlsx";
			String[][] recData = readXlSheet(dt_path, "Sheet1");

			String URL = recData[1][1];

			/*path for object repository*/
			String or_path = "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/objectRepository.xlsx";
			String[][] recDataOr = readXlSheet(or_path, "Sheet1");

			String objDeptLink = recDataOr[5][0];
			String objYourAmazonLink = recDataOr[6][0];
			String objTodayDealLink = recDataOr[7][0];
			String deptLinkXpath = recDataOr[5][2];
			String yourAmazonLinkXpath = recDataOr[6][2];
			String todayDealLinkXpath = recDataOr[7][2];

			/*Get the URL*/
			driver.get(URL);
			driver.manage().window().maximize();

			/*MouseHover on search button*/
			WebElement depthover = driver.findElement(By.xpath(deptLinkXpath));
			mouseHover(depthover, objDeptLink);

			/*MouseHover on search button*/
			WebElement yourAmazonhover = driver.findElement(By.xpath(yourAmazonLinkXpath));
			mouseHover(yourAmazonhover, objYourAmazonLink);
			Thread.sleep(2000);

			/*MouseHover on search button*/
			WebElement todayDealhover = driver.findElement(By.xpath(todayDealLinkXpath));
			mouseHover(todayDealhover, objTodayDealLink);

			driver.close();
			bw.close(); 
		}
		catch(Exception e){

		}
	}
		
	
	/* Name Of the method: validateDeptDD
	 * Brief Description: Check for department link on the main page with dropdowns.
	 * Arguments:
	 * Created by: Tanmayee Tankasali
	 * Creation Date: Sep 2 2017
	 * Last Modified: Sep 3 2017
	 * */
				
	public static void validateDeptDD() throws Exception {
		try{

			/*path for textdata*/
			String dt_path = "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/amazonUrl.xlsx";
			String[][] recData = readXlSheet(dt_path, "Sheet1");

			String URL = recData[1][1];

			/*path for object repository*/
			String or_path = "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/objectRepository.xlsx";
			String[][] recDataOr = readXlSheet(or_path, "Sheet1");

			String objDeptLink = recDataOr[5][0];
			String deptLinkXpath = recDataOr[5][2];

			/*Get the URL*/
			driver.get(URL);
			driver.manage().window().maximize();

			/*MouseHover on search button*/
			WebElement depthover = driver.findElement(By.xpath(deptLinkXpath));
			mouseHover(depthover, objDeptLink);

			/*Click on dropdown*/
			WebElement deptDD = driver.findElement(By.xpath(deptLinkXpath));
			clickButton(deptDD, objDeptLink);
			Thread.sleep(4000);

			driver.close();
			bw.close(); 
		}
		catch(Exception e){

		}
	}
	
	
	/* Name Of the method: validateHelloDD
	 * Brief Description: Check for Hello link on the main page with dropdowns.
	 * Arguments:
	 * Created by: Tanmayee Tankasali
	 * Creation Date: Sep 2 2017
	 * Last Modified: Sep 3 2017
	 * */
				
	public static void validateHelloDD() throws Exception {
		try{

			/*path for textdata*/
			String dt_path = "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/amazonUrl.xlsx";
			String[][] recData = readXlSheet(dt_path, "Sheet1");

			String URL = recData[1][1];

			/*path for object repository*/
			String or_path = "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/objectRepository.xlsx";
			String[][] recDataOr = readXlSheet(or_path, "Sheet1");

			String objHelloLink = recDataOr[8][0];
			String helloLinkXpath = recDataOr[8][2];

			/*Get the URL*/
			driver.get(URL);
			driver.manage().window().maximize();

			/*MouseHover on link*/
			WebElement hellohover = driver.findElement(By.xpath(helloLinkXpath));
			mouseHover(hellohover, objHelloLink);

			/*Click on dropdown*/
			WebElement helloDD = driver.findElement(By.xpath(helloLinkXpath));
			clickButton(helloDD, objHelloLink);
			Thread.sleep(4000);

			driver.close();
			bw.close(); 
		}
		catch(Exception e){

		}
	}
	

	/* Name Of the method: validateHelloDD
	 * Brief Description: Check for Hello link on the main page with dropdowns.
	 * Arguments:
	 * Created by: Tanmayee Tankasali
	 * Creation Date: Sep 2 2017
	 * Last Modified: Sep 3 2017
	 * */
				
	public static void searchMenuDD() throws Exception {
		try{

			/*path for textdata*/
			String dt_path = "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/amazonUrl.xlsx";
			String[][] recData = readXlSheet(dt_path, "Sheet1");

			String URL = recData[1][1];
			String SearchDDText = recData[4][1];

			/*path for object repository*/
			String or_path = "C:/Users/tanmayee13/Desktop/Java/SeleniumTest/objectRepository.xlsx";
			String[][] recDataOr = readXlSheet(or_path, "Sheet1");

			String objSearchDD = recDataOr[9][0];
			String searchDDXpath = recDataOr[9][2];

			/*Get the URL*/
			driver.get(URL);
			driver.manage().window().maximize();

			/*Click on dropdown*/
			WebElement srchDD = driver.findElement(By.xpath(searchDDXpath));
			clickButton(srchDD, objSearchDD);
			Thread.sleep(4000);
			
			Select sel = new Select(srchDD);
			sel.selectByVisibleText(SearchDDText);
			Thread.sleep(4000);
		
			driver.close();
			bw.close(); 
		}
		catch(Exception e){

		}
	}
	

}
