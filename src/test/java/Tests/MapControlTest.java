package Tests;

import PageModels.HomeModel;
import PageModels.MapControlModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class MapControlTest {
    MapControlModel model = new MapControlModel();

    @Step("Click menu bar on upper right corner")
    public void clickMenu() {
        model.clickMenu();
    }

    @Step("Click 'ATM' at the bottom of screen")
    public void clickAtmButton() {
        model.clickAtmButton();
    }

    @Step("Click on the third ATM option")
    public void clickThirdAtm() {
        model.clickThirdAtm();
    }

    @Step("Click 'Yol Tarifi'")
    public void clickLocations() {
        model.clickLocations();
    }

    @Step("Check Google Maps is opened for directions")
    public void controlEndPointVisible() {
        Assert.assertTrue("Google maps not found!",model.controlEndPointVisible());
    }
}
