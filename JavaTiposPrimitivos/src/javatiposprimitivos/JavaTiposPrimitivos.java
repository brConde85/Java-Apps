/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class JavaTiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Exibir dados
        String nome = "Bruno";
        float nota = 9.5f;
        System.out.println("Sua nota é: " + nota + " era isso!!!");
        System.out.printf("A nota de %s é: %.2f\n", nome, nota);
        
        // Inserir e exibir dados
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String inserirNome = keyboard.nextLine();        
        System.out.println("Informe sua nota: ");
        float inserirNota = keyboard.nextFloat();        
        System.out.format("A nota de: %s | foi: %.2f \n", inserirNome, inserirNota);
        
        // Transformar dados        
        
        /* Inteiro para string*/
        int idade = 36;
        String nota2 = Integer.toString(idade);
        System.out.format("Dados transformados: %s\n", nota2);
        
        /* String para int*/        
        String age = "36";
        int number = Integer.parseInt(age);
        System.out.println(number);
        
        /* String para float*/
        float age2 = Float.parseFloat(age);
        System.out.println(age2);
        
    }
}
