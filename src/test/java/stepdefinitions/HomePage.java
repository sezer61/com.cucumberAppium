package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class HomePage {




     @Given("Alltricks anasayfasina git")
     public void alltricks_anasayfasina_git() {
          Driver.getAppiumDriver().get("https://www.alltricks.fr");
          WebElement cookies=Driver.getAppiumDriver().findElement(By.xpath("//*[@id='didomi-notice-agree-button']"));
          cookies.click();
          WebElement signIn =Driver.getAppiumDriver().findElement(By.xpath("//*[@class='allfont allfont-perso']"));
          signIn.click();
     }

     @Given("Profil sekmesine geç")
     public void profil_sekmesine_gec() {

     }

     @Then("Adresim kismina emaili gir")
     public void adresim_kismina_emaili_gir() {


     }







}
