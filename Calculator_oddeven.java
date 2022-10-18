
import java.util.Scanner;


public class Calculator_oddeven {
    
        public static void main(String[] args) {
      
        
        Scanner input = new Scanner (System.in);
        int use;
        int calculator; 
do{
        System.out.println("1 For Stupid Calculator");
        System.out.println("2 For Odd/Even Checker");
        System.out.println("3 To Exit");
        System.out.println("Choose Type Of Calculator...");    
        calculator = input.nextInt();

        switch (calculator) {
            
 case 1: {
do{
        System.out.print("    Welcome to my Calculator ");
        System.out.println("\tcredits to @gelpo");
        System.out.println("");
        do{
        char operation;
        double a;
        double b;
        double c;

        System.out.println("Use Calculator?");
        System.out.print("1 = YES  "); 
        System.out.println("  2 = NO");
        use  = input.nextInt();
        
        if(use==1){
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
        System.out.println("1 For Stupid Calculator");
        System.out.println("2 For Odd/Even Checker");
        System.out.println("3 To Exit");
        System.out.println("Choose Type Of Calculator...");    
        calculator = input.nextInt();
            break; 
        }
        }while (true);
      } while(calculator==1);     
   }       
 case 2: {
        System.out.print("    Welcome to my Checker ");
        System.out.println("\tcredits to @gelpo");
        System.out.println("");
        do{
        
        
        do{
        System.out.println("Use Checker?");
        System.out.print("1 = YES  "); 
        System.out.println("  2 = NO");
        use  = input.nextInt();
             
                if(use==1){
                System.out.println("");
                System.out.println("\t---CALCULATE---");
                System.out.println(" Enter the number: ");
                double n;
                n=input.nextInt();
                if (n%2==0) {
                    System.out.println(n +" is even ");
                    System.out.println("");
                    break;
                }
                else if (n%2==1){
                    System.out.println(n +" is odd");
                    System.out.println("");
                    break;           
             }
                }
                else if(use==2){      
        System.out.println("Enter Any Key To Continue...");    
        calculator = input.nextInt();
            break; 
        }
         
          
      } while(true);  
   }while(calculator==2);
}
 
            
          }      
        } while(true);
      }  
    } 