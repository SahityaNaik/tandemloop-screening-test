// Project Name: Sahitya G Naik
// Problem 1 
// Language: Java

import java.util.*;

public class Problem1{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b : ");
        double b= sc.nextDouble();
        System.out.println("Enter the operation: (add or sub or mul or div)");
        String op= sc.next();
        
        Calculator calc = new Calculator();
        double result = calc.Calculate(a,b,op);
        
        System.out.println("Result is : " + result);
        
    }
}

class Calculator{
    public double Calculate(double a, double b, String operation){
        switch(operation.toLowerCase()){
            case "add": return a+b;
            case "sub": return a-b;
            case "mul": return a*b;
            case "div": return b!=0 ? a/b : 0;
            default:
            System.out.println("Invalid Operation!");
            return 0;
        }
    }
}