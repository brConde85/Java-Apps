/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaprogram;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class MediaProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Block Calc
//        System.out.println("Inform two number to calculate the Average");   
        Scanner scan = new Scanner(System.in);
//        System.out.println("Inform a number: ");
//        float num1 = scan.nextFloat();
//        System.out.println("Inform another number: ");
//        float num2 = scan.nextFloat();
//        float med = (num1+num2)/2;
//        System.out.println("Average: "+ med);
//        if(med > 9){
//            System.out.println("Congratulations!");
//        }
//        
//        //Block Age
//        System.out.println("---------------------------");
//        System.out.println("Show Major or Minor of age");
//        System.out.print("Inform your year of birth: ");
//        int yearBirth = scan.nextInt();
//        Date date = new Date();
//        int year = Integer.parseInt(date.toString().substring(24,28));
//        System.out.println(year);
//        year -= yearBirth;
//        System.out.println("You is \""+year+"\" years old.");
//        if(year >= 18){
//            System.out.println("Major");
//        }else{
//            System.out.println("Minor");
//        }
//        
        //Block even or odd
        
        System.out.print("Inform the number: ");
        int num3 = scan.nextInt();
        if(num3%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
        
        
    }
    
}
