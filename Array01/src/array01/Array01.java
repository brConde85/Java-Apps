/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array01;

/**
 *
 * @author bruno
 */
public class Array01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] idades = new int[3];
        idades[0] = 36;
        idades[1] = 28;
        idades[2] = 14;
        
        String [] nomes = {"Bruno","Bruna","Leo"};
        
        for (String nome : nomes) {
            System.out.println("nomes: " + nome);
        }        
        
        for(int idade: idades){
            System.out.println("idades: " + idade);
        }
        
    }
    
}
