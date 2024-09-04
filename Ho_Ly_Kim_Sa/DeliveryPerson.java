package Ho_Ly_Kim_Sa;
public class DeliveryPerson {
    private String nameDP;
    private long phoneNumberDP;
    private String addressDP;
    public DeliveryPerson(String nameDP, long phoneNumberDP, String addressDP) {
        this.nameDP = nameDP;
        this.phoneNumberDP = phoneNumberDP;
        this.addressDP = addressDP;
    }
    public String getName(){
        return this.nameDP;
    }
    public long getPhoneNumber(){
        return this.phoneNumberDP;
    }
    public String getAddress(){
        return this.addressDP;
    }
}