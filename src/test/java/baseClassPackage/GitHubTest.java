package baseClassPackage;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitHubTest {
  WebDriver driver;
 Actions ac;
JavascriptExecutor je;
public   WebDriver launchBrowser() {
	WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
return driver;
}

public void maximize() {
	driver.manage().window().maximize();
}
public String getTittle() {
	String title = driver.getTitle();
return title;
}
public String geturl() {
	String currentUrl = driver.getCurrentUrl();
 return currentUrl;

}
public String windowId() {
	String o = driver.getWindowHandle();
return o;
}
public Set<String> WindowIds() {
	Set<String> windowHandles = driver.getWindowHandles();
return windowHandles;
}
public void back() {
	driver.navigate().back();

}
public void refresh() {
	driver.navigate().refresh();

}
public void forward() {
	
driver.navigate().forward();
}
public void loadurl(String link) {
	driver.navigate().to(link);

}
public void framebyindex(String index) {
	driver.switchTo().frame(index);
}
public void framebyname(String name) {
	driver.switchTo().frame(name);

}
public void framebyId(String id) {
	driver.switchTo().frame(id);

}public void frameparent() {
	driver.switchTo().parentFrame();

}
public void defaultContent() {
	driver.switchTo().defaultContent();

}
public void frameByWebElement(WebElement element) {
	
driver.switchTo().frame(element);
}public void windowhandlebyurl(String url) {
	driver.switchTo().window(url);

}public void windowhandlebytitle(String title) {
	driver.switchTo().window(title);

}public void windowhandlebyId(String Id) {
	driver.switchTo().window(Id); 

}
public void alertAccept() {
	
driver.switchTo().alert().accept();
}
public void alrtDismiss() {
	
driver.switchTo().alert().dismiss();
}
public String alertGettext() {
	String text = driver.switchTo().alert().getText();
return text;
}
public void alertSendkeys(String data) {
	driver.switchTo().alert().sendKeys(data);

}
public void implictwait(int waittime) {
	Timeouts timeouts = driver.manage().timeouts();
	timeouts.implicitlyWait(Duration.ofSeconds(waittime));

}
public void explicitWait(int time,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
wait.until(ExpectedConditions.elementToBeClickable(element));
}
public void close() {
	driver.close();

}
public void quit() {
	driver.quit();

}
public void sendkeys(WebElement element,String txt) {
	
element.sendKeys(txt);
}
public void click(WebElement clickelement) {
	clickelement.click();

}public void submit(WebElement submit) {
	submit.submit();

}
public String getAttribute(WebElement element,String atributename ) {
	String attribute = element.getAttribute(atributename);
return attribute;
}
public boolean displayed(WebElement element) {
	
boolean displayed = element.isDisplayed();
return displayed;
}
public boolean enabled(WebElement element ) {
	boolean enabled = element.isEnabled();
return enabled;
}
public boolean selected(WebElement element) {
	boolean selected = element.isSelected();
return selected;
}
public String gettextelement(WebElement element) {
	String text = element.getText();
return text;
}
public String getCssValue(WebElement element,String content) {
	String cssValue = element.getCssValue(content);
return cssValue;
}
public void clear(WebElement element) {
	element.clear();

}
public void ScreenshotElement(WebElement element,String destfile) throws Exception {
	
File file = element.getScreenshotAs(OutputType.FILE);
File f=new File(destfile);
FileHandler.copy(file, f);
}public void Screenshot(String tofile) throws IOException {
	
	TakesScreenshot screen=(TakesScreenshot) driver;
	File sourcefile = screen.getScreenshotAs(OutputType.FILE);
	File to=new File(tofile);
	FileHandler.copy(sourcefile, to);
}public void selectbyindex(int index,WebElement element) {
	Select s=new Select(element);
s.selectByIndex(index);
}public void selectbyvalue(WebElement element,String value) {
	Select s=new Select(element);
s.selectByValue(value);
}
public void selectbyVisibility(WebElement element,String visibletext) {
	Select s=new Select(element);
s.selectByVisibleText(visibletext);
}
public void deselectbyvalue(WebElement element,String value) {
	Select s=new Select(element);
s.deselectByValue(value);
}
public void deselectbyindex(WebElement element,int index) {
	Select s=new Select(element);
s.deselectByIndex(index);
}
public void deselectbyvisibletext(WebElement element,String visible) {
	Select s=new Select(element);
s.deselectByVisibleText(visible);
}
public boolean multiselect(WebElement element) {
	Select s=new Select(element);
boolean multiple = s.isMultiple();
return multiple;
}
public void deselectall(WebElement element) {
	Select s=new Select(element);
	s.deselectAll();	

}
public List<WebElement> allselected(WebElement element) {
	Select s=new Select(element);	
List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
return allSelectedOptions;
}
public String getFirstSelected(WebElement element) {
	Select s=new Select(element);	
WebElement firstSelectedOption = s.getFirstSelectedOption();
String text = firstSelectedOption.getText();
return text;
}

public String loadurl(WebElement element,int index) {
	Select s=new Select(element);
List<WebElement> options = s.getOptions();
String text = options.get(index).getText();
return text;

}
public void movetoelement(WebElement element) {
	ac=new Actions(driver);
ac.moveToElement(element);
}
public void dragAndDrop(WebElement element1,WebElement element2) {
	ac.dragAndDrop(element1, element2);

}
public void doubleClick(WebElement element) {
	ac.doubleClick(element);

}
public void contextClick(WebElement element) {
	ac.contextClick(element);

}
public void clickAndHold(WebElement element) {
	ac.clickAndHold(element);

}
public void perform() {
	ac.build().perform();

}
public void actionEnter(WebElement element) {
	ac.sendKeys(Keys.ENTER);

}
public void sendKeysJavaScript(WebElement element1) {
	je=(JavascriptExecutor) driver;
je.executeScript("arguments[o].scrollIntoView(true)", element1);



}}

