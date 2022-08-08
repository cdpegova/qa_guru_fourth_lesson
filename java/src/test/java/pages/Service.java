package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;

import java.io.File;

public class Service {

    public void fillForm() {
        fillName();
        fillSurname();
        fillEmail();
        clickRadioButton();
        fillPhoneNumber();
        fillPictureForm();
        fillSubjects();
        clickHobbies();
        fillAddress();
        clickState();
        clickCity();
    }

    public void clickButton() {
        Locators.submitButton.click();
    }

    public void assertForm() {
        Locators.thankYOu.shouldHave(Condition.text("Thanks for submitting the form"));
    }

    private void fillName() {
        Locators.name.setValue("Kuznechov");
    }

    private void fillSurname() {
        Locators.surname.setValue("Kirill");
    }

    private void fillEmail() {
        Locators.email.setValue("1@bk.ru");
    }

    private void clickRadioButton() {
        Locators.radioButton.click();
    }

    private void fillPhoneNumber() {
        Locators.phone.setValue("0123456789");
    }

    private void fillPictureForm() {
        Locators.picture.uploadFile(new File("src/test/resources/Toolsqa.jpg"));
    }

    private void fillSubjects() {
        Locators.subjects.setValue("Anything");
    }

    private void clickHobbies() {
        Locators.hobbies.find(new ByText("Sports")).click();
    }

    private void fillAddress() {
        Locators.currentAddress.setValue("Moscow");
    }

    private void clickState() {
        Locators.state.click();
        Locators.state.find(new ByText("NCR")).click();
    }

    private void clickCity() {
        Locators.city.click();
        Locators.city.find(new ByText("Delhi")).click();
    }


}
