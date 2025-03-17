/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bahaa
 */
public abstract class Order {
    //Animal a =new Cat();
     protected List<MenuItem> items;
    protected Restaurant restaurant;
public Order(Restaurant restaurant) {
        if (restaurant == null) {
            throw new IllegalArgumentException("Restaurant cannot be null");
        }
        this.restaurant = restaurant;
        this.items = new ArrayList<>();
        Restaurant.incrementOrderCount();
    }
    public void addItem(MenuItem item) {
        if (!restaurant.getMenu().contains(item)) {
            throw new InvalidItemException("Item not in menu: " + item.getName());
        }
        items.add(item);
    }
public double calculateTotal() {   
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }
  public abstract void displayOrderType();  
}
