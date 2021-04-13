package PageModels;

import org.openqa.selenium.By;

public class MapControlModel extends BaseModel {
    public By btnAtm = By.id("com.akbank.android.apps.akbank_direkt:id/map_atm_selected_wrapper");
    public By btnMenu = By.id("com.akbank.android.apps.akbank_direkt:id/akbank_header_right_btn_icon");
    public By btnAtmList = By.id("com.akbank.android.apps.akbank_direkt:id/maplistrow_image");
    public By btnLocation = By.id("com.akbank.android.apps.akbank_direkt:id/map_detail_fragment_btnYolTarifi");
    public By btnEndPoint = By.id("com.google.android.apps.maps:id/directions_endpoint_textbox");

    public void clickAtmButton(){
        clickElement(btnAtm);
    }

    public void clickMenu(){
        clickElement(btnMenu);
    }

    public void clickThirdAtm(){
        checkList(btnAtmList,2);
    }

    public void clickLocations() {
        clickElement(btnLocation);
    }

    public boolean controlEndPointVisible(){
        return controlVisibleElement(btnEndPoint) != null;
    }
}
