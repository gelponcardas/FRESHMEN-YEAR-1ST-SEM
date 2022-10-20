
package calculator.plus.checker;

import java.util.Scanner;

public class CalculatorPlusChecker {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        char operation;
        double a;
        double b;
        double c;
        double n; 
        int use;
        int calculator;
        
        do{
            System.out.println("------------------");
            System.out.println("1 For Calculator");
            System.out.println("2 For Checker");
            System.out.println("3 To Exit");
            System.out.println("------------------");
            System.out.print("Choose: "); calculator = input.nextInt();
            
            switch (calculator) {
                
                case 1 ->{
                    System.out.println("");
                    System.out.print("    Welcome to my Calculator ");
                    System.out.println("\tcredits to @gelpo");
                    System.out.println("");
        
  do{
 
        System.out.println("Use Calculator?");
        System.out.print("1 = YES  "); 
        System.out.println("  2 = NO");
        use  = input.nextInt();
       
        if (use==1){
        System.out.println("");
        System.out.println("\t---CALCULATE---");   
        a  = input.nextDouble();
        System.out.print("");System.out.print(a+" ");
        operation=input.next().charAt(0);
        b = input.nextDouble();

            switch (operation) {
                case '+':
                    do {
                        c=(a+b);     
                        System.out.println(a + " + "  +  b + " = " + c);
                        System.out.println("");
                        break;
                        
                    }while (operation=='+');
                    break;
                case '-':
                    do {
                        c=(a-b);
                        System.out.println(a + " - "  +  b + " = " + c);
                        System.out.println("");
                        break;
                        
                    }while (operation=='-');
                    break;
                case '*':
                    do {
                        c=(a*b);
                        System.out.println(a + " * "  +  b + " = " + c);
                        System.out.println("");
                        break;

                    }while (operation=='*');
                    break;
                case '/':
                    do{ 
                        c=(a/b);
                        System.out.println(a + " / "  +  b + " = " + c);
                        System.out.println("");
                        break;
                        
                    }while (operation=='/');
                    break;
                case 'x':
                    System.exit(0);
                default:
                    System.out.println("Invalid Operation!");
                    break;
            }
        } 
        else if(use==2){
            System.out.println("");
            System.out.println("Thank You For Using This Stupid Calculator :)");
            System.out.println("");
            break;
        }
          } while (true);
                    
                }
                case 2 ->{
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
            System.out.println("");
            break;
            }
        }while(true);
                    
                }
                case 3 -> {      
            
                    System.exit(0);
                    
                }
            }
            
        }while(true);
    }
    
}
