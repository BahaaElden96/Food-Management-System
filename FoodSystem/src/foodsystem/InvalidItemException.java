/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodsystem;

/**
 *
 * @author bahaa
 */
public class InvalidItemException extends RuntimeException{
     public InvalidItemException(String message) {
        super(message);
    }
}
