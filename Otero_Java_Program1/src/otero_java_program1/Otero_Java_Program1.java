/**
# CISK-332 
# David Otero
#---------------------------------------------------------
* Class: Otero_Java_Program1
#---------------------------------------------------------
This is a program that asks the user to enter a bunch of info 
ranging from adjective, Present tense verb, and all the way to plural noun. 
As the user enters these values, the program should save the values 
in appropriately named variables. To then output them in a madlib
* for the user based on their BDAY. WOOT
#---------------------------------------------------------
 6/1/2015 : Program Creation
 6/2/2015 : Program Completion and Commenting 
#---------------------------------------------------------
* */

package otero_java_program1;

// Import libraries 
import java.util.Scanner; //scanner is use for inputs

public class Otero_Java_Program1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        //Variables list and they are all string because I want to and it makes sense. 
        //Furthermore I could have used an array but decided it is not appropiate at this time. 
        String adj;//1
        String ptv;//2
        String ptv1;//3
        String ptv2;//4
        String endWithING;//5
        String plural;//6
        String adj1;//7
        String ptv3;//8
        String endWithING1;//9
        String plural1;//10
        String adj2;//11
        String animal;//12
        String ptv4;//13
        String sing;//14
        String plural2;//15
        String plural3;//16
        String num;//17
        String plural4;//18
        
        // Prompt the user for input using a combination 
        System.out.print( "Type adjective: ");
        adj = input.next();
        System.out.print( "Type past tense verb: ");
        ptv = input.next();
        System.out.print( "Type past tense verb: ");
        ptv1 = input.next();
        System.out.print( "Type past tense verb: ");
        ptv2 = input.next();
        System.out.print( "Type verb ending in ing: ");
        endWithING = input.next();
        System.out.print( "Type plural noun: ");
        plural = input.next();
        System.out.print( "Type adjective: ");
        adj1 = input.next();
        System.out.print( "Type past tense verb: ");
        ptv3 = input.next();
        System.out.print( "Type verb ending in ing: ");
        endWithING1 = input.next();        
        System.out.print( "Type plural noun: ");
        plural1 = input.next();
        System.out.print( "Type adjective: ");
        adj2 = input.next();
        System.out.print( "Type animal: ");
        animal = input.next();
        System.out.print( "Type past tense verb: ");
        ptv4 = input.next();
        System.out.print( "Type Singular Noun: ");
        sing = input.next();
        System.out.print( "Type plural noun: ");
        plural2 = input.next();
        System.out.print( "Type plural noun: ");
        plural3 = input.next();
        System.out.print( "Type number: ");
        num = input.next();
        System.out.print( "Type plural noun: ");
        plural4 = input.next();
        
        //output for what the user entered 
        System.out.println("You entered: "+ptv1+""+adj+" "+ptv+" "+ptv2+" "+endWithING
                +"\n "+plural+" "+adj1+" "+ptv3+""+endWithING1+" "+plural1+"\n "+adj2+" "+animal+" "+ptv4
                +" "+sing+" "+plural2+"\n "+plural3+" "+num+" "+plural4);
        
        //Instructions and taking input from the user
        System.out.println("What is your B-Day?");
        System.out.println("Enter month number");
        String month = input.next();
        System.out.println("Enter day number");
        String day = input.next();
        
        //Convert string to integer if user enters a word then the program will crash
        int i = Integer.parseInt(month);
        int q = Integer.parseInt(day);
        
        //Error checking if the user enters anything out what I want then the program terminates. 
        if(i>12 || i<0 || q<0 || q>31)
        {
            System.out.println("invaild input");
            System.exit(0);
        }
        
        //Here is the switch/case statements which to compare the month number the user entered 
        switch(i) 
        {
            //This basically repeats over and over 
            // but basically once the month is in the correct case 
            // I change the month string originally entered to text and 
            // compare the days of each month to match the horoscope. for the day. 
            case 1:  
                month = "January";
                if(q>=20 && q<=31)
                {
                   System.out.println("Here is your Horoscope for " + month + " " + day);
                   System.out.println("Unless you organize your "
                           +plural3+" better, you won't get anything done.");
                   break; 
                } else
                {
                   System.out.println("Here is your Horoscope for " + month + " " + day);
                   System.out.println("You may receive some "
                           +plural2+" from a secret admirer! Water them \nevery day, and they will last a long time.");
                   break; 
                }
            
            case 2:  
                month = "February";
                if(q>=1 && q<=18)
                {
                    System.out.println("Here is your Horoscope for " 
                            + month + " " + day);
                    System.out.println("Unless you organize your "
                           +plural3+" better, you won't get anything done.");
                    break;
                }else 
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("A good friend will give you $"
                            +num+" to buy new "
                            +plural4+". Be sure to thank your friend");
                    break;
                }
            
            case 3:  month = "March";
            if(q>=21 && q>=31)
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Someone you know may be feeling "+adj+". Stay out of the way!");
                    break;
                }else 
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("A good friend will give you $"
                            +num+" to buy new "
                            +plural4+". Be sure to thank your friend");
                    break;
                }
                
            case 4:  month = "April";
            if(q>=1 && q<=19)
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Someone you know may be feeling "
                            +adj+". Stay out of the way!");
                    break;
                }else 
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Don't "
                            +ptv+" in public. It could prove embarrassing.");
                    break;
                }
            case 5:  month = "May";
            if(q>=1 && q<=20)
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Don't "
                            +ptv+" in public. It could prove embarrassing.");
                    break;
                }else 
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Control the urge to "
                            +ptv1+". "+ptv2+" instead.");
                    break;
                }
            case 6:  month = "June";
            if(q>=1 && q<=20)
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Control the urge to "
                            +ptv1+". "+ptv2+" instead.");
                    break;
                }else 
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println(endWithING+" too many "+plural+" will leave you exhausted!");
                    break;
                }
            case 7:  month = "July";
            if(q>=1 && q<=22)
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println(endWithING+" too many "+plural+" will leave you exhausted!");
                    break;
                }else 
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("A loved one thinks you are "
                            +adj1+". Do not be taken in by flattery.");
                    break;
                }
            case 8:  month = "August";
            if(q>=1 && q<=22)
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("A loved one thinks you are "
                            +adj1+". Do not be taken in by flattery.");
                    break;
                }else 
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println(ptv3+" in private when possible. It's difficult to concentrate when people are watching.");
                    break;
                }
            case 9:  month = "September";
            if(q==10)
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println(ptv3+" in private when possible. It's difficult to concentrate when people are watching.");
                    break;
                }else 
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Avoid "+endWithING1+" "+plural1+".");
                    break;
                }
            case 10: month = "October";
            if(q==10)
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Avoid "+endWithING1+" "+plural1+".");
                    break;
                }else 
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Never loan money to "+adj2+animal+"! They are poor credit risks.");
                    break;
                }
            case 11: month = "November";
            if(q==10)
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Never loan money to "+adj2+animal+"! They are poor credit risks.");
                    break;
                }else 
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Today is a good day to "+ptv4+" a(n) "+sing+".");
                    break;
                }
            case 12: month = "December";
            if(q==10)
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("Today is a good day to "+ptv4+" a(n) "+sing+".");
                    break;
                }else 
                {
                    System.out.println("Here is your Horoscope for " + month + " " + day);
                    System.out.println("You may receive some "
                           +plural2+" from a secret admirer! Water them \nevery day, and they will last a long time.");
                    break;
                }
            default: 
                month = "Invalid month";
                day = "Invalid day";
                System.out.println("Here is your Horoscope for " + month + " " + day);
                break;	
        }
 
    }
    
}
