/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela.ResolucaoTela;

import java.awt.*;

/**
 *
 * @author bruno
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
       Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
              
        System.out.println("My resolution is: ");
        System.out.println("width: "+ size.getWidth());
        System.out.println("heigth: "+size.getHeight());
    }
}
