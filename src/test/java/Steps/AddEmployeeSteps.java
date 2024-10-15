package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmployeeSteps {

    public WebDriver driver;

    @Given("user is navigated to the HRMS application")
    public void user_is_navigated_to_the_hrms_application() {

        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");



    }
    @When("used enters admin username and password")
    public void used_enters_admin_username_and_password() {

        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        WebElement loginBttn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBttn.click();

    }

    @When("user clicks on PIM options")
    public void user_clicks_on_pim_options() {

        WebElement PIMoption = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        PIMoption.click();


    }
    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {

        WebElement EmployeeList = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
        EmployeeList.click();


    }
    @When("user enters firstName, middleName and lastName")
    public void user_enters_first_name_middle_name_and_last_name() {


        WebElement firstName = driver.findElement(By.id("//input[@id='firstName']"));
        firstName.sendKeys("Mola");

        WebElement middleName = driver.findElement(By.id("//input[@id='middleName']"));
        middleName.sendKeys("Pipi");

        WebElement lastName = driver.findElement(By.id("//input[@id='lastName']"));
        lastName.sendKeys("Lola");


    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {


        WebElement saveBttn= driver.findElement(By.id("btnSave"));
        saveBttn.click();



    }
    @Then("employee added successfully")
    public void employee_added_successfully() {


        System.out.println("Employee added");


    }
    @Then("user close the browser")
    public void user_close_the_browser() {

        driver.close();


    }

}















