//This is for those who are a returning player :


package casino_long_project;

import java.util.Scanner; 


public class Returning_Player extends Casino_Long_Project{
    
    private static Scanner input = new Scanner(System.in); 
    
    
    public static void Recall(){
        System.out.println("");
        System.out.println("******************************"); 
        System.out.println("**WELCOME BACK TO THE CASINO**");
        System.out.println("******************************");
        System.out.println("");
        System.out.println("We are glad to see that you have come back!!");
        System.out.println("We just need to ask a few questions before we can let you back into the Casino"); 
        System.out.println("What is your Name?");
        String name = input.next();
        System.out.println("");
        System.out.println("Welcome back " + name); 
        System.out.println("");
        System.out.println("How many Coins do you have to spend today??");
        Coins = input.nextInt(); 
        System.out.println("");
        if(Coins > 200){
            System.out.println("WOW");
            System.out.println("Thats a lot of coins that you have, make sure that you spend them well!"); 
            System.out.println(""); 
        }
        if(Coins == 200){
            System.out.println("That is a good starting point there " + name); 
            System.out.println(""); 
        }
        if(Coins < 200){
            System.out.println("OH!!");
            System.out.println("Thats not a lot of Coins!");
            System.out.println("Make sure that you gamble responsibly " + name); 
            System.out.println(""); 
        }
        
        System.out.println("Anyway, You know the rules:");
        System.out.println("Gamble well and have fun");
        System.out.println("");
        System.out.println("");
        System.out.println(""); 
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
