import java.util.Random;
import java.util.Scanner;

public class PartTwo{

    public static void main(String [] args){

        
    Random mog=new Random();
    int diceOne=1+mog.nextInt(6);
    int diceTwo=1+mog.nextInt(6);
   int diceRolled=0;
    int userGuess=0;
   int dicetotal;
   int MIN_DICE=2;
   int MAX_DICE=12;
 Scanner joe=new Scanner(System.in);
 
 
 System.out.println("Two dice have been rolled for you. You have to three pre guesses to guess the number");
 dicetotal=diceOne+diceTwo;
 System.out.println(dicetotal);


 for(diceRolled=1; diceRolled<=3; diceRolled++) {
    System.out.println("please choose the numbers you beilieve the dice will be. ");
    userGuess=joe.nextInt();
     
     }
     if (dicetotal==userGuess) {
        System.out.println("you win one of the three guesses was correct");
        
     }
     else if (dicetotal!=userGuess) {
        System.out.println("You loose \n Computer:HAHAHA");
     }
    else {

    }
        
    }
   

    
 }







