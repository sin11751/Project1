/**
 * Project Deliverable 1
 * Name - Eternals
 * Members - 5
 * Date - March 11, 2022
 */

package project1;

import java.util.Scanner;


public class Project1 {

    
    public static void main(String[] args) {
     System.out.println("                  Guess game");   // name of the game
     System.out.println("-----------------------------------------------");
     System.out.println();
    System.out.println("// Please enter a positive number below ten  //"); // user has to enter a postive number between 0 and 9
    int turn=1;
    int confirm=0;
       try{
       while (confirm==0){  
               System.out.print("Enter number:-");
    Scanner num=new Scanner (System.in);
    int uvalue = num.nextInt(); // number entered by user is saved in uvalue
    int cvalue = (int)(Math.random()*11); // random number choosed by computer using Math.random
      
   
        while(uvalue!=cvalue) // if the uvalue is not equal to cvalue user is asked to enter the number until it is equal
        {  turn++;
            if (uvalue>cvalue) //condition that would tell uvalue is greater than cvalue is it's smaller else would work
            {System.out.println(uvalue +" is greater than than the Computer choosed number");
            System.out.println();  
            System.out.println("Enter an another number");// user is asked to enter the number again and if user enterd same number as computer game will be over, if not user will again be asked to enter a number again
              System.out.print("-->");
              uvalue = num.nextInt();}
        
          else
            {System.out.println(uvalue +" is smaller than than the Computer choosed number");
              System.out.println();
               System.out.println("Enter an another number");
                System.out.print("-->");
              uvalue = num.nextInt();}
         
          }
       
      
    
       System.out.println("Player choose the right number after "+ turn + " turn"); // would display after how many turns user got the same number as computer
       System.out.println();
       System.out.println("If player want to play more then enter '0' for 'YES' and '1' for 'NO'"); // confirmation if the user want to play again or not
               System.out.print("-->");
              confirm= num.nextInt();
              // if user will write 0 then again will start and if the user will write 1 then on screen it will show End game and would exit game
              if(confirm==0)
             {System.out.println();
                 System.out.println("-------------------  NEW GAME ----------------------------------- ");} 
              
             if(confirm==1)
             {System.out.println();
                 System.out.println("-------------------- END GAME -------------------------------- ");}
        }
    }
               
               
            
               
    
  catch(Exception e)
      { System.out.println("Please enter a positive number only");      }}  }           
