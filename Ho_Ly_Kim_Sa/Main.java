package Ho_Ly_Kim_Sa;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
         // Tài khoản có sẵn của người dùng
        Customer c1 = new Customer("Ho Ly Kim Sa", 877152961, "99 To Hien Thanh_Phuoc My_Son Tra_Da Nang", "kimsa@123");
        Customer c2 = new Customer("Ho Viet Hoan", 824940526, "Ta Leng_Dakrong_Dakrong_Quang Tri", "viethoan@123");
        Customer c3 = new Customer(); // dành cho đăng ký tài khoản mới
        
        Customer customer; // xác định người dùng là ai
        int quantity; // số lượng của món 
        int option; // lựa chọn
        Scanner input = new Scanner(System.in);

        ArrayList<FoodItem> menu1 = new ArrayList<FoodItem>();
        ArrayList<FoodItem> menu2 = new ArrayList<FoodItem>();
        ArrayList<FoodItem> menu3 = new ArrayList<FoodItem>();
        ArrayList<DeliveryPerson> deliveryPersons = new ArrayList<>();

        //------------------------ Dữ liệu mặc định---------------------------------
        FoodItem food1 = new FoodItem("Grilled shrimp", 5);
        FoodItem food2 = new FoodItem("Steamed king crab", 20);
        FoodItem food3 = new FoodItem("Grilled oysters", 6);
        menu1.add(food1);
        menu1.add(food2);
        menu1.add(food3);
        // nhà hàng 1
        Restaurant r1 = new Restaurant("Ocean food", 914230688, "My Khe 3_Phuoc My_Son Tra_Da Nang", menu1);

        FoodItem food4 = new FoodItem("Cheese lover's  ", 6.8);
        FoodItem food5 = new FoodItem("P-Zone", 6.8);
        FoodItem food6 = new FoodItem("Meat lover's", 6.8);
        menu2.add(food4);
        menu2.add(food5);
        menu2.add(food6);
        // nhà hàng 2
        Restaurant r2 = new Restaurant("PizaHut",  985370672, "25 Pham Vu Hi_Phuoc My_Son Tra_Da Nang", menu2);
        FoodItem food7 = new FoodItem("Fish fillet  ", 5);
        FoodItem food8 = new FoodItem("Chicken tikka", 6);
        FoodItem food9 = new FoodItem("Veg tawa", 6);
        menu3.add(food7);
        menu3.add(food8);
        menu3.add(food9);
        // nhà hàng 3
        Restaurant r3 = new Restaurant("Sizzler", 935458326, "Da Nang", menu3);

        // random người giao hàng 
        deliveryPersons.add(new DeliveryPerson("Nguyen Van Ngoc", 844326225, "Quang Tri"));
        deliveryPersons.add(new DeliveryPerson("Phung Hung Dung", 877123546, "Quang Tri"));
        deliveryPersons.add(new DeliveryPerson("Luong The Dung", 824446312, "Quang Tri"));
        Random random = new Random();
        DeliveryPerson selectedDeliveryPerson = deliveryPersons.get(random.nextInt(deliveryPersons.size()));

