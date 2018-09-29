package generic;

public interface IAutoConst {
	public static final String CHROME_KEY ="webdriver.chrome.driver";
	public static final String CHROME_VALUE ="./driver/chromedriver.exe";
	public static final String GECKO_KEY ="webdriver.gecko.driver";
	public static final String GECKO_VALUE ="webdriver.gecko.driver";
	
	String CONFIG_PATH = "./config.properties";
	String SUMMARY_PATH = "./Result/summary.xlsx";
	
	String INPUT_PATH ="./data/input.xlsx";
	String PHOTO_PATH ="./photo";
}
