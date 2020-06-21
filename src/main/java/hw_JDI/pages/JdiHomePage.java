package hw_JDI.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Text;
import hw_JDI.entities.User;
import hw_JDI.forms.JdiLoginForm;


public class JdiHomePage extends WebPage {
    @Css("#user-name")
    private Text userName;

    @Css("#user-icon")
    private Button userIcon;

    private JdiLoginForm jdiLoginForm;


    public void login(User user) {
        userIcon.click();
        jdiLoginForm.login(user);
    }

    public String getUsername() {
        return userName.getValue();

    }
}
