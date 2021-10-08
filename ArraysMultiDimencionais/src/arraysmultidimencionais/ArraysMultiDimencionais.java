/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmultidimencionais;

/**
 *
 * @author bruno
 */
public class ArraysMultiDimencionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] meses = {
            "janeiro","fevereiro","março",
            "abril","maio","junho",
            "julho","agosto","setembro",
            "outubro","novembro","dezembro"
        };
        
        int [] dias1 = new int[31];
        for(int i = 1; i < dias1.length; i++){
            dias1[i] = i;
        }
        // Simulando que os meses tenham 30 dias
        for(int i = 0; i < meses.length; i++){
             System.out.println("Mes:"+meses[i]);
            for(int j = 1; j < dias1.length; j++){               
                System.out.println("DIA:"+dias1[j]);
            }
        };
        
        int [][][] dias = new int [5][2][3];
        
        dias[0][0][0] = 1;
        dias[0][0][1] = 2;
        dias[0][0][2] = 3;
        
        dias[0][1][0] = 4;
        dias[0][1][1] = 5;
        dias[0][1][2] = 6;
        
        dias[1][0][0] = 7;
        dias[1][0][1] = 8;
        dias[1][0][2] = 9;
        
        dias[1][1][0] = 10;
        dias[1][1][1] = 11;
        dias[1][1][2] = 12;
        
        dias[2][0][0] = 13;
        dias[2][0][1] = 14;
        dias[2][0][2] = 15;
        
        dias[2][1][0] = 16;
        dias[2][1][1] = 17;
        dias[2][1][2] = 18;
        
        dias[3][0][0] = 19;
        dias[3][0][1] = 20;
        dias[3][0][2] = 21;
        
        dias[3][1][0] = 22;
        dias[3][1][1] = 23;
        dias[3][1][2] = 24;
        
        dias[4][0][0] = 25;
        dias[4][0][1] = 26;
        dias[4][0][2] = 27;
        
        dias[4][1][0] = 28;
        dias[4][1][1] = 29;
        dias[4][1][2] = 30;
        
        
        for(int [][] data: dias){
        for(int [] dia : data){
            for(int num : dia){
                System.out.println("num: "+ num);
            }
        }}
        
        for(int i = 0; i < dias.length; i++){
            for(int j = 0; j < dias[i].length; j++){
                for(int k = 0; k <= dias[j].length; k++){                                        
                    if(dias[i][j][k] < 10){
                        System.out.println("DiaFor: 0"+dias[i][j][k]);
                    }else{
                        System.out.println("DiaFor: "+dias[i][j][k]);
                    }
                }                
            }
        }
//        "baseDia" é uma variavel de referencia que sera utilizado 
//        enquanto o for estiver sendo utilizado
        for(int[][] baseDia1 : dias){
            for(int [] dia : baseDia1){
                for(int diaA : dia){
                     if(diaA < 10){
                        System.out.println("DiaForeach: 0" + diaA);
                    }else{
                        System.out.println("DiaForeach: " + diaA);
                    }
                   
                }
                
            }
        }     


//        int [] [] arrayTeste = new int [3][];
        int [][]arrayTeste= { {0,0},{1,2,3},{1,2,3,4,5,6,} };




    }    
}
