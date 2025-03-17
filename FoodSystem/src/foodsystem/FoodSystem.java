/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foodsystem;

/**
 *
 * @author bahaa
 */
public class FoodSystem {

    public static void main(String[] args) {
        // TODO code application logic here
        
      try {
            // Setup restaurant
            Restaurant pizzaHut = new Restaurant();
            pizzaHut.setOpeningTime(10, 30);
            
            MenuItem margherita = new MenuItem("Margherita", 12.99, "Pizza");
            MenuItem cola = new MenuItem("Cola", 2.99, "Drink");
            pizzaHut.addMenuItem(margherita);
            pizzaHut.addMenuItem(cola);

            // Create orders
            DineInOrder dineOrder = new DineInOrder(pizzaHut, 5);
            dineOrder.addItem(margherita);
            dineOrder.displayOrderType();
            System.out.println("Dine-in Total: $" + dineOrder.calculateTotal());

            OnlineOrder onlineOrder = new OnlineOrder(pizzaHut, "123 Main St");
            onlineOrder.addItem(cola, "No ice"); // Overloaded method
            onlineOrder.displayOrderType();
            onlineOrder.processPayment(3.50); // Test payment

        } catch (PaymentException e) {
            System.out.println("Payment Error: " + e.getMessage());
        } catch (IllegalArgumentException | InvalidItemException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
        
        System.out.println("Total Orders: " + Restaurant.getTotalOrders());
    }
        
        
        
        
        
    }
 