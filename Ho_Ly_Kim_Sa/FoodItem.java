package Ho_Ly_Kim_Sa;
public class FoodItem {
    private String nameFoodItem;
    private double priceFoodItem;
    public FoodItem(String nameFoodItem, double priceFoodItem){
        this.nameFoodItem = nameFoodItem;
        this.priceFoodItem = priceFoodItem;
    }
    public void setNameFoodItem(String nameFoodItem){
        this.nameFoodItem = nameFoodItem;
    }
    public void setPriceFoodItem(double priceFoodItem){
        this.priceFoodItem = priceFoodItem;
    }
    public String getNameFoodItem(){
        return this.nameFoodItem;
    }
    public double getPriceFoodItem() {
        return this.priceFoodItem;
    }
}

