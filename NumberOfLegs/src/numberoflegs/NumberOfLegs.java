/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberoflegs;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class NumberOfLegs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Funny program exemplify number of legs");
        System.out.println("--------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Inform number of legs: ");
        int legs = scan.nextInt();
        switch (legs){
            case 1:
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("Biped");
                break;
            case 4:
                System.out.println("Quadruped");
               break;
            case 6:
                System.out.println("Spider");
                break;
            case 8:
                System.out.println("Spider");
                break;
            default:
                System.out.println("Outher...");
                break;
        }      
    }   
}
