//Where the main program will be ran: 
package casino_long_project;

import java.util.Scanner;
import java.util.Random; 


public class Casino_Long_Project {
    
    private static Scanner input = new Scanner(System.in); 
    private static Random rand = new Random(); 
    
    public static int Coins = 0; 
   
    public static void main(String[] args) {
        
        //Getting the intro from class: 
        System.out.println(Formalities.Intro()); 
        
        PlayerType(); 
   
    }
    
    
    
    
    public static void PlayerType(){
        //Getting them to make an account or find their old one 
        System.out.println("Are you a New Player (1) or a Returning Player (2)");  
        int PlayerType = input.nextInt();
        
        
        if(PlayerType == 1){
            NewPlayer.Create(); 
            Coins = 200; 
            PlayGames(); 
   
        }
        
        
        if(PlayerType == 2){
            Returning_Player.Recall();
            PlayGames(); 
        }
    }
    
    
    
    //Where the games will be kept, they can choose game and to see rules of the game:
    public static void PlayGames(){
        boolean Play = true;
        while(Play == true){
            System.out.println("1 - Higher or lower");
            System.out.println("2 - Slot Machines");
            System.out.println("3 - BlackJack"); 
            System.out.println("4 - Exit Casino"); 
            System.out.println("Input the number of the game you want to play"); 
            int option = input.nextInt(); 
            switch(option){
                case(1):
                    case1(); 
                    break; 
                
                case(2):
                    case2(); 
                    break;
                    
                case(3):
                    case3(); 
                    break; 
                    
                case(4):
                    System.out.println(""); 
                    System.out.println("*******************************************");
                    Formalities.Outro(); 
                    System.out.println("You have " + Coins + " To take home"); 
                    System.out.println("");
                    System.out.println("*******************************************");
                    Play = false; 
                    break; 
                    
            }
            
        }
        
    }
    
    
    
    
    
    
    
    public static void case1(){
        System.out.println("");
        System.out.println("1 -- Rules of Game");
        System.out.println("2 -- Play the Game");
        System.out.println("Please choose a number from selection above");
        int option2 = input.nextInt(); 
        switch(option2){
            case(1):
                Rules.HorLRules(); 
                case1(); 
                break;
            
                
                 
            case(2):
                Higher_or_Lower.Game1();
                break; 
        }
    }
    
    
    
    public static void case2(){
        System.out.println("");
        System.out.println("1 -- Rules of Game");
        System.out.println("2 -- Play the Game"); 
        System.out.println("Please choose a number from above selection");
        int option3 = input.nextInt(); 
        switch(option3){
            case(1):
                Rules.SMRules();
                case2(); 
                break; 
                
                 
            case(2):
                Slot_Machine.game2();
                break; 
        }
    }
    
    
    
    public static void case3(){
        System.out.println("");
        System.out.println("1 -- Rules of Game");
        System.out.println("2 -- Play the Game"); 
        System.out.println("Please choose a number from selection above");
        int option4 = input.nextInt(); 
        switch(option4){
            case(1):
                Rules.BRules();
                case3(); 
                break;
                
              
            case(2):
                BlackJack.game3();
                break; 
        }
    }
    
    

    
   
    
   
    
    
    
    
}
