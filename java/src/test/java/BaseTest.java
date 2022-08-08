import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.Service;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    Service service = new Service();

    @BeforeEach
    void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    @Test
    void fillFormTest() {
        service.fillForm();
        service.clickButton();
        service.assertForm();
    }
}
