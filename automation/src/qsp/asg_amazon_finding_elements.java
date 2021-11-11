package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_amazon_finding_elements {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args){
	System.out.println("enter the url");
	
	Scanner sc =new Scanner(System.in);
	String url=sc.nextLine();
	
	WebDriver w=new ChromeDriver();
	w.get(url);
List<WebElement> allLinks = w.findElements(By.tagName("a"));
int count = allLinks.size();
System.out.println(count);

for(int i=0;i<count;i++)
{
WebElement link = allLinks.get(i);
String text = link.getText();
System.out.println(text);
}

w.close();
}}

