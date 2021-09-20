/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema.HoraDoSistema;

import java.util.Date;

/**
 *
 * @author bruno
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Date clock = new Date();
        System.out.println("The hour of system is:" + clock.toString());
    }
}
