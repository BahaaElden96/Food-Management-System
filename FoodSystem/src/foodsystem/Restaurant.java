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
public class Restaurant {
    private List<MenuItem> menu = new ArrayList<>();
    static int totalOrders;
   int openinghours_h;
   int openinghours_m;
   public void addMenuItem(MenuItem m){
       menu.add(m);
   }
   List<MenuItem>getMenu(){
   return this.menu;
   }
   public void setOpeningTime(int hour, int minute) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid time values: Hour(0-23), Minute(0-59)");
        }
        this.openinghours_h=hour;
        this.openinghours_m=minute;
    }
   public static void incrementOrderCount() {
        totalOrders++;
    }
      public static int getTotalOrders() {
        return totalOrders;
    }
   
   
   
   
   
   
   
   
    
    
    
    
    
    
    
    
    
}
