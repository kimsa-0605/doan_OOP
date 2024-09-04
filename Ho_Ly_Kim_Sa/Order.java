package Ho_Ly_Kim_Sa;
public class Order {
    private Customer customer;
    private DeliveryPerson deliveryPerson;
    private FoodItem foodItem;
    private Restaurant restaurant;
    private int quantity;
    private double totalPrice;

    public Order(Customer customer, DeliveryPerson deliveryPerson, Restaurant restaurant, FoodItem foodItem, int quantity) {
        this.customer = customer;
        this.deliveryPerson = deliveryPerson;
        this.foodItem = foodItem;
        this.restaurant = restaurant;
        this.quantity = quantity;
        this.totalPrice = foodItem.getPriceFoodItem() * quantity;
    }
    public String getFoodName(){
        return this.foodItem.getNameFoodItem();
    }
    public void PrintDetailBill() {
        System.out.println("\n ----------------------------BILL--------------------------");
        System.out.println("Customer Information: "+customer.getName());
        System.out.println("Food Item: " + foodItem.getNameFoodItem());
        System.out.println("Restaurant: " + restaurant.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Delivery address: "+customer.getAddress());
        System.out.println("Delivery Person: " + deliveryPerson.getName());
        System.out.println("Total Price: $" + totalPrice);
    }
}
