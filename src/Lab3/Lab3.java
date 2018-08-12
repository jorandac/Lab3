package Lab3;

import java.util.Scanner;

public class Lab3 { 

	static Scanner reader = new Scanner(System.in);
	static char Answer;  //Static variable means between all instances of that class

	public static void main(String[] args) { 
		Scanner scnr = new Scanner(System.in);
	
		do { 
	
		  System.out.println("Enter a number between 1 and 100");
          int num = scnr.nextInt(); // Scanner to ask for user input 	
        
          
          if (num % 2 == 0 && num >= 2 & num <= 25) {  // If user inputs even number ranging from 2-25  
              System.out.println("Even and less than 25");
          } 
          
          else if (num % 2 == 0 && num >= 26 && num <= 60) { // If user inputs even number ranging from 26-60 
        	  System.out.println("Even");
          } 
          
          else if (num % 2 == 0 && num > 60) {  //If user inputs even number greater than 60
              System.out.println(num  +  " Even");
          } 
          
          else if (num > 60) {   //If user inputs odd number greater than 60
              System.out.println(num +  " Odd and over 60");
          } 
          
          else {
              System.out.println(num +  " Odd"); //Output if any conditions above are not met 
          }
          System.out.println();    
          System.out.println("Continue? Y/N "); 
          Answer = reader.next().charAt(0); //(charAt) Taking character input from scanner  
		}
		while (Answer == 'y');  //If user input is equal to y
		}
}



         
              
          
    
       

	