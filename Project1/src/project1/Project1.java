
package project1;

import java.util.Scanner;


public class Project1 {

    
    public static void main(String[] args) {
     System.out.println("                  Guess game");  
     System.out.println("-----------------------------------------------");
     System.out.println();
    System.out.println("// Please enter a positive number below ten  //");
    int turn=1;
    int confirm=0;
       
       while (confirm==0){
               System.out.print("Enter number:-");
    Scanner num=new Scanner (System.in);
    int uvalue = num.nextInt();
    int cvalue = (int)(Math.random()*11);
    
        while(uvalue!=cvalue)
        {  turn++;
            if (uvalue>cvalue)
            {System.out.println(uvalue +" is greater than than the Computer choosed number");
            System.out.println();  
            System.out.println("Enter an another number"); 
              System.out.print("-->");
              uvalue = num.nextInt();}
        
          else
            {System.out.println(uvalue +" is smaller than than the Computer choosed number");
              System.out.println();
               System.out.println("Enter an another number");
                System.out.print("-->");
              uvalue = num.nextInt();}
         
          }
      
       System.out.println("Player choose the right number after "+ turn + " turn");
       System.out.println();
       System.out.println("If player want to play more then enter '0' for 'YES' and '1' for 'NO'");
               System.out.print("-->");
              confirm= num.nextInt();
              
              if(confirm==0)
             {System.out.println();
                 System.out.println("-------------------  NEW GAME ----------------------------------- ");} 
              
             if(confirm==1)
             {System.out.println();
                 System.out.println("-------------------- END GAME -------------------------------- ");}
        }
    }
               
               
            
               
    }              

    

