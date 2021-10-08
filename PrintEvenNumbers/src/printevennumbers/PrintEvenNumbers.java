/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printevennumbers;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class PrintEvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        // TODO code application logic here
        int parcela = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor do veiculo R$ ");
        double valor = scan.nextDouble();
        while(parcela <= valor){
            double valorParcela = valor/parcela;
            if(valorParcela < 1000){
                System.out.println("eraIsso...");
                break;               
            }
            System.out.println(String.format("divide em ate: %d  R$ %.2f", parcela,valorParcela));
            parcela++;
        }
    }
    
}
