
package TestPackage;

import java.io.File;
import java.util.Scanner;



public class TestClass {
     
   public static void main (String[] args) {
      
    int i=0;   
    String fileName = "/Users/sarwar/NetBeansProjects/userDetails.txt";
    File file = new File(fileName);
    
    
   while (i==0){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter username:");
        String user = keyboard.next();
        System.out.println("Enter password:");
        String pass = keyboard.next();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String[] line = input.nextLine().split(" ");
                if (line[0].equals(user) && line[1].equals(pass)) {
                    System.out.print("Welcome! login has been successful.");
                    i =1;

                     } 
                }
                 if  (i==0) System.out.println("Login has been failed! Try again.");
             } catch (Exception e) {
                 System.out.println(e);} 
        }
   
     }
    
   }
