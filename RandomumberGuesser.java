/*

 * Instructor: Gary Thai
 * Description: Build an application that will receive a guess and report if the guess is the random number that was generated.  Your application will narrow down the choices according to the previous guesses and continue to prompt the user to enter a guess until they guess it correctly.  
 * Due: 2/25/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here:Delwende Josue Ouedraogo
*/

import java.util.Random;
import java.util.Scanner;
import java.util.*;

//Driver Class//
public class RandomumberGuesser{

	//main method
    public static void main(String args[]) {
    	//creating Scanner object   
     Scanner sc = new Scanner(System.in); 
     while(true){
    	//required variables declaration  
     int nextGuess;
     int highGuess=99;
     int lowGuess=0;
     //creating RNG class object
     RNG rc=new RNG();
     rc.resetCount();
   //generating random number by calling rand() method

     int randNum = rc.rand(highGuess+1);
    
     while(true) {
     if(rc.getCount()==0)
    	//asking user for input the number
     System.out.println("Enter your first guess");
     else 
    	//asking user for input the number
     System.out.println("Enter your next guess between "+lowGuess+ " and " + highGuess);
   //taking input from user
     nextGuess=sc.nextInt();
     rc.Count();
     int guess = rc.getCount();
     //output number
     System.out.println("Number of guess is " + guess);
     
     if(rc.inputValidation(nextGuess)){
          break;
      }
      else {
           if(nextGuess >= highGuess || nextGuess<= lowGuess){
           continue;
        }
        else if(nextGuess > randNum){
           highGuess=nextGuess;
        }
        else if (nextGuess < randNum){
            lowGuess=nextGuess;
        }
      }
      
     }
     //asking user to try again or not
      System.out.println("Do you want to try again . (yes or no)");
      //declaring variables
      String ans = sc.nextLine();
       Scanner in = new Scanner(System.in); 
       ans = in.nextLine();
       
    // if yes , setting count of guess to zero by calling resetCount() method
      if(ans=="no" || ans=="No"){
          System.out.println("Thanks for playing ");
          break;
      }
      else if(ans=="yes" || ans=="Yes")
      {
    	  //if yes, setting the end of game
          System.out.println("Thanks for playing ");
          continue;
      }
      else {
          break;
     }
      
    }
}
}//end of program