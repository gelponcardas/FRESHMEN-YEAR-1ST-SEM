
package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        char operation;
        double a;
        double b;
        double c;
        int use;
       
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
            System.out.println("Thank You For Using This Stupid Calculator :)");
            System.out.println("Thank You For Using This Stupid Calculator :)");
            System.out.println("Thank You For Using This Stupid Calculator :)");
            System.out.println("Thank You For Using This Stupid Calculator :)");
            System.out.println("Thank You For Using This Stupid Calculator :)");
            System.out.println("Thank You For Using This Stupid Calculator :)");
            System.out.println("Thank You For Using This Stupid Calculator :)");  
            System.exit(0);
        }
          } while (true);
    }
    
}
