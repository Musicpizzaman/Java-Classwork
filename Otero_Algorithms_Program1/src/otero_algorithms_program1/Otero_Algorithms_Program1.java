/**
# CISK-440 
# David Otero
#---------------------------------------------------------
* Class: Otero_Algorithms_Program1
#---------------------------------------------------------
* The task for this assignment is to write a program that 
* sorted splitMerge1 random array of a user-defined size. The types 
* of sorts are Heap, Quick, and Merge sort each of which 
* have their own unique preferred use cases. The optimal 
* use case is illustrated using BigO of n notation. 
#---------------------------------------------------------
 6/8/2015 : Program Creation completed heapsort
 6/9/2015 : Implemented switch and realized my heap was wrong 
 6/9/2015 : Put in the quicksort using the arrays.sort and fixed heap  
 6/11/2015 : Completion and comments 
 6/17/2015 : Reworked on it, made quick sort, and made BigO counter
#---------------------------------------------------------
* */

//merge sort was a total pain 
// https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/code/MergeSort.java
// the link helped me alot
package otero_algorithms_program1;

// Import libraries 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner; //scanner is use for inputs

public class Otero_Algorithms_Program1 {
        // I count the number of interations that 
        // the algorithm takes to come to a solution
        static int timesThrough = 0;
        
        
	public static void main(String[] args) throws UnsupportedEncodingException, IOException{
            
            // Instantiate a scanner object
            Scanner input = new Scanner( System.in );
                                           
            // I declare my ints for user input
            int max, sortSelection; 
            //I ask the the user the size of the array 
            System.out.println("Please enter the the max number ");
            max = input.nextInt();
            
            // i ask the user for the type of sort
            System.out.println("Please select the sort you would like to use"
                    +"\n1 = Heapsort"
                    +"\n2 = Mergesort"
                    +"\n3 = Quicksort");
            sortSelection = input.nextInt();
            
            // I create the array and set it to max 
            int[] array = new int[max];
		//I clear the zero block of the array
		array[0] = 0;
		// I then generate random number from 1-million 
		for(int i = 1; i < max; i++){
			
			array[i] = (int) (Math.random()*1000000);
			array[0]++; //holds the number of values in the array;
			
			int index = i;
                        
			//I get the current array index in a while loop	
			while(array[index/2]<array[index] && (index/2)!=0){
                            //
                            int temp = array[index/2];
                            array[index/2] = array[index];
                            array[index] = temp;
                            index=index/2;
                        
			}			
		}
		
                //I print out the original set of numbers in the array
		System.out.println("The array to be sorted is:");
		
		for(int i = 0; i < max; i++){
			
			System.out.print(" | " + array[i]);
			
		}
		
		System.out.println(" | ");

		//Sort it 
                switch(sortSelection)
                {
                    case 1:
                        while(array[0]>0){
                            
                            //To start the loop I skip position zero in the array 
                            //by setting my i count to 1 as I loop through the array 
                            
                            for(int i = 0; i < array[0]; i++){
                                
                                timesThrough++;
                                        
                                //I put each number in splitMerge1 temp and 
                                int temp = array[1];
                                array[1] = array[array[0]];
                                array[array[0]] = temp;

                                int index = i;
                                //I once again index the array I am not sure if I have 
                                //to do this but I read somewhere that it is a good thing to do. 
                                while(array[index/2]<array[index] && (index/2)!=0){

                                    int temp1 = array[index/2];
                                    array[index/2] = array[index];
                                    array[index] = temp1;
                                    index=index/2;

                                }

                            }	

                            array[0]--;
			
			}
                        //If I don't put this break the switch doesn't work for some reason. 
                        break;
                    // if 2 was entered in then the case of the merge sort 
                    // begins 
                    case 2:
                        
                        //Send the array to the split method 
                        array=split(array);
                        
                    case 3:
                        while(array[0]>0){
                            
                            //To start the loop I skip position zero in the array 
                            //by setting my i count to 0 as I loop through the array 
                            
                            for(int i = 0; i < array[0]; i++){
                                //increment for each interation
                                timesThrough++;
                                //i pivot from the first cell in the array and if the 
                                //number if greater than the next one I swap them 
                                if(array[i]>array[i+1]){
                                    int temp = array[i];
                                    array[i] = array[i+1];
                                    array[i+1] = temp;
                                }
                                //if number cell number is greater than the zero
                                if (array[i] == array[0]){
                                    
                                }else{ // Then I check if the number is less than
                                    //the previous number and swap acordingly 
                                  if(array[i]<array[i-1]){
                                    int temp = array[i];
                                    array[i] = array[i-1];
                                    array[i-1] = temp;
                                    
                                }  
                                }
                                
                                
                                
                            }	

                            array[0]--;
			
			}
                        break;

                }
			
		//output the sorted array for the user 
		System.out.println("The sorted array is: ");

                    for(int i = 0; i < max; i++){

                            System.out.print(" | " + array[i]);
                    }

                    System.out.println(" | ");
                    // number of interations the sort took to get the answer
                    System.out.println("It took the algorithm " 
                            + timesThrough + " interations to get the array sorted.");

                    try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("quick_100000.txt", true)))) {
                        out.println("\nIt took " + timesThrough + " interations");
                    }catch (IOException e) {
                        //exception handling left as an exercise for the reader
                    }
		
		
	}
        //array spliting method
        public static int[] split(int [] array)
        {   
            //if the array is one in lenght then I just end it 
            // because it is already sorted 
            if(array.length==1)
            {
                return array;
            }
            else{
                //get the largest value that is less than or equal to the array length 
                //for spliting needs
                int n=(int) Math.floor(array.length/2);
                //make the left array
                int left []=new int [n];
                //make the right array
                int right []=new int [array.length-n];

                int i;
                //fill the arrays with vals 
                for(i=0;i<array.length;++i)
                {
                        if(i<n)
                                left[i]=array[i];
                        else
                                right[i-n]=array[i];
                }
                //recursivly send the left and right back to the top
                left=split(left);
                right=split(right);
                //send what I got so far to the merge method
                array=merge(left,right);
                return array;
            }
                
        }
        //array merging method
        public static int[] merge(int [] array,int [] left)
	{
            // I set an int called right equal to the left and array added together
            int right []=new int [array.length+left.length];
            int i,splitMerge1=0,splitMerge2=0;
            
            for(i=0;i<array.length+left.length;++i)
            {
                
                timesThrough++;
                //I set the right temp array to the size of the 
                //top half original array
                if(splitMerge1==array.length)
                {
                        right[i]=left[splitMerge2];
                        ++splitMerge2;
                }
                else //I set the right temp array to the size of the 
                //bottom half original array
                if(splitMerge2==left.length)
                {
                        right[i]=array[splitMerge1];
                        ++splitMerge1;
                }
                else //I then swap spots if needed
                if(array[splitMerge1]>left[splitMerge2])
                {
                        right[i]=left[splitMerge2];
                        ++splitMerge2;
                }
                else
                {
                        right[i]=array[splitMerge1];
                        ++splitMerge1;
                }
            }
            return right;
	}
    
}
