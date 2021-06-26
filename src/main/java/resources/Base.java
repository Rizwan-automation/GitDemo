package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Rizwan\\eclipse-workspace-2020-12\\End2EndTesting\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Rizwan\\Downloads\\chromedriver_win64\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.diver",
					"C:\\Users\\Rizwan\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {

			System.setProperty("webdriver.internetexplorer.driver",
					"C:\\Users\\Rizwan\\Downloads\\IEDriverServer\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		return driver;
	}

}
