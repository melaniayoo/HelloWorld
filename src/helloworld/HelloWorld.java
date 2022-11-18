/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;
/**
 *
 * @author melania.yoo
 */
public class HelloWorld {
    
    public static void main(String[] args) 
  {
        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println("Sum: "+sum);
  }
}
    /**
     * @param args the command line arguments
     */
   
        // TODO code application logic here
 
    
