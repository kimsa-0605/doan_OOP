package Ho_Ly_Kim_Sa;
import java.util.ArrayList;
public class Restaurant  {
    private String nameRes;
    private long phoneNumberRes;
    private String addressRes;
    private  ArrayList <FoodItem> menu = new ArrayList<FoodItem>();
    public Restaurant(String nameRes, long phoneNumber, String addressRes, ArrayList<FoodItem> menu){
        this.nameRes = nameRes;
        this.phoneNumberRes = phoneNumber;
        this.addressRes = addressRes;
        this.menu = menu;
    }
    public String getName(){
        return this.nameRes;
    }
    public long getPhoneNumber(){
        return this.phoneNumberRes;
    }
    public String getAddress(){
        return this.addressRes;
    }
    public ArrayList<FoodItem> getMenu() {
        return menu;
    }
}
