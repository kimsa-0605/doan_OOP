package Ho_Ly_Kim_Sa;
public abstract class User {
    private long phoneNumber;
    private String name;
    private String address;
    public User(){}
    public User (String name,long phoneNumber, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public void setPhoneNumber(long phoneNumber){
                this.phoneNumber = phoneNumber;
        }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
            this.address = address;
        }  
    public String getName(){
        return this.name;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }    
    public String getAddress(){
        return this.address;
    }
    // phuong thuc in thong tin
    public abstract void Display();
}
