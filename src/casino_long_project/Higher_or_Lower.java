//This is where the higher or lower game code will be stored: 

package casino_long_project;

import java.util.Scanner;
import java.util.Random;

public class Higher_or_Lower extends Casino_Long_Project {
    
    private static Scanner input = new Scanner(System.in); 
    private static Random rand = new Random(); 
    
    
    public static void Game1(){
        System.out.println("");
        System.out.println("This is the higher or lower game"); 
        System.out.println(""); 
        
        boolean repeat = true; 
        Coins = Coins; 
        
        while(repeat == true){
            int max = 13;
            int min = 1;
            int PlayerCard = rand.nextInt((max-min)+1)+min;
            int HouseCard = rand.nextInt((max-min)+1)+min; 
            
            
            System.out.println("How much money are you betting on this game?"); 
            int bet = input.nextInt(); 
            if(bet > Coins){
                System.out.println("You dont have this much money!!"); 
                Game1();
            }
            
            if(bet < Coins){
                System.out.println("");
                System.out.println("You have betted " + bet + " on this game!");
                System.out.println("Good Luck"); 
            }
            
            
            
            if(PlayerCard == 1){
                System.out.println("Your card is... ACE(1)"); 
            }
                
            if(PlayerCard == 11){
                System.out.println("Your card is... JACK(11) ");
            }
                
            if(PlayerCard == 12){
                System.out.println("Your card is... QUEEN(12)");
            }
                
            if(PlayerCard == 13){
                System.out.println("Your card is... KING(13)"); 
            }
                
            else{
                System.out.println("Your card is... " + PlayerCard); 
            }
            
            
            System.out.println("");
            System.out.println("Higher or Lower?"); 
            String HorL = input.next(); 
            System.out.println("");
            
            if(HorL.equalsIgnoreCase("Higher") && HouseCard > PlayerCard){
                System.out.println("The next card is....." + HouseCard); 
                System.out.println("This means you are Correct!!");
                Coins = Coins + bet; 
                System.out.println("You have " + Coins + " Coins in you coin wallet");
            }
            
            if(HorL.equalsIgnoreCase("Higher") && HouseCard < PlayerCard){
                System.out.println("The next card is....." + HouseCard);
                System.out.println("This means you are Incorrect!!!!"); 
                Coins = Coins - bet; 
                System.out.println("You have " + Coins + " Coins in you coin wallet");
            }
            
            if(HorL.equalsIgnoreCase("Lower") && HouseCard < PlayerCard){
                System.out.println("The next card is....." + HouseCard);
                System.out.println("This means you are Correct!!!");
                Coins = Coins + bet;
                System.out.println("You have " + Coins + " Coins in you coin wallet");
            }
            
            
            if(HorL.equalsIgnoreCase("Lower") && HouseCard > PlayerCard){
                System.out.println("The next card is....." + HouseCard);
                System.out.println("This means you are Incorrect");
                Coins = Coins - bet;
                System.out.println("You have " + Coins + " Coins in you coin wallet");
            }
            
            
            if(HouseCard == PlayerCard){
                System.out.println("The next card is....." + HouseCard);
                System.out.println("This means you had the same value card");
                System.out.println("This means nothing happens"); 
                Coins = Coins;
                System.out.println("You have " + Coins + " Coins in you coin wallet");
            }
            
            
            System.out.println("");
            System.out.println("Would you like to play this game again?");
            System.out.println("YES or NO");
            String choice = input.next(); 
            
            if(choice.equalsIgnoreCase("yes")){
                repeat = true; 
            }
            
            if(choice.equalsIgnoreCase("no")){
                System.out.println("You have " + Coins + " Coins in you coin wallet after this game");
                repeat = false;
                
            }
            
            
        }
        
        
        
    }
    
    
    
    
    
    
    
    
}
