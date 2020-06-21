package hw_JDI;

import hw_JDI.base.BaseTest;
import hw_JDI.dataProviders.MetalsAndColorsDataProvider;
import hw_JDI.entities.MetalsAndColors;
import org.testng.Assert;
import org.testng.annotations.Test;

import static hw_JDI.entities.User.ROMAN;


public class JdiTest extends BaseTest {

    @Test(dataProviderClass = MetalsAndColorsDataProvider.class, dataProvider = "testData")
    public void metalsAndColorsTest(MetalsAndColors metalsAndColors) {
        JdiSite.openHomePage();
        JdiSite.jdiHomePage.login(ROMAN);
        String username = JdiSite.jdiHomePage.getUsername();
        Assert.assertEquals(username, ROMAN.getFullName());
        JdiSite.openMetalsAndColorsPage();
        JdiSite.metalsAndColorsPage.fill(metalsAndColors);
        JdiSite.metalsAndColorsPage.submitForm();
        Assert.assertEquals(JdiSite.metalsAndColorsPage.getResults(), metalsAndColors.getExpectedResults().toString());

    }

}
