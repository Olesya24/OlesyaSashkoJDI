package hw_JDI;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import hw_JDI.pages.JdiHomePage;
import hw_JDI.pages.MetalsAndColorsPage;


@JSite("http://jdi-testing.github.io/jdi-light/")
//Раскомментил ссылку, без нее он не мог прочесть, что за сайт ты тестишь
//либо так, либо указывай в проперти файле ссылку
public class JdiSite {

    @Url("/index.html")
    public static JdiHomePage jdiHomePage;

    @Url("/metals-colors.html")
    public static MetalsAndColorsPage metalsAndColorsPage;


    public static void openHomePage() {
        jdiHomePage.open();
    }

    public static void openMetalsAndColorsPage() {
        metalsAndColorsPage.open();
    }
}
