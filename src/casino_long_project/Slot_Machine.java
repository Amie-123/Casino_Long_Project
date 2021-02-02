//This is where the Slot Machine Game will be coded: 

package casino_long_project;

import java.util.Scanner;
import java.util.Random; 

public class Slot_Machine extends Casino_Long_Project{
    
    private static Scanner input = new Scanner(System.in); 
    private static Random rand = new Random(); 
    
    public static void game2(){
        
        System.out.println("");
        System.out.println("This is the Slot Machine Game");
        System.out.println(""); 
        
        boolean repeat = true; 
        Coins = Coins; 
        
        while(repeat == true){
            
            int max = 10;
            int min = 1;
            int random1 = rand.nextInt((max-min)+min)+1;
            int random2 = rand.nextInt((max-min)+min)+1;
            int random3 = rand.nextInt((max-min)+min)+1;
            
            System.out.println("How much are you betting on this game");
            int bet = input.nextInt(); 
            if(bet > Coins){
                System.out.println("You do not have this much money");
                System.out.println(""); 
                game2(); 
            }
            
            if(bet < Coins){
                System.out.println("You have betted " + bet + " on this game");
                System.out.println("Good Luck!"); 
                System.out.println(""); 
            }
            
            
            System.out.println("");
            System.out.println("***********************************");
            System.out.println("***********************************");
            System.out.println("**********SLOT IS SPINNING*********");
            System.out.println("***********************************");
            System.out.println("***********************************");
            System.out.println(random1);
            System.out.println(" " + random2);
            System.out.println("  "  + random3); 
            System.out.println("The slots say...");
            System.out.println(" " + random1 + " " + random2 + " " + random3 + ""); 
            System.out.println(""); 
            
            if(random1 == random2 && random2 == random3){  
                System.out.println("");
                System.out.println("YOU WIN!!"); 
                Coins = Coins + bet;
                System.out.println("This means you have " + Coins + " Coins"); 
            }
            
            
            if(random1 == random2 && random2 != random3){
                System.out.println("");
                System.out.println("Two are the same...");
                System.out.println("This means you win half your bet"); 
                bet = bet / 2;
                Coins = Coins + bet; 
                System.out.println("You now have " + Coins + " Coins"); 
            }
            
            
            if(random1 == random3 && random2 != random3){
                System.out.println("");
                System.out.println("Two are the same...");
                System.out.println("This means you win half your bet"); 
                bet = bet / 2;
                Coins = Coins + bet; 
                System.out.println("You now have " + Coins + " Coins"); 
            }
            
            if(random3 == random2 && random2 != random1){
                System.out.println("");
                System.out.println("Two are the same...");
                System.out.println("This means you win half your bet"); 
                bet = bet / 2;
                Coins = Coins + bet; 
                System.out.println("You now have " + Coins + " Coins"); 
            }
            
            
            if(random1 != random2 && random2 != random3){
                System.out.println("");
                System.out.println("You Lost!");
                System.out.println("This means you have to pay your bet"); 
                Coins = Coins - bet; 
                System.out.println("You now have " + Coins + " Coins"); 
            }
            
            
            System.out.println("");
            System.out.println("Would you like to Spin agian?");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int choice = input.nextInt(); 
            
            
            if(choice == 1){
                System.out.println("");
                repeat = true; 
            }
            
            if(choice == 2){
                System.out.println("");
                System.out.println("Okay, Hope you had fun!!"); 
                System.out.println("Your Coins at the end of this game are " + Coins);
                System.out.println(""); 
                repeat = false; 
            }
            
            
            
            
        }
        
        
        
        
        
    } 
    
    
    
    
}
