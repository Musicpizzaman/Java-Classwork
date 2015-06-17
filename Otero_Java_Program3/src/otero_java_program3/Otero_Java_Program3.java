/**
# CISK-332 
# David Otero
#---------------------------------------------------------
* Class: Otero_Java_Program3
#---------------------------------------------------------
This is a hotel occupancy rate calculator using loops 
for input validation with the number of floors being no more
than ten and what not. I used try catch woot woot. 
#---------------------------------------------------------
 6/8/2015 : Program Creation
 6/10/2015 : completion, and commenting 
#---------------------------------------------------------
* */
package otero_java_program3;

// Import libraries 
import java.util.InputMismatchException;//used in validation
import java.util.Scanner; //scanner is use for inputs

public class Otero_Java_Program3 {

    
    public static void main(String[] args) {
        
        //Companion variable for scanner so I dont have to keep retyping scanner 
        Scanner input = new Scanner(System.in);
        
        //Variables declarations for everything I use
        int numFloor, occRooms, numRoom;
        //I use doubles for the output values and totals 
        //because the output is going to be decimal
        double occRate, totRoom = 0, totOcc = 0;
        
        System.out.print("Enter the number of floors: ");
        //I use a infinite while loop with a try catch for 
        //input validation I also use the Inputmismatch library 
        while (true) {
            try {
                numFloor = input.nextInt();
                if(numFloor>=1 && numFloor<=10)
                {
                    break;
                }
                
            }
            catch (InputMismatchException e) {
                System.out.print("Invalid input."
                        +"\nEnter the number of floors: ");
                input.nextLine();
            }
        }
        //This is the for loop for taking input for each floor of the hotel 
        // the count goes all the way to the max number of floors
        for(int count = 1; count<=numFloor; count++)
        {
            
            System.out.print("Enter the number of rooms on the "+count+" floor: ");
            //I use a infinite while loop with a try catch for 
            //input validation I also use the Inputmismatch library 
            while (true) {
                try {
                    numRoom = input.nextInt();
                    if(numRoom>=1 && numRoom<=10)
                    {
                        totRoom=totRoom+numRoom;
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.print("Invalid input."
                            +"\nEnter the number of rooms on the floors: ");
                    input.nextLine();
                }
            }

            System.out.print("Enter the number of occupied rooms on "+count+" floor: ");

            //I use a infinite while loop with a try catch for 
            //input validation I also use the Inputmismatch library 
            while (true) {
                try {
                    occRooms = input.nextInt();
                    if(occRooms>=0 && occRooms<=numRoom)
                    {
                        totOcc=totOcc+occRooms;
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.print("Invalid input."
                            +"\nEnter the number of occupied rooms on the floors: ");
                    input.nextLine();
                }
            }
        }
        
        //Output for the user 
        occRate = totOcc/totRoom;
        System.out.println("The total occupancy rate for the hotel at the moment is: "+occRate);
        
    }
    
}
