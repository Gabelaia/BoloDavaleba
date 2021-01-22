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

public class HotelRoomsCalendar extends ChromeRunner{
    @Test
    public void mySecondTest() throws InterruptedException {
        $(".menu-toggler__icon").click();
        $(byText("Events Calendar")).click();
        $("#from").click();
        $(".ui-datepicker-next").scrollIntoView(false).click();
        $(byLinkText("7")).click();
        Assert.assertEquals($("#from").getValue(), "07/02/21");
    }
}