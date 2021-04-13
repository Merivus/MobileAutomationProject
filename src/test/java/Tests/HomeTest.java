package Tests;

import PageModels.HomeModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class HomeTest {
    HomeModel homeModel = new HomeModel();

    @Step("Check that <key> is seen")
    public void controlTitle(String key) {
        Assert.assertTrue(homeModel.controlTitle(key));
    }

    @Step("Then click 'En yakın Akbank'")
    public void clickNearestAkbank() {
        homeModel.clickNearestAkbank();
    }

    @Step("Check that your location is shown correctly")
    public void controlLocation() { Assert.assertTrue("Your location is not found!",homeModel.controlLocation()); }
}