//----------------------------------Chương trình------------------------------------------------------------
        Grabfood: while (true) {
            System.out.println(" ----------------------------GRAB FOOD--------------------------");
            System.out.println("|                           1. Log in                           |");
            System.out.println("|                           2. Sign up                          |");
            System.out.println("|                           3. Exit                             |");
            System.out.println(" ---------------------------------------------------------------");
            System.out.print("--> Please choose one of your options: ");
            while (true) {
                option = input.nextInt();
                if (option > 3 || option <= 0) {
                    System.out.print("--> Invalid option\n--->Enter again: ");
                } 
                else {
                    break;
                }
            }
            switch (option) {
                case 1:// kiểm tra mật khẩu
                    while (true) {
                        System.out.println("\n----------------------------LOG IN---------------------------");
                        System.out.print("- Enter your phone number (9 numbers): ");
                        long phoneNumber = input.nextLong();
                        System.out.print("- Enter your password: ");
                        input.nextLine();
                        String password = input.nextLine();
                        // kiểm tra người dùng nào sử dụng
                        if (c1.LogIn(phoneNumber, password)) {
                            customer = c1;
                            System.out.println("--> Logged in successfully!!!");
                            break;
                        } else if (c2.LogIn(phoneNumber, password)) {
                            customer = c2;
                            System.out.println("--> Logged in successfully!!!");
                            break;
                        } else if (c3.LogIn(phoneNumber, password)) {
                            customer = c3;
                            System.out.println("--> Logged in successfully!!!");
                            break;
                        } else {
                            System.out.println("--> Login unsuccessful!!!");
                        }
                    }
                    // Các chức năng của Customer
                    customerHome: while (true) {
                        System.out.println(" ----------------------------WELCOME TO GRAB FOOD--------------------------");
                        System.out.println("|                           1. Information                                 |");
                        System.out.println("|                           2. Order                                       |");
                        System.out.println("|                           3. Edit information                            |");
                        System.out.println("|                           4. Log out                                     |");
                        System.out.println(" --------------------------------------------------------------------------");
                        System.out.print("--> Please choose one of your options: ");
                        while (true) {
                            option = input.nextInt();
                            if (option > 4 || option <= 0) {
                                System.out.print("--> Invalid option\n--->Enter again: ");
                            } else {
                                break;
                            }
                        }
                        switch (option) {
                            case 1: // In thông tin của Customer
                                System.out.println("\n----------------------------YOUR INFORMATION---------------------------");
                                customer.Display();
                                while (true) {
                                    System.out.println("--> Press 1 to go back: ");
                                    option = input.nextInt();
                                    if (option == 1) {
                                        break;
                                    }
                                }
                                break; 
                            case 2: // Chọn nhà hàng để ORDER
                                System.out.println("----------------------------ORDER--------------------------");

                                System.out.println(" \n----------------------------RESTAURANT--------------------------");
                                System.out.println("|                           1. Ocean Food                        |");
                                System.out.println("|                           2. PizaHut                           |");
                                System.out.println("|                           3. Sizzler                           |");
                                System.out.println("|                           4. Exit                              |");
                                System.out.println(" ----------------------------------------------------------------");
                                System.out.print("--> Please choose one of your options: ");
                                while (true) {
                                    option = input.nextInt();
                                    if (option > 3 || option <= 0) {
                                        System.out.print("--> Invalid option\n--->Enter again: ");
                                    } 
                                    else {
                                        break;
                                    }
                                }

                                // Chọn món và đặt món trong nhà hàng thứ nhất
                                if (option == 1) {
                                    System.out.println(" ----------------------------MENU--------------------------");
                                    System.out.println(" ----------------------------------------------------------");
                                    System.out.println("|   | Food's name          | Price                         |");
                                    System.out.println(" ----------------------------------------------------------");
                                    System.out.println("| 1 | Grilled shrimp       |  5                            |");
                                    System.out.println("| 2 | Steamed king crab    |  20                           |");
                                    System.out.println("| 3 | Grilled oysters      |  6                            |");
                                    System.out.println(" ----------------------------------------------------------");
                                    System.out.print("--> Please choose one of your options: ");
                                    while (true) {
                                        option = input.nextInt();
                                        if (option > 3 || option <= 0) {
                                            System.out.print("--> Invalid option\n--->Enter again: ");
                                        } else {
                                            while (true) {
                                                System.out.println("You have chosen " + r1.getName() + "restaurant's "
                                                        + r1.getMenu().get(option - 1).getNameFoodItem());
                                                System.out.print("Please enter the quantity of the dish: ");
                                                while (true) {
                                                    quantity = input.nextInt(); 
                                                    if (quantity <= 0 || quantity > 21 ){
                                                        System.out.print("---Exceeded allowable limit!!!---\n-->Enter again: ");
                                                    }
                                                    else{
                                                        break;
                                                    }
                                                }
                                                Order bill = new Order(customer, selectedDeliveryPerson, r1, r1.getMenu().get(option - 1), quantity);
                                                System.out.println("-----Confirm!!-----");
                                                System.out.println("\t1. Order\n\t2. Cancel");
                                                System.out.print("--> Please choose one of your options: ");
                                                while (true) {
                                                    option = input.nextInt();
                                                    if (option > 2 || option <= 0) {
                                                        System.out.print("--> Invalid option\n--->Enter again: ");
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                if (option == 1) {
                                                    bill.PrintDetailBill();  
                                                    break;
                                                }
                                                else{
                                                    System.out.println("---Canceled!!!---");
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                } 
                                // chọn món và đặt món trong nhà hàng thứ 2
                                else if (option == 2) {
                                    System.out.println(" ----------------------------MENU--------------------------");
                                    System.out.println(" ----------------------------------------------------------");
                                    System.out.println("|   | Food's name          | Price                         |");
                                    System.out.println(" ----------------------------------------------------------");
                                    System.out.println("| 1 | Cheese lover's       |  6.8                          |");
                                    System.out.println("| 2 | P-Zone               |  6.8                          |");
                                    System.out.println("| 3 | Meat lover's         |  6.8                          |");
                                    System.out.println(" ----------------------------------------------------------");
                                    System.out.print("--> Please choose one of your options: ");
                                    while (true) {
                                        option = input.nextInt();
                                        if (option > 3 || option <= 0) {
                                            System.out.print("--> Invalid option\n--->Enter again: ");
                                        } 
                                        else {
                                            while (true) {
                                                System.out.println("You have chosen " + r2.getName() + "restaurant's "
                                                        + r2.getMenu().get(option - 1).getNameFoodItem());
                                                System.out.print("Please enter the quantity of the dish: ");
                                                while (true) {
                                                    quantity = input.nextInt(); 
                                                    if (quantity <= 0 || quantity > 21 ){
                                                        System.out.print("---Exceeded allowable limit!!!---\n-->Enter again: ");
                                                    }
                                                    else{
                                                        break;
                                                    }
                                                }
                                                Order bill = new Order(customer, selectedDeliveryPerson, r2,
                                                        r2.getMenu().get(option - 1), quantity);
                                                System.out.println("-----Confirm!!-----");
                                                System.out.println("\t1. Order\n\t2. Cancel");
                                                System.out.print("--> Please choose one of your options: ");
                                                while (true) {
                                                    option = input.nextInt();
                                                    if (option > 2 || option <= 0) {
                                                        System.out.print("--> Invalid option\n--->Enter again: ");
                                                    } 
                                                    else {
                                                        break;
                                                    }
                                                }
                                                if (option == 1) {
                                                    bill.PrintDetailBill();  
                                                    break;
                                                }
                                                else{
                                                    System.out.println("---Canceled!!!---");
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                } 
                                // chọn món và đặt món trong nhà hàng thứ 3
                                else if (option == 3) {
                                    System.out.println(" ----------------------------MENU--------------------------");
                                    System.out.println(" ----------------------------------------------------------");
                                    System.out.println("|   | Food's name          | Price                         |");
                                    System.out.println(" ----------------------------------------------------------");
                                    System.out.println("| 1 | Fish fillet          |  5                            |");
                                    System.out.println("| 2 | Chicken tikka        |  6                            |");
                                    System.out.println("| 3 | Veg tawa             |  5                            |");
                                    System.out.println(" ----------------------------------------------------------");
                                    System.out.print("--> Please choose one of your options: ");
                                    while (true) {
                                        option = input.nextInt();
                                        if (option > 3 || option <= 0) {
                                            System.out.print("--> Invalid option\n--->Enter again: ");
                                        } else {
                                            while (true) {
                                                System.out.println("You have chosen " + r3.getName() + "restaurant's "
                                                        + r3.getMenu().get(option - 1).getNameFoodItem());
                                                System.out.print("Please enter the quantity of the dish: ");
                                                while (true) {
                                                    quantity = input.nextInt(); 
                                                    if (quantity <= 0 || quantity > 21 ){
                                                        System.out.print("---Exceeded allowable limit!!!---\n-->Enter again: ");
                                                    }
                                                    else{
                                                        break;
                                                    }
                                                }
                                                Order bill = new Order(customer, selectedDeliveryPerson, r3,
                                                        r3.getMenu().get(option - 1), quantity);


                                                System.out.println("-----Confirm!!-----");
                                                System.out.println("\t1. Order\n\t2. Cancel");
                                                System.out.print("--> Please choose one of your options: ");
                                                while (true) {
                                                    option = input.nextInt();
                                                    if (option > 2 || option <= 0) {
                                                        System.out.print("--> Invalid option\n--->Enter again: ");
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                if (option == 1) {
                                                    bill.PrintDetailBill();  
                                                    break;
                                                }
                                                else{
                                                    System.out.println("---Canceled!!!---");
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                }


                                break; 
                            case 3: // Thay đổi thông tin của người dùng
                                editinfor: while (true) {
                                    System.out.println(" ----------------------------CHANGE INFORMATION--------------------------");
                                    System.out.println("|                           1. Name                                      |");
                                    System.out.println("|                           2. Phone number                              |");
                                    System.out.println("|                           3. Address                                   |");
                                    System.out.println("|                           4. Change all                                |");
                                    System.out.println("|                           5. Exit                                      |");
                                    System.out.println(" ------------------------------------------------------------------------");
                                    System.out.print("--> Please choose one of your options: ");
                                    while (true) {
                                        option = input.nextInt();
                                        if (option > 5 || option <= 0) {
                                            System.out.print("--> Invalid option\n--->Enter again: ");
                                        } else {
                                            break;
                                        }
                                    }
                                    while (true) {
                                        // Thay đổi tên người dùng
                                        if (option == 1) {
                                            customer.editName();
                                            System.out.println("---Changed successfully!!!---");
                                            break;
                                        } 
                                        // Thay đổi số điện thoại người dùng
                                        else if (option == 2) {
                                            customer.editPhonenumber();
                                            System.out.println("---Changed successfully!!!---");
                                            break;
                                        }
                                        // Thay đổi địa chỉ khách hàng 
                                        else if (option == 3) {
                                            customer.editAddress();
                                            System.out.println("---Changed successfully!!!---");
                                            break;
                                        }
                                        // Thay đổi tất cả thông tin
                                        else if (option == 4) {
                                            customer.editAllInfor();
                                            System.out.println("---Changed successfully!!!---");
                                            break;
                                        }
                                        // THoát khỏi mục thay đổi thông tin ra các mục chức năng chính 
                                        else {
                                            System.out.println("--> You have successfully exited!!!");
                                            break editinfor;
                                        }
                                    }
                                }
                                break; 
                            default: // THoát khỏi mục chọn các chức năng trở về log in, sign up...
                                System.out.println("You have successfully logged out!!");
                                break customerHome; 
                        }
                    }
                    break;
                case 2: // Đăng ký sau đó yêu cầu đăng nhập
                    System.out.println("\n----------------------------SIGN UP---------------------------");
                    System.out.print("- Enter your fullname: ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.print("- Enter your phone number (9 numbers): ");
                    long phoneNumber = input.nextLong();
                    while (true) {
                        phoneNumber = input.nextLong();
                        if (String.valueOf(phoneNumber).length() != 9){
                            System.out.println("---Invalid phone number!---");
                            System.out.print("-->Enter your phone number (9 numbers): ");
                        }
                        else{
                            break;
                        }
                    } 
                    input.nextLine();
                    System.out.print("- Enter your address: ");
                    String address = input.nextLine();
                    System.out.print("- Enter your password (8 characters or more): ");
                    String passWord;
                    while (true) {
                        passWord = input.nextLine();
                        if (passWord.length() < 8 ) {
                            System.out.println("---Invalid password!---");
                            System.out.print("- Enter your password (8 characters or more): ");
                        }
                        else{
                            break;
                        }
                    }
                    c3 = new Customer(name, phoneNumber, address, passWord); 
                    System.out.println("--> Sign Up Success. Please log in!!!");
                    break;
                default: 
                    System.out.println("--> Exit the program successfully!!!");
                    break Grabfood;
            }
        }
        input.close();
    }
}
