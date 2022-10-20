
package odd.even.checker;

import java.util.Scanner;

public class OddEvenChecker {

    public static void main(String[] args) {
    
    Scanner input=new Scanner(System.in);
    double n;  
    int use;    
        System.out.println("");
        System.out.print("    Welcome to my Checker ");
        System.out.println("\tcredits to @gelpo");
        System.out.println("");
   
        do{  
                
        System.out.println("Use Checker?");
        System.out.print("1 = YES  "); 
        System.out.println("  2 = NO");
        use  = input.nextInt();
        
        if(use==1) {
              
                System.out.println("");
                System.out.println("\t---CHECK---");
                System.out.print("Enter the number: ");
                n = input.nextDouble();
                
                if (n%2==0) {
                    System.out.println(n +" is even ");
                    System.out.println("");
                    
                }
                else if (n%2==1){
                    System.out.println(n +" is odd");
                    System.out.println("");
                }              
             }
        else if(use==2){
            System.out.println("");
            System.out.println("Thank You For Using This Stupid Checker :)");
            System.out.println("Thank You For Using This Stupid Checker :)");
            System.out.println("Thank You For Using This Stupid Checker :)");
            System.out.println("Thank You For Using This Stupid Checker :)");
            System.out.println("Thank You For Using This Stupid Checker :)");
            System.out.println("Thank You For Using This Stupid Checker :)");
            System.out.println("Thank You For Using This Stupid Checker :)");
            System.out.println("Thank You For Using This Stupid Checker :)");  
            System.exit(0);
            }
        }while(true);           
    }
}
