import java.util.Random;
import java.util.Scanner;
import java.util.*;
    public class RNG {
    private int count=0;
    private  int randNum;
    int lowGuess=0;
    int highGuess=99;
    public RNG() {count++;}
    
    public  void resetCount()
    {
        count = 0;
        
    }
    public void Count() {
        count++;
    }
    public int rand(int limit) 
    {
        Random rand = new Random();
        randNum = rand.nextInt(limit);
        return randNum;
    }
     public  int getCount() 
    {
        return count;
    }
    public  boolean inputValidation(int nextGuess){
         if (nextGuess==randNum){
            
            System.out.println("Congratualtions, you have guessed correctly.");
            return true;
        }
        
        if(nextGuess > highGuess || nextGuess < lowGuess){
            System.out.println("   >>>Guess must be between "+lowGuess+" and "+highGuess+".   Try again.");
        }
        else if(nextGuess < randNum)
        {
             lowGuess=nextGuess;
             System.out.println("Your Guess is too low");
        }
        else if (nextGuess > randNum)
        {
            highGuess=nextGuess;
            System.out.println("Your Guess is too high");
            
        }
        
            return false;
    }
    }