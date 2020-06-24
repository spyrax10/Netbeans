/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author spyrax10
 */
public class Proj {

    /**
     * @param args the command line arguments
     */
    
    
   public static void back(){
       Scanner mem = new Scanner(System.in);
       boolean check = true; 
       
       do{
            System.out.println("Go back to menu?(Y/N): ");
            String cho = mem.nextLine();
               
            if (cho.equals("Y") || cho.equals("y")){
                 dispMen();
                 check = true;
                   
            }
            else if (cho.equals("N") || cho.equals("n")){
                  System.out.println("Bye Bye!");
                  check = true;
            }
            else if (!cho.equals("Y") || 
                    !cho.equals("y") ||
                    !cho.equals("N") ||
                    !cho.equals("n")){
                    
                 System.out.println("Invalid Selection!");
                 check = false;
            }
       }
       while (!check);
       
   } 
   
   public static void addNum(){
       Scanner scan = new Scanner(System.in);
       Scanner cho = new Scanner(System.in);
       Scanner cho1 = new Scanner(System.in);
       
       boolean check = true;
       int sum;
       
       try{
            System.out.println("Enter a number: ");
            int val = scan.nextInt();
            System.out.println("Your Number is: " + val);
            
           do{
               
            System.out.println("Do you want to add that number?(Y/N): ");
            String sel = cho.nextLine();
            
            if (sel.equals("N")|| sel.equals("n")){  
                
                back();
                check = true;
                
            }
            else if (sel.equals("Y") ||
                    sel.equals("y")) {
                
                try{
                     System.out.println("Enter a number to add: ");
                     int val1 = cho1.nextInt();
                     sum = val += val1;
                     System.out.println("Your new number: " + sum);
                     check = false;
                }
                catch(Exception e){
                     System.out.println("Invalid charcter!");
                     check = false;
                }
            }
            else{
                System.out.println("Invalid Selection!");
            }
            
          
           } 
           while(!check);
        
       }
       catch(InputMismatchException e){
         System.out.println("Invalid!");
       }
       
   }
   public static void zeroInp(){
       Scanner zer = new Scanner(System.in);
      
       try{
           
            System.out.println("\nEnter number to print:");
            int val = zer.nextInt();
            System.out.println("\n");
                
            for (int i = 0; i <= val; i++){
                System.out.println(i);   
            }
            back();
       }
       catch(Exception e){
            System.out.println("Invalid Character!");
       }
   }
   public static void dispMem(){
       
       System.out.println("\nName of Developers:");
       System.out.println("Linus Torvalds");
       System.out.println("Antonio Luna");
       System.out.println("Eric Snowden");
       System.out.println("Elon Musk \n");
       back();
   }
    
   public static void dispMen(){
       Scanner scan = new Scanner(System.in);
       boolean check = true; 
     
       try{
        
            do{
        
           System.out.println("\f");
           System.out.println("Menu List: ");
           System.out.println("1. Print Zero to Input");
           System.out.println("2. Add numbers by Input");
           System.out.println("3. Name of Developers");
           System.out.println("4. Exit \n");
           System.out.println("Enter your choice: ");
           int cho = scan.nextInt();
        
            if (cho == 1){
                zeroInp();
                check = true;
            }
            else if (cho == 2){
                addNum();
                check = true;
            }
            else if (cho == 3){
                dispMem();
                check = true;
            }
            else if (cho == 4){
                 System.out.println("Bye Bye!");
                 check = true;
            }
            else if (cho > 4){
               System.out.println("Out of range!");
               check = false;
            }
            else if (cho == 0){
               System.out.println("Invalid Selection!");
               check = false;
            }
        } 
        while(!check);
                
        }
        catch(Exception e){
        System.out.println("Invalid Character!");     
        }
  
   }
    
    public static void main(String[] args) {
       dispMen();
    }
    
}
