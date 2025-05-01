/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thoai.functionalinterfaces_lambdaexpressions;

/**
 *
 * @author QA19
 */
public class FunctionalInterfaces_LambdaExpressions {

    public static void main(String[] args) {
        //(parameter list) -> lambda body
      //Lambda expression;
      Mynumber num, num1;
    num = () -> 12.3;
    num1 = () -> 1 + 3;
        System.out.println(num.getValue());
        System.out.println(num1.getValue());
    num1 = () -> {
            int counter = 1;
            int sum = 0;
            while (counter<5)
            {
                sum = sum + counter;
                counter++;
            }
            
            return sum;
        };        
        System.out.println("The value is " + num1.getValue());
        
        MyNumberPara num2;
        
        num2 = (n, m) -> n + m;
        System.out.println("The value is " + num2.getValue2(2, 3));
        
        num2 = (n, m) -> {
            if (n > 10)
		return m;
            else
		return m+1;
        }; 
        System.out.println("The value is " + num2.getValue2(3, 9));
        //System.out.println("The value is " + num2.getValue2(3, 9.1));
        
    }
    
    @FunctionalInterface
    interface Mynumber{
        double getValue();
    }
        @FunctionalInterface
        interface MyNumberPara{
            double getValue2(int n, int m); 
        }
}
