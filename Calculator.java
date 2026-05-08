import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        boolean continueCalc=true;
        while(continueCalc){
            System.out.print("Enter number 1:");
            double num1=input.nextDouble();
            System.out.print("Enter number 2:");
            double num2= input.nextDouble();
            System.out.print("Enter the operator(+,-,*,/):");
            char operator= input.next().charAt(0);
       double result=0;
            switch(operator){
                case '+':
                    result= num1+num2;
                    break;
                case '-':
                    result= num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                case'/':
                 if(num2!=0){
                    result=num1/num2;
                 }
                else{
                    System.out.print("You cannot enter zero!");
                    continue;
                }
                break;
                 default:
                    System.out.print("Invalid operator!");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.print("Do you want to continue? (yes/no): ");
            String choice= input.next();
            if(choice.equalsIgnoreCase("no")){
                continueCalc=false;
            }
        }
        System.out.print("Calculator closed.");
    }
}