package Ho_Ly_Kim_Sa;
import java.util.Scanner;
public class Customer extends User {
    private String passWord;
    static Scanner input = new Scanner(System.in);
    public Customer(){}
    public Customer(String name,long phoneNumber,String address,String passWord){
        super(name,phoneNumber,address);
        this.passWord = passWord;
    }
    // in thông tin khach hang 
    @Override
    public void Display(){
        System.out.println("--> Name: "+this.getName());
        System.out.println("--> Phone number: "+this.getPhoneNumber());
        System.out.println("--> Address: "+this.getAddress());

    }
    // Đăng nhập
    public boolean LogIn(long phoneNumber, String password){
            return (this.getPhoneNumber() == phoneNumber && this.passWord.equals(password));
    }
    // đổi tên
    public void editName(){
        System.out.println("- Your current name is: "+this.getName());
        System.out.print("-->You change your name to: ");
        String name;
        while (true) {
            name = input.nextLine();
            if (name.equals("")){
                System.out.println("---Invalid name!---");
                System.out.print("-->You change your name to: ");
            }
            else{
                this.setName(name);
                break;
            }
        } 
    }
    //đổi số điện thoại
    public void editPhonenumber(){
        System.out.println("- Your current phone number is: "+this.getPhoneNumber());
        System.out.print("-->You change your phone number to: ");
        long phoneNumber = input.nextLong();
        while (true) {
            phoneNumber = input.nextLong();
            if (String.valueOf(phoneNumber).length() != 9){
                System.out.println("---Invalid phone number!---");
                System.out.print("-->You change your phone number to: ");
            }
            else{
                this.setPhoneNumber(phoneNumber);
                break;
            }
        } 
    }
    // đổi địa chỉ
    public void editAddress(){
        input.nextLine();
        System.out.println("- Your current address is: "+this.getAddress());
        System.out.print("-->You change your Address to: ");
        String address;
        while (true) {
            address = input.nextLine();
            if (address.equals("")){
                System.out.println("---Invalid name!---");
                System.out.print("-->You change your name to: ");
            }
            else{
                this.setAddress(address);
                break;
            }
        } 
    }
    // đổi tất cả thông tin
    public void editAllInfor(){
        this.editPhonenumber();
        this.editName();
        this.editAddress();                                           
    }
}
