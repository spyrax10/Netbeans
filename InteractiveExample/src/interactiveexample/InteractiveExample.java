/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactiveexample;

import java.util.Scanner;

/**
 *
 * @author EmmanuelSal
 */
public class InteractiveExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name, heshe = "";
        int age, daystill = 0 , retirement = 70;
        
        double gpa;
        boolean isFemale;
        
        System.out.print("Enter student's name: ");
        name = input.nextLine();
        System.out.print("Enter student's gpa: ");
        gpa = input.nextDouble();
        System.out.print ("Enter student's age: ");
        age = input.nextInt();      
        System.out.print("Are you Female? (true/false): "); 
        isFemale = input.nextBoolean();
        heshe = isFemale ? "She" : "He";
        daystill = retirement - age;
        
        System.out.printf("%s is %d years old (%d years to retirement. %s has a %4.2f gpa.\n", name , age , daystill , heshe , gpa);
    }
    
}
