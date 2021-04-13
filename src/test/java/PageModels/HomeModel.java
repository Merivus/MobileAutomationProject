package PageModels;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;

public class HomeModel extends BaseModel{
    public By title = By.id("com.akbank.android.apps.akbank_direkt:id/title");
    public By btnNearestAkbank = By.id("com.akbank.android.apps.akbank_direkt:id/item3");
    public By location = By.xpath("//android.view.View[@content-desc='Google haritası']/android.view.View[92]");

    public boolean controlTitle(String text){
        return StringUtils.replace(getText(title), "\n", " ").equals(text);
    }

    public void clickNearestAkbank(){
        clickElement(btnNearestAkbank);
    }

    public boolean controlLocation(){
        return controlVisibleElement(location) != null;
    }
}
