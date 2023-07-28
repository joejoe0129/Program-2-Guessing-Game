//Jordan Joseph
//1/13/23
// The program simulates a guessing game. The computer picks a random number from 0 to 100 and the user has to guess it. After each guess the computer gives the user clues like Too high or Too low. When the user guesses the correct answer, the computer prints off You got it! and then reports how many guesses it took them. 
import java.util.Scanner;
public class Main {
  public static void main(String[] args) 
  {
     
    Scanner scan = new Scanner(System.in);
    int number = (int)(Math.random()*100) + 0; //the numbers
    int bill = 0;
    int guess = 1000;

    System.out.println("guess a number from 0 to 100");
    while(number != guess){ //the rules
    guess = scan.nextInt();

    if(guess == number){ //the same
      bill++;
      System.out.println("you got it! It took you " + bill + " tries.");  
       }
    else if(guess > number){  //more
      System.out.println("Too high!");
      bill++;
       }
    else{ //less
      System.out.println("Too low!");
      bill++;
       }

    }  
  }
}   