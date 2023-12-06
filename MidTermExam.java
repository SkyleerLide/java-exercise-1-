/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mid.term.exam;
// Import the Scanner class
import java.util.Scanner;

public class MidTermExam {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       
   int monthlyPurchaseAmount = 0;
   String membershipType = " ";
   
   
   System.out.println("Enter product number: "); 
 membershipType  = sc.next();

 
   switch (membershipType) {
       
    case "S":
           System.out.println("STANDARD");
         break;
    case "s":
           System.out.println("STANDARD");
         break;     
    case "P":
                System.out.println("PLUS ");
    break;
    case "p":
                System.out.println("PLUS ");
    break;
    case "M":
                System.out.println("PREMIUM");
    break;
    case "m":
                System.out.println("PREMIUM");
    break;
   
   }  
   
   System.out.println("Enter Total Monthly purchase amount: "); 
   monthlyPurchaseAmount = sc.nextInt();
   
  if(monthlyPurchaseAmount < 75 ){
	System.out.println(" Total Monthly purchase amount is = 5% ");
     }
  else if(monthlyPurchaseAmount ==75 ) {
	  System.out.println("Total Monthly purchase amount is = 7.5% ");
	}
  else if(monthlyPurchaseAmount >=149.99 ) {
	  System.out.println("Total Monthly purchase amount is = 7.5% ");
	}
  else if(monthlyPurchaseAmount ==150 ) {
	  System.out.println("Total Monthly purchase amount is = 10% ");
	}         
  else if(monthlyPurchaseAmount >150 ) {
	  System.out.println("Total Monthly purchase amount is = 6% ");
	}         
  else if(monthlyPurchaseAmount <150 ) {
	  System.out.println("Total Monthly purchase amount is = 13% ");
	}         
  else if(monthlyPurchaseAmount >200 ) {
	  System.out.println("Total Monthly purchase amount is = 4% ");
	}         
  else if(monthlyPurchaseAmount ==200 ) {
	  System.out.println("Total Monthly purchase amount is = 15% ");
	}         
           
           
           
           
           
// TODO code application logic here
;
    }
    
}
