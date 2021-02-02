//This is where the BlackJack Game will be Coded: 

package casino_long_project;

import java.util.Scanner;
import java.util.Random;

public class BlackJack extends Casino_Long_Project{
    
    private static Scanner input = new Scanner(System.in); 
    private static Random rand = new Random(); 
    
    
    public static void game3(){
        
        System.out.println("");
        System.out.println("This is BlackJack"); 
        System.out.println(""); 
        
        boolean repeat = true; 
        Coins = Coins; 
        
        
        while(repeat == true){
            
            int max = 13;
            int min = 1; 
            int random = rand.nextInt((max-min)+min)+1; 
            int random2 = rand.nextInt((max-min)+min)+1;
            int random3 = rand.nextInt((max-min)+min)+1;
            

            System.out.println("How much would you like to bet on this game?");
            int bet = input.nextInt(); 
            
            if(bet > Coins){
                System.out.println("");
                System.out.println("You dont have this money to bet");
                game3(); 
            }
            
            if(bet < Coins){
                System.out.println("");
                System.out.println("You have betted " + bet + " on this game");
                System.out.println("Good Luck"); 
                System.out.println(""); 
            }
            
            
            
            if(random == 1){
                System.out.println("Your first card is... ACE(1)"); 
            }   
            if(random == 11){
                System.out.println("Your first card is... JACK(11) ");
            }   
            if(random == 12){
                System.out.println("Your first card is... QUEEN(12)");
            }
            if(random == 13){
                System.out.println("Your first card is... KING(13)"); 
            }
            else{
                System.out.println("Your card is... " + random); 
            }
            
            
            if(random2 == 1){
                System.out.println("Your second card is... ACE(1)"); 
            }   
            if(random2 == 11){
                System.out.println("Your second card is... JACK(11) ");
            }   
            if(random2 == 12){
                System.out.println("Your second card is... QUEEN(12)");
            }   
            if(random2 == 13){
                System.out.println("Your second card is... KING(13)"); 
            }
            else{
                System.out.println("Your second card is... " + random2);
            }

            
            
            int total = random + random2; 
            System.out.println("");
            System.out.println("Your total so far is... " + total); 
            
            if(total == 21){
                System.out.println("WELL DONE, YOU HAVE WON"); 
                Coins = Coins + bet;
                System.out.println("You now have " + Coins + " Coins"); 
                System.out.println("");
                System.out.println("Would you like to play another round");
                System.out.println("1 - Yes, 2 - No"); 
                int choice = input.nextInt(); 
                if(choice == 1){
                    repeat = true;
                }
                if(choice == 2){
                    System.out.println("");
                    System.out.println("Okay, Your total coins is now " + Coins + " coins"); 
                    System.out.println("");
                    repeat = false; 
                }
            }
            
            
            
            System.out.println("Would you like another card?"); 
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int anotherCard = input.nextInt(); 
            
            switch(anotherCard){
                case(1):
                    System.out.println(""); 
                    System.out.println("Your third card is..." + random3);
                    total = total + random3; 
                    System.out.println("The total is now " + total); 
                    if(total == 21){
                        System.out.println("WELL DONE, YOU HAVE WON"); 
                        Coins = Coins + bet;
                        System.out.println("You now have " + Coins + " Coins"); 
                        System.out.println("");
                        System.out.println("Would you like to play another round");
                        System.out.println("1 - Yes, 2 - No"); 
                        int choice = input.nextInt();
                        if(choice == 1){
                            repeat = true;
                        }
                        if(choice == 2){
                            System.out.println("");
                            System.out.println("Okay, Your total coins are " + Coins); 
                            System.out.println("");
                            repeat = false; 
                        }
                    }
                    
                    if(total > 21){
                        System.out.println("");
                        System.out.println("This means that you have LOST");
                        Coins = Coins - bet; 
                        System.out.println("You now have " + Coins + " coins"); 
                        System.out.println("");
                        System.out.println("Would you like to play another round?");
                        System.out.println("1 - Yes, 2 - No"); 
                        int choice = input.nextInt();
                        if(choice == 1){
                            repeat = true; 
                        }
                        if(choice == 2){
                            System.out.println("");
                            System.out.println("Okay, Your final amount of coins is " + Coins); 
                            System.out.println("");
                            repeat = false; 
                        }
                        
                       
                    }
                    
                    if(total < 21){
                        int extra = 21 - total; 
                        System.out.println("This means that your are " + extra + " away from 21"); 
                        if(extra > 2){
                            System.out.println("");
                            System.out.println("This means that you have LOST"); 
                            Coins = Coins - bet; 
                            System.out.println("You now have " + Coins + " Coins"); 
                            System.out.println("");
                            System.out.println("Would you like to have another round");
                            System.out.println("1 - Yes, 2 - No"); 
                            int choice = input.nextInt(); 
                            if(choice == 1){
                                repeat = true;
                            }
                            if(choice == 2){
                                System.out.println("");
                                System.out.println("Okay, Your final coins are " + Coins);
                                System.out.println("");
                                repeat = false; 
                            }
                        }
                    }  
                    break;
                
                    
                case(2):
                    System.out.println("");
                    System.out.println("Okay, your final total is... " + total); 
                    int extra = 21 - total;
                    System.out.println("This means that you are " + extra + " away from 21");
                    if(extra < 2){
                        System.out.println(""); 
                        System.out.println("This means that you have WON!!");
                        Coins = Coins + bet;
                        System.out.println("You now have " + Coins + " Coins"); 
                        System.out.println("Would you like to play another round?");
                        System.out.println("1 - Yes, 2- No"); 
                        int choice = input.nextInt(); 
                        if(choice == 1){
                            repeat = true;
                        }
                        if(choice == 2){
                            System.out.println("");
                            System.out.println("Okay, Your final amount of coins is " + Coins); 
                            System.out.println(""); 
                            repeat = false;
                        }
                    }
                    
                    if(extra > 2){
                        System.out.println(""); 
                        System.out.println("This means that you have LOST");
                        Coins = Coins - bet; 
                        System.out.println("You now have " + Coins + " Coins");
                        System.out.println("Would you like to play another round?");
                        System.out.println("1 - Yes, 2 - No");
                        int choice = input.nextInt();
                        if(choice == 1){
                            repeat = true; 
                        }
                        if(choice == 2){
                            System.out.println("");
                            System.out.println("Okay, Your final amount of coins is " + Coins); 
                            System.out.println("");
                            repeat = false; 
                        }
                    }
                    break; 
                    
                    
            }
            
            
            
            
            
            
            
            
            
            
        }
        
        
        
        
    }
    
    
    
    
    
    
    
    }
