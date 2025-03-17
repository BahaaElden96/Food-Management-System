/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodsystem;

/**
 *
 * @author bahaa
 */
public class OnlineOrder extends Order implements Payment{
    private String deliveryAddress;

    public OnlineOrder(Restaurant restaurant, String address) {
        super(restaurant);
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Delivery address required");
        }
        this.deliveryAddress = address;
    }

    // Method overloading
    public void addItem(MenuItem item, String specialRequest) {
        item.setSpecialRequest(specialRequest);
        super.addItem(item);
    }

    public void processPayment(double amount) throws PaymentException {
        double total = calculateTotal();
        if (amount < total) {
            throw new PaymentException(String.format(
                "Insufficient payment. Required: %.2f, Provided: %.2f", total, amount));
        }
        System.out.println("Payment processed successfully!");
    }

    @Override
    public void displayOrderType() {
        System.out.println("Online Order - Address: " + deliveryAddress);
    }
}
