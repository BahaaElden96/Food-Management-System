/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodsystem;

/**
 *
 * @author bahaa
 */
public class DineInOrder extends Order{
    private int tableNumber;

    public DineInOrder(Restaurant restaurant, int tableNumber) {
        super(restaurant);
        if (tableNumber <= 0) {
            throw new IllegalArgumentException("Invalid table number");
        }
        this.tableNumber = tableNumber;
    }

    @Override
    public void displayOrderType() {
        System.out.println("Dine-in Order - Table: " + tableNumber);
    }
}
