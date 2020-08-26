package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleDefnitions {

    WebDriver driver=new ChromeDriver();
    @Given("^User is entering google$")
    public void user_is_entering_google() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
        driver.get("http://www.google.co.in");

    }

    @When("^User is typing \"([^\"]*)\"$")
    public void user_is_typing(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(arg1);

    }

    @When("^press key Enter$")
    public void press_key_Enter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }

    @Then("^Apple related search should appear$")
    public void apple_related_search_should_appear() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
        Boolean status=driver.findElement(By.partialLinkText("Apple")).isDisplayed();
        if(status){
            System.out.println("Apple found");
        }
        else{
            System.out.println("Apple Notfound");
        }
    }

}
