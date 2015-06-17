/**
# CISK-332 
# David Otero
#---------------------------------------------------------
* Class: Otero_Java_Program4
#---------------------------------------------------------
I created a program that uses 4 methods including the main one 
to play a game of rock paper scissor with the computer
#---------------------------------------------------------
 6/10/2015 : Program Creation
 6/10/2015 : completion
 6/17/2015 : commenting 
#---------------------------------------------------------
* */
package otero_java_program4;

// Import libraries 
import java.util.InputMismatchException;//used in validation
import java.util.Random;
import java.util.Scanner; //scanner is use for inputs


public class Otero_Java_Program4 {
    
    //I declare public variables to be used in both methods
    static int userChoice = 0, compChoice = 0;
    //Companion variable for scanner so I dont have to keep retyping scanner 
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    
    //my main method
    public static void main(String[] args) {
        
        // I set the random number for the computer
        compChoice = rand.nextInt((3 - 1) + 1) + 1;
        // I output the instructions for the user
        System.out.print("Enter the number:"
                +"\n1 = Rock"
                +"\n2 = Paper"
                +"\n3 = Scissors\n");
        
        //I use a infinite while loop with a try catch for 
        //input validation I also use the Inputmismatch library 
        while (true) {
            try {
                //I take in input
                userChoice = input.nextInt();
                if(userChoice>=1 && userChoice<=3)
                {
                    findWinner();
                    quit();   
                }else{
                    invalid();
                }
                
            }
            catch (InputMismatchException e) {
                invalid();
            }
         
        }
    }
    
    // my winner finder method I should have used case statments 
    private static void findWinner() {
        String winner;
        if(compChoice == userChoice)
        {
            if(compChoice == 1)
                winner = "It's a Rock tie!";
            else if (compChoice == 3)
                winner = "It's a Scissors tie!";
            else
                winner = "It's a Paper tie!";
        }
        else if (compChoice == 1)
        {
            if (userChoice == 3)
                winner = "Rock crushes Scissors - computer wins!";
            else
                winner = "Paper covers Rock - Person wins!";
        }
        else if (compChoice == 3)
        {
            if (userChoice == 1)
                winner = "Rock crushes Scissors - Person wins!";
            else
                winner = "Scissors cuts paper - Computer wins!";
        }
        else
        {
            if (userChoice == 1)
                winner = "Paper covers Rock - Computer wins!";
            else
                winner = "Scissors cut Paper - Person wins!";
        }
        System.out.println(winner);
    }
    //my quit method
    private static void quit() {
        String userQuit;
                    
        System.out.println("Do you want to exit? Y or N");

        userQuit = input.next();
        String toUpperCase = userQuit.toUpperCase();

        if("Y".equals(toUpperCase)){
            System.exit(0);
        }else{
            System.out.print("Enter the number:"
                +"\n1 = Rock"
                +"\n2 = Paper"
                +"\n3 = Scissors\n");
        } 
    }
    //my invalid input method
    private static void invalid() {
        System.out.print("Invalid input."
                        +"\nTry Again");
        input.nextLine();
    }

}
