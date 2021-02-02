//Getting new player to have a username and a coin wallet: 
package casino_long_project;

import java.util.Scanner;

public class NewPlayer {
    
    private static Scanner input = new Scanner(System.in); 
   
    
    public static void Create(){
        System.out.println("");
        System.out.println("All players need a username");
        System.out.println("What would you like your username to be?");
        System.out.println("Please enter an appropriate username:");
        String Username = input.next(); 
        System.out.println("");
        System.out.println("Hello, " + Username); 
        System.out.println("You will start with 200 coins!");
        System.out.println("Have fun!");
        System.out.println(""); 
        System.out.println("Here are the general rules of the Casino!");
        System.out.println("Make sure ou gamble well and have lost of fun");
        System.out.println("");
        System.out.println("");
        System.out.println(""); 
    }
    
    
    
}


