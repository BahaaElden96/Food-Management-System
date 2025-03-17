/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package foodsystem;

/**
 *
 * @author bahaa
 */
public interface Payment {
      void processPayment(double amount) throws PaymentException;
}
