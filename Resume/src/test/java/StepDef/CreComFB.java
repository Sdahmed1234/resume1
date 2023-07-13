package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class CreComFB {
	WebDriver driver;

	@Given("Cliquer sur l icone de navigateur")
	public void cliquer_sur_l_icone_de_navigateur() {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Given("Saisir Url {string}")
	public void saisir_url(String string) {

		driver.navigate().to(string);

	}

	@When("Cliquer sur Creer nouv compte")
	public void cliquer_sur_creer_nouv_compte() {
		WebElement Creerunnouveaucompte;
		Creerunnouveaucompte = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		Actions action = new Actions(driver);
		action.click(Creerunnouveaucompte).perform();

	}

	@When("Saisir le prenom {string}")
	public void saisir_le_prenom(String string) {

		WebElement Prenom;
		Prenom = driver.findElement(By.xpath("//input[@name='firstname']"));
		Prenom.sendKeys(string);
	}

	@When("Saisir le nom {string}")
	public void saisir_le_nom(String string) {
		WebElement Nom;
		Nom = driver.findElement(By.xpath("//input[@name='lastname']"));
		Nom.sendKeys(string);
	}

	@When("Saisir l adresse Email {string}")
	public void saisir_l_adresse_email(String string) {
		WebElement Mail;
		Mail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Mail.sendKeys(string);

	}

	@When("Confirmer adresse Email {string}")
	public void confirmer_adresse_email(String string) {
		WebElement CMail;
		CMail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		CMail.sendKeys(string);

	}

	@When("Saisir nouv mot de passe {string}")
	public void saisir_nouv_mot_de_passe(String string) {

		WebElement mdp;
		mdp = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		mdp.sendKeys(string);

	}

	@When("Saisir le jour de naissance {string}")
	public void saisir_le_jour_de_naissance(String string) {
		WebElement jdn;
		jdn = driver.findElement(By.xpath("//select[@title='Jour']"));
		Select select = new Select(jdn);
		select.selectByValue(string);
	}

	@When("Saisir le mois de naissance  {string}")
	public void saisir_le_mois_de_naissance(String string) {

		WebElement mdn;
		mdn = driver.findElement(By.xpath("//select[@title='Mois']"));
		Select select = new Select(mdn);
		select.selectByValue(string);

	}

	@When("Saisir l annee de naissance  {string}")
	public void saisir_l_annee_de_naissance(String string) {

		WebElement adn;
		adn = driver.findElement(By.xpath("//select[@title='Année']"));
		Select select = new Select(adn);
		select.selectByValue(string);
	}

	@When("cocher Homme")
	public void cocher_homme() {

		WebElement homme;
		homme = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));

		homme.click();

	}

	@When("cliquer sur INSCRIRE")
	public void cliquer_sur_inscrire() {
		WebElement inscrire;
		inscrire = driver.findElement(By.xpath("//button[@name='websubmit']"));
		inscrire.click();

	}

	@Then("Compte creer avec succes")
	public void compte_creer_avec_succes() {

	}

}
