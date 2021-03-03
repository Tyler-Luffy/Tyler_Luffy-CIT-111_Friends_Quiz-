/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacit.pkg111.pkgclass;


import java.util.Scanner;
/**
 *
 * @author Tyler
 */
public class Friend_Quiz {

    private static Scanner inputScanner;

    @SuppressWarnings("empty-statement")
     public static void main(String[] args) {
       
         //Variables
       int userscore = 0;
       final int userscore_THRESHOLD = 9;
       int userinput = 0;
       boolean passedtest = false;
       
       //Awnser Values
       
       int Q_One_Awnser = 5;
       int Q_Two_Awnser = 4;
       int Q_Three_Awnser = 3;
       int Q_Four_Awnser = 2;
       int Q_Five_Awnser = 1;
       int Wrong_Awnser = 0;
       
       //points for questions
        inputScanner = new Scanner(System.in);
         
        //Question 1
        
         System.out.println("Question 1");
         System.out.println("Do you watch or have interest in anime?");
         System.out.println("Enter 1 for yes and 2 for no.");
         
         userinput = inputScanner.nextInt();
         
         if(userinput == 1){
         userscore = userscore + Q_One_Awnser;
         }
         else{ 
             userscore = userscore + Wrong_Awnser;
             }
         
         //Question 2
         
         System.out.println("Question 2");
         System.out.println("Do you enjoy Starwars, Marvel, Lord of the ring, or anyother kind of fantasy/sci-fi universes?");
         System.out.println("Enter 1 for yes and 2 for no.");
         
         userinput = inputScanner.nextInt();
         
         if(userinput == 1){
         userscore = userscore + Q_Two_Awnser;
         }
         else{ 
             userscore = userscore + Wrong_Awnser;
             }
         
         //Question 3
         
         System.out.println("Question 2");
         System.out.println("Do you watch or participate in sports?");
         System.out.println("Enter 1 for yes and 2 for no.");
         
         userinput = inputScanner.nextInt();
         
         if(userinput == 1){
         userscore = userscore + Q_Three_Awnser;
         }
         else{ 
             userscore = userscore + Wrong_Awnser;
             }
         
         //Question 4
         
         System.out.println("Question 2");
         System.out.println("Do you play video games?");
         System.out.println("Enter 1 for yes and 2 for no.");
         
         userinput = inputScanner.nextInt();
         
         if(userinput == 1){
         userscore = userscore + Q_Four_Awnser;
         }
         else{ 
             userscore = userscore + Wrong_Awnser;
             }
         
         //Question 5
         
         System.out.println("Question 2");
         System.out.println("Have you ever been to Burgatory");
         System.out.println("Enter 1 for yes and 2 for no.");
         
         userinput = inputScanner.nextInt();
         
         if(userinput == 1){
         userscore = userscore + Q_Five_Awnser;
         }
         else{ 
             userscore = userscore + Wrong_Awnser;
             }
         
         if(userscore >= userscore_THRESHOLD){
         System.out.println("Perhaps we could be friends? But you're gonna have to put up with me and I can be quite the pain.");
         passedtest = true;
         }
         else{
         System.out.println("We probably shouldn't be friends. That's okay though, I'm awful anyways.");
         }
         
    }
}
