//Showing the player the rules of each of the games they will choose: 

package casino_long_project;


public class Rules {
    
    public static String HorLRules(){
        System.out.println("");
        System.out.println("Here are the rules for Higher or Lower:");
        System.out.println("You will be given a card at random");
        System.out.println("You will then have to guess whether the next card to be drawn will the Higehr or Lower");
        System.out.println("If you get the answer right, what every you betted will be added to your coin wallet"); 
        System.out.println("If you get the answer wrong, what ever you betted will be removed and given to the house"); 
        System.out.println("You will be able to contnue to play until you exit the game"); 
        System.out.println("Each round that you play, you will be betting the same amount unless you quit and change it"); 
        return "";   
}
    
    
    
    public static String SMRules(){
        System.out.println("");
        System.out.println("Here are the rules for the Slot Machine game:");
        System.out.println("You will place a bet on how likley you think all three slots will be the same"); 
        System.out.println("You will then spin the slots and wait for the results");
        System.out.println("If none of the numbers are the same, you will loose all you have betted");
        System.out.println("If two of the numbers are the same, you will get half of what you betted");
        System.out.println("If all of the numbers are the same, you will get all the money that you betted"); 
        return ""; 
        
    }
    
    
    
    public static String BRules(){
        System.out.println("");
        System.out.println("Here are the rules for BlackJack");
        System.out.println("You will be given two cards (aces low)");
        System.out.println("You will then have the option to be given another card");
        System.out.println("The aim is to get the closest result to 21 that you can");
        System.out.println("If you go above 21, you will loose what you betted");
        System.out.println("If you beat the house then you will get what you betted"); 
        return ""; 
    }
    
    
    
    
    
}
