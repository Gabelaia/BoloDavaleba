import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.SelectRadio;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import javax.swing.plaf.SliderUI;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class HotelRooms extends ChromeRunner{
    @Test
    public void myFirstTest() throws InterruptedException {

        $(byText("Tbilisi")).shouldBe(Condition.visible);
        $(byText("Kazbegi")).shouldBe(Condition.visible);
        $(byText("Kokhta")).shouldBe(Condition.visible);

        $(".module-intro__headline").shouldHave(Condition.text("Old City. New City."));
        $(byText("#Tbilisi")).shouldBe(Condition.visible);

        $(byText("Kazbegi")).click();
        $(".module-intro__headline").shouldHave(Condition.text("I woke up like this"));
        $(".module-intro__text-container").$(By.tagName("h3")).shouldHave(Condition.text("#Kazbegi"));

        Assert.assertEquals("#Kazbegi", $(".module-intro__text-container").$(By.tagName("h3")).getText());
        $(byText("Kokhta")).hover();
        $(byText("Tbilisi")).shouldBe(Condition.visible);
        $(".header__top__submenu", 2).shouldHave(Condition.text("Rooms Overview"));


    }
}

