/**
# CISK-332 
# David Otero
#---------------------------------------------------------
* Class: Otero_Java_Program2
#---------------------------------------------------------
Write a program that prompts the user to select
“feet”, “miles”, or “furlongs”. 
Then I have them enter an amount in inches and then the 
calculator converts the inches to what ever the user selected
#---------------------------------------------------------
 6/3/2015 : Program Creation, completion, and commenting 
#---------------------------------------------------------
* */

package otero_java_program2;


// Import libraries 
import java.util.Scanner; //scanner is use for inputs


public class Otero_Java_Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Companion variable for scanner so I dont have to keep retyping scanner 
        Scanner input = new Scanner( System.in );
        
        // I only am going to use variable due to laziness 
        int num;
        
        // Here is the prompt for the user
        System.out.println("Enter numbers 1,2,or 3"
                +"\n1 = Feet"
                +"\n2 = mile"
                +"\n3 = Furlong");
        
        // take in the user's int input  
        // program will crash if it is not int
        num = input.nextInt();
        
        
        // Here I am going to go to the function based on what the user wanted to do. 
        if(num==1)
        {
            //Here is the Prompt for the user to enter the number of inches 
            System.out.println("How many inches do you want to convert? ");
            // take in the user's int input  
            // program will crash if it is not int
            num = input.nextInt();
            //convert inches to feet 
            //I use double just for decimal possiblities 
            double feet = num/12;
            //output
            System.out.println("There are rounded up to the nearest number. "+feet+" feet in "+num+" inches");
                    
        }else if(num==2)
        {
            //same as the function above
            System.out.println("How many inches do you want to convert? ");
            num = input.nextInt();
            double miles = num/63360;
            System.out.println("There are rounded up to the nearest number. "+miles+" miles in "+num+" inches");
        }else if(num==3)
        {
            //same as the function above
            System.out.println("How many inches do you want to convert? ");
            num = input.nextInt();
            double fur = num/7920;
            System.out.println("There are rounded up to the nearest number. "+fur+" furlongs in "+num+" inches");
        }else
        {
            //error checking if the user put something not wanted 
            System.out.println("Invaild Input");
        }
   
    }
    
}
