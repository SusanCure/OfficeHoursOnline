package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.Driver;

public class EtsyStepDefinitions {

    @Given("I am on the etsy homepage")
    public void i_am_on_the_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com/");
    }

    @When("I click on Clothing & Shoes")
    public void i_click_on_Clothing_Shoes() {
        Driver.getDriver().findElement(By.id("catnav-primary-link-10923")).click();

    }

    @Then("the site subtitle will be Clothing & Shoes")
    public void the_site_subtitle_will_be_Clothing_Shoes() throws InterruptedException { {
       Thread.sleep(2000);
 String expected = "Clothing & Shoes";
  String actual =Driver.getDriver().findElement(By.xpath("//h1[contains(text(),'Clothing & Shoes')]")).getText();
        Assert.assertEquals(actual,expected,"Subtitle does not match");
   }
        //@After imported cucumber will work after the scenario step are done. A hook.
    }
    @After
    public void closingDriver(){
        Driver.quit();
    }
}